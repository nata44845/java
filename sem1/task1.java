import java.nio.charset.Charset;
import java.util.Scanner;

/**
 * program
 */
public class task1 {
    public static void main(String[] args) {
        // Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
        // Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”


        Scanner sk = new Scanner(System.in,"cp866");
        System.out.print("Введите имя пользователя: ");
        String name = sk.nextLine();
        System.out.printf("Привет, %s",name);
    }
    
}