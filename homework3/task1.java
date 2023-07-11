// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее ариф. значение

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rnd = new Random();

        for (int i=0; i<100;i++) {
            list.add(rnd.nextInt(100));
        }
        System.out.println(list);
        //Удаляем четные
        for (int i=0; i<list.size();i++){
            if (list.get(i)%2==0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

        if (list.size()>0) {
            //Находим минимум
            int min = list.get(0);
            for (int i=0; i<list.size();i++){
                if (list.get(i)<min) {
                    min = list.get(i);
                }
            }
            System.out.printf("min=%d",min);
            System.out.println();

             //Находим максимум
            int max = list.get(0);
            for (int i=0; i<list.size();i++){
                if (list.get(i)>max) {
                    max = list.get(i);
                }
            }
            System.out.printf("max=%d",max);
            System.out.println();

            //Находим среднее
            int avg = 0;
            for (int i=0; i<list.size();i++){
                avg += list.get(i);
            }
            avg = avg/list.size();
            System.out.printf("avg=%d",avg);
            System.out.println();
        } else {
            System.out.println("Список пуст");
        }

    }
}