package Homeworkweek8;

//public class V16Point {
    public class V16Point {
    int x;
    int y;

    V16Point() {
    }

    V16Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((0 - this.getX()) * (0 - this.getX()) + (0 - this.getY()) * (this.getY()));
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.getX()) * (x - this.getX()) + (y - this.getY()) * (y - this.getY()));
    }

    public double distance(V16Point second) {
        return Math.sqrt((second.getX() - this.getX()) * (second.getX() - this.getX()) + (second.getY() - this.getY()) * (second.getY() - this.getY()));
    }

    public static void main(String[] args) {
        V16Point first = new V16Point(6,5);
        V16Point second = new V16Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        V16Point point = new V16Point();
        System.out.println("distance()= " + point.distance());
    }

}
