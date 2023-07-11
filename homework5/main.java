import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, 
// их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
// Пример ввода:
// Иванов 234234
// Иванов 32523
// Иванов 5687
// Иванов: 234234, 32523, 5687

// Пример меню:
// 1. Добавить контакт
// 2. Вывести всех
// 3. Выход

/**
 * main
 */
public class main {

    public static void addContact(Map<String,List<String>> db) {
        Scanner sk = new Scanner(System.in, "cp866");
        System.out.println("Введите фамилию");
        String fam = sk.nextLine();
        System.out.println("Введите телефон");
        String phone = sk.nextLine();
        if (!db.containsKey(fam)) {
            List<String> arr = new ArrayList<String>();
            arr.add(phone);
            db.put(fam,arr);
            System.out.printf("Создан новый контакт %s с номером телефона %s",fam,phone);
            System.out.println();
        }
        else {
            List<String> arr = db.get(fam);
            boolean isExists = false;
            for (var item: arr) {
                if (item.equals(phone)) {
                    isExists = true;
                }
            }
            if (!isExists) {
                arr.add(phone);
                db.put(fam, arr);
                System.out.printf("К контакту %s добавлен номер телефона %s",fam,phone);
                System.out.println();
            } else {
                System.out.printf("У контакта %s уже есть номер телефона %s",fam,phone);
                System.out.println();
            } 
            
        }
    }

    public static void printMap(Map<String,List<String>> db) {
        for (var item : db.entrySet()) {
            System.out.printf("%s: ",item.getKey());
            for (var phone: item.getValue()) {
                System.out.printf("%s ",phone.toString());
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
    }

    public static void printMapSorted(Map<String, List<String>> db) {
        String[] arr = new String[db.size()];
        String temp;
        int i=0;
        for (var item : db.entrySet()) {
            arr[i] = String.format("%s: ", item.getKey().trim());
            for (var phone: item.getValue()) {
                arr[i] = arr[i]+String.format(" %s",phone.toString());
            }
            i++;
        }
        int len, lenJ;
        for (i = 0; i < arr.length; i++) {
            len = arr[i].split(":")[1].split(" ").length;
            for (int j = i + 1; j < arr.length; j++) {
                lenJ = arr[j].split(":")[1].split(" ").length;
                if (lenJ > len) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.println(arr[i]);
        }
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<String, List<String>>();
        Scanner skn = new Scanner(System.in, "cp866");
        boolean flagExit = false;
        String ch;
        while (!flagExit) {
            System.out.println("[1] Добавить контакт");
            System.out.println("[2] Вывести всех");
            System.out.println("[3] Вывести сортированный");
            System.out.println("[4] Выход");
            ch = skn.nextLine();
            switch (ch) {
                case "1":
                    addContact(phoneBook);
                    break;
                case "2":
                    printMap(phoneBook);
                    break;
                case "3":
                    printMapSorted(phoneBook);
                    break;
                case "4":
                    flagExit = true;
            }
        }
        skn.close();
    }
}