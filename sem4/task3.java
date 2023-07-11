// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида text
// 1. Нужно сохранить text в стек.
// 2. Если введено print, выводит стек

import java.util.Scanner;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
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
                if (str.equals("print")){
                    while(!st.empty()){
                        System.out.print(st.pop()+" ");
                    }
                    System.out.println();
                } else
                {
                    st.push(str);
                }
                System.out.println(st);
            }
        } 
    }
}
