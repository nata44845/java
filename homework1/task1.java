// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// 1 + 2 + 3 1*2*3

import java.util.Scanner;

/**
 * program
 */
public class task1 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in,"cp866");
        System.out.print("Введите число: ");
        int n = sk.nextInt();
        sk.close();
        System.out.printf("Треугольное число %d = %d",n,n*(n+1)/2);
        System.out.println();
        int fact = 1;
        for (int i=2; i<=n; i++) {
            fact *=i;
        }
        System.out.printf("Факториал %d = %d",n,fact);
    }
   
}