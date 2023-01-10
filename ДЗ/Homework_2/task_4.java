package Homework_2;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text: ");
        String givenText = sc.nextLine();
        if (givenText.isEmpty()) {
            throw new RuntimeException("You really need to type something! ");
        }
        System.out.println(givenText);
        sc.close();
    }
    
}
