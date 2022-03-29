package Homeworkweek8;

public class V14Dimond {
    public static void main(String[] args){
        // Right Triangle
        for (int i=1; i<8; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // Downward Triangle
        for (int i=7; i>=1; i--){
            for (int j=1; j<=i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}





