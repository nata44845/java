// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, 
// которая состоит из чередующихся символов c1 и c2, начиная с c1.
import java.util.Scanner;

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in,"cp866");
        System.out.print("Введите число: ");
        int count = sk.nextInt();
        sk.nextLine();

        System.out.print("Введите a: ");
        String a = sk.nextLine();
        System.out.print("Введите b: ");
        String b = sk.nextLine();
        sk.close();

        StringBuilder sb = new StringBuilder();
        for (int i =0; i<count/2; i++){
            sb.append(a);
            sb.append(b);
        }

        if (count%2==1) sb.append(a);
            

        System.out.printf("%s",sb);
    }
}