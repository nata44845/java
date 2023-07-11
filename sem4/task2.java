import java.util.LinkedList;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида text
// 1. Нужно сохранить text в связный список.
// 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка


public class task2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        boolean exit = false;
        Scanner sk = new Scanner(System.in); 
        String str;
        while (!exit) {
            str = sk.nextLine();
            if (str.equals("exit"))
            {
                exit = true;
            }
            else {
                if (str.startsWith("print~")){
                    System.out.println(ll.remove(Integer.parseInt(str.substring(6))));
                } else
                {
                    ll.add(str);
                }
                System.out.println(ll);
            }
        } 
    }
}
