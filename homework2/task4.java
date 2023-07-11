//К калькулятору из предыдущего ДЗ добавить логирование.

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task4 {
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
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task4.class.getName());
		logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("task4.log", true);
		logger.addHandler(fh);
		SimpleFormatter sFormat = new SimpleFormatter ();
		fh.setFormatter(sFormat);

        Scanner sk = new Scanner(System.in,"cp866");
        System.out.print("Введите число 1: ");
        int num1 = sk.nextInt();
        sk.nextLine();

        System.out.print("Введите операцию: ");
        String op = sk.next();
        sk.nextLine();

        System.out.print("Введите число 2: ");
        int num2 = sk.nextInt();
        sk.nextLine();
        sk.close();

        String val=calc(num1,num2,op);
        System.out.printf("%d%s%d=$s",num1,op,num2,val);
        logger.info(String.format("%d%s%d=%s",num1,op,num2,val));
    }
}
