package cylinder;

public class Cylinder extends Circle{
    double height;
    Cylinder(double radius, double height) {
        super(5.55);
        if (height < 0) {
            height = 0;
        } else {
            this.height = height;
        }
    }
        public double getHeight() {
            return height;
        }
           public double getVolume(){
            double volume=getArea()*height;
            return volume;

        }


    }

