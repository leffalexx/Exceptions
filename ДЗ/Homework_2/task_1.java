package Homework_2;


import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        boolean nextNumber = true;
        Scanner sc = new Scanner(System.in);
        while (nextNumber){
            System.out.println("Input float number");
            try {
                float num = Float.parseFloat(sc.nextLine());
                System.out.println(num);
                nextNumber = false;
            } catch(NumberFormatException e) {
                System.out.println("Error. Input float number");
            }
        }
        sc.close();
    }
    
}
