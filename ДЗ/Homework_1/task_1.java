package Homework_1;
import java.util.Scanner;
import java.util.InputMismatchException;
public class task_1 {

public static int showIndex (int[] array, int x){
    if (x > array.length) {
        throw new ArrayIndexOutOfBoundsException( "Out of bounds!");
    }
    return array[x];

}

public static float divisionOfTwoInts (float x, float y) {
    if (y == 0)
        throw new ArithmeticException("Division by zero!");
    float result = x / y;
        return result;
}

public static int ui() throws InputMismatchException{
    System.out.println("Сколько дисков в игре?");
    Scanner sc = new Scanner(System.in);
    int i = 0;
    try{
        i = sc.nextInt();
        System.out.println("Выводим алгоритм для " + i + " дисков: ");
    }catch(InputMismatchException e){
        sc.next();
        System.out.println("Вы ввели не число. Попробуйте снова.");
    }
    sc.close();
    return i;
}

    public static void main(String[] args) {
        int [] x = {55, 78, 54, 333};
        System.out.println(showIndex(x, 4));

        System.out.println(divisionOfTwoInts(5.0f, 0.0f));
        
        int n = ui();
        System.out.println(n);         
    }
}