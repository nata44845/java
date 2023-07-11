import java.util.ArrayList;
import java.util.Random;

//Записать в список 10 случайных чисел и отсортировать их

public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i=0; i<10; i++)
        {
            list.add(rnd.nextInt(1000));
        }

        System.out.println(list);
        list.sort(null);
        System.out.println(list);
    }
}
