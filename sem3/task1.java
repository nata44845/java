import java.util.ArrayList;

//  Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
//  Вывести название каждой планеты и количество его повторений в списке.

public class task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("земля");
        list.add("марс");
        list.add("марс");
        list.add("земля");
        list.add("венера");
        list.add("марс");
        list.add("земля");
        list.add("юпитер");
        list.add("венера");
        list.add("сатурн");
        list.add("земля");
        list.add("сатурн");

        String planet;
        boolean flag=true;
        int count;

        while (flag){
            count=0;
            planet = list.get(0);

            for (int i=0; i<list.size();i++){
                    if (list.get(i)==planet) {
                        count++;
                        list.remove(i);
                        i--;
                    }
                }
            System.out.printf("%s  = %d",planet,count);
            System.out.println();
            if (list.size()==0) flag=false;
        }
    }
}