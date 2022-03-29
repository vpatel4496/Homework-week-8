package Homeworkweek8;

public class V9FibonacciNumber {
    public static void main(String[] args){
        fibonacci();
    }
    public static void fibonacci(){
        int maxNumber=8;
        int previousNumber=1;
        int nextNumber=1;
        System.out.print("Fibonacci Series of" + maxNumber + "numbers:");
        for(int i=1; i<=maxNumber;++i){
        System.out.print(previousNumber+ " ");
        int sum=previousNumber+nextNumber; previousNumber=nextNumber=sum;}
    }
}

