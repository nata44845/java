// Реализовать простой калькулятор (+-/*)

import java.util.Scanner;

public class task3 {
    static String calc(int a, int b,String op){
        switch (op) {
            case "+": 
                return String.format("%d",a+b); 
            case "-": 
                return String.format("%d",a-b);
            case "*": 
                return String.format("%d",a*b);
            case "/": 
                if (b==0) return "error";
                return String.format("%d",a/b);
        }
        return "error";
    }
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in,"cp866");
        System.out.print("Введите число 1: ");
        int num1 = sk.nextInt();
        sk.nextLine();
        sk.close();

        System.out.print("Введите операцию: ");
        String op = sk.next();
        sk.nextLine();

        System.out.print("Введите число 2: ");
        int num2 = sk.nextInt();
        sk.nextLine();
        System.out.print(calc(num1,num2,op));
    }
}
