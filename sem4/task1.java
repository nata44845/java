import java.util.ArrayList;
import java.util.LinkedList;

// 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.

/**
 * task1
 */
public class task1 {
    public static void main(String[] args) {
        long curTume = System.currentTimeMillis();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i=0; i<100_000; i++){
            al.add(0,0);
        }
        System.out.println(System.currentTimeMillis() - curTume);
        curTume = System.currentTimeMillis();
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i=0; i<100_000; i++){
            ll.add(0,0);
        }
        System.out.println(System.currentTimeMillis() - curTume);
        

    }
}