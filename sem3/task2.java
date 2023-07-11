import java.util.ArrayList;
import java.util.Iterator;

// Создать список типа ArrayList. Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.

public class task2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("земля");
        list.add(344343);
        list.add("марс");
        list.add(55);
        list.add("марс");
        list.add(6655);
        list.add("юпитер");
        list.add(655656);
        list.add("сатурн");
        list.add(656556);
        list.add("сатурн");

        for (int i=0; i<list.size();i++){
            if (((list.get(i)) instanceof Integer)) {
                list.remove(i);
                i--;
            }
        }

        //Итератор
        Iterator<Integer> col = list.iterator();
	    while (col.hasNext()) {
            if (col.next() instanceof Integer) col.remove();
	    }


        System.out.println(list);

    }
}
