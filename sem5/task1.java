import java.util.HashMap;
import java.util.Map;

// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();

        db.put(123456, "Иванов"); 
        db.put(321456, "Васильев"); 
        db.put(234561, "Петрова"); 
        db.put(234432, "Иванов"); 
        db.put(654321, "Петрова"); 
        db.put(345678, "Иванов"); 

        for (var item : db.entrySet()) {
            if (item.getValue().equals("Иванов")) {
                System.out.printf("%d\n", item.getKey());
            }
        }
    }
}