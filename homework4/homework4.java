// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа могут быть отрицательными.

// Даны два Deque, цифры в обратном порядке.
// [3,2,1] - пример Deque
// [5,4,3]- пример второго Deque
// 1) 123 * 345 = 42 435
// Ответ всегда - связный список, в обычном порядке
// [4,2,4,3,5] - пример ответа

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class homework4 {
    
    private static LinkedList<Character> comp(Deque<Character> deq1, Deque<Character> deq2) {
        LinkedList<Character> list = new LinkedList<>();
        String num1="",num2="";
        Deque<Character> deq1copy = new ArrayDeque<Character>(deq1);
        Deque<Character> deq2copy = new ArrayDeque<Character>(deq2);

        System.out.println(deq1copy);
        while (!deq1copy.isEmpty()) {
            num1 += deq1copy.removeLast();
        }         
        System.out.println(num1);

        System.out.println(deq2copy);
        while (!deq2copy.isEmpty()) {
            num2 += deq2copy.removeLast();
        }    
        System.out.println(num2);

        long comp = Long.parseLong(num1)*Long.parseLong(num2);

        System.out.println(comp);

        String num=Long.toString(comp);
        for (int i=0; i<num.length(); i++) {
            list.addLast(num.charAt(i));
        }

        return list;
    }


    private static LinkedList<Character> sum(Deque<Character> deq1, Deque<Character> deq2) {
        LinkedList<Character> list = new LinkedList<>();
        String num1="",num2="";

        Deque<Character> deq1copy = new ArrayDeque<Character>(deq1);
        Deque<Character> deq2copy = new ArrayDeque<Character>(deq2);

        System.out.println(deq1copy);
        while (!deq1copy.isEmpty()) {
            num1 += deq1copy.removeLast();
        }         
        System.out.println(num1);

        System.out.println(deq2copy);
        while (!deq2copy.isEmpty()) {
            num2 += deq2copy.removeLast();
        }    
        System.out.println(num2);

        int comp = Integer.parseInt(num1)+Integer.parseInt(num2);

        System.out.println(comp);

        String num=Integer.toString(comp);
        for (int i=0; i<num.length(); i++) {
            list.addLast(num.charAt(i));
        }

        return list;
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        final int RADIX = 10;
        String num;

        Deque<Character> deque1 = new ArrayDeque<>();
        num = Integer.toString(rnd.nextInt(200000)-100000);

        for (int i=0; i<num.length(); i++) {
            deque1.addFirst(num.charAt(i));
        }

        Deque<Character> deque2 = new ArrayDeque<>();
        num = Integer.toString(rnd.nextInt(200000)-100000);

        for (int i=0; i<num.length(); i++) {
            deque2.addFirst(num.charAt(i));
        }

        System.out.println("Произведение");
        System.out.println(comp(deque1,deque2));
        System.out.println("Сумма");
        System.out.println(sum(deque1,deque2));

    }
}
