// Дан массив nums = [3,2,4,3,1,5,3,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

// [2,4,1,5,3,3,3,3]
// C использованием только 1 массива

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int [] arr = new int[]{1,3,3,2,4,3,5,3,3}; //1 2 4 5   3,3,3,3,3
        int val = 3;
        int count = 0;//4

        for (int i = 0; i < arr.length; i++)
            if (arr[i] != val) {
                arr[count++] = arr[i];
            }

        while (count < arr.length)
            arr[count++] = val;
        
        System.out.println(Arrays.toString(arr));

        for (int i : arr) {
            System.out.println(i);
        }
    }
}