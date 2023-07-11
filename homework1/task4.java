// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
// Под знаком вопроса - одинаковые цифры
// Введите уравнение: ?? + ?? = 44
// Ответ: 22 + 22 = 44

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in,"cp866");
        System.out.print("Введите уравнение: ");
        String equa = sk.nextLine();
        sk.close();

        String equaTemp;
        boolean flag=false;
        for (char i='0'; i<='9';i++)
        {   equaTemp = equa.replace('?', i);
            int val1=Integer.parseInt(equaTemp.substring(0,equaTemp.indexOf('+')-1).trim());
            int val2=Integer.parseInt(equaTemp.substring(equaTemp.indexOf('+')+1,equaTemp.indexOf('=')-1).trim());
            int val3=Integer.parseInt(equaTemp.substring(equaTemp.indexOf('=')+1,equaTemp.length()).trim());
            if (val1+val2==(int)val3) {
                System.out.printf("%d + %d = %d",val1,val2,val3);
                System.out.println();
                flag=true;
            }
        }
        if (!flag) System.out.println("Нет решения");
    } 
}
