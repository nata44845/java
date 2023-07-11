
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Program
 */
public class task1_v2 {
  public static void main(String[] args) {
    // Заполнить список названиями планет Солнечной системы в произвольном порядке с
    // повторениями. Вывести название каждой планеты и количество его повторений в
    // списке.
    ArrayList<String> al = new ArrayList<String>(
        Arrays.asList("Земля", "Марс", "Уран", "Земля", "Марс", "Марс", "Уран", "Земля"));
    ArrayList<String> planets = new ArrayList<String>(
        Arrays.asList("Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"));
    int counter = 0;

    for (String s : planets) {
       counter = Collections.frequency(al, s);
      // counter = 0;
      // for (String str : al) {
      //   if (s.equals(str)) {
      //     counter++;
      //   }
      // }
      if (counter > 0)
        System.out.printf("%s: %d\n", s, counter);
    }
  }

}