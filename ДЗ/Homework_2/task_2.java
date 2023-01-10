package Homework_2;

public class task_2 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 8, 99, 87, 1, 0, 74, 31};
        int d = 0;
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         
    }
    
}
