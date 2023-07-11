import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

// Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.

public class task4 {

    public static Stack<Integer> fillStack(int num[]) {
        Stack<Integer> st = new Stack<Integer>();
        for (int i: num ){
            st.add(i);
        }
        return st;
    }


    public static Queue<Integer> fillQueue(int num[]) {
        Queue<Integer> qu = new LinkedList<>();
        for (int i: num ){
            qu.add(i);
        }
        return qu;
    }

    public static void main(String[] args) {
        int[] nums = new int[10];
        Random rnd = new Random();
        for (int i=0; i<10; i++) {
            nums[i]=rnd.nextInt(100);
        }
        System.out.println(Arrays.toString(nums));

        System.out.println(fillStack(nums));
        System.out.println(fillQueue(nums));
    }
}
