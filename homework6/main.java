import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих
*/

/**
 * main
 */
public class main {

    public static List<Laptop> getFiltered(List<Laptop> db, Map<String,String> filter,int type) {
        List<Laptop> lp = new ArrayList<Laptop>();
        Scanner sk = new Scanner(System.in, "cp866");
        String ch = "y";
        
        try {
            switch (type) {
                case 1: 
                    //ОЗУ
                    Integer ramMin = null,ramMax = null;
                    if (filter.containsKey("ramMin")) ramMin = Integer.parseInt(filter.get("ramMin"));
                    if (filter.containsKey("ramMax")) ramMax = Integer.parseInt(filter.get("ramMax"));
                    if (ramMin != null && ramMax!=null) {
                        System.out.printf("ramMin=%d ramMax=%d",ramMin,ramMax);
                        System.out.println();
                        System.out.println("Изменить параметры поиска? y/n ");
                        ch = sk.nextLine();
                    }
                    if (ch.equals("y")) {
                        System.out.print("Введите минимальный размер ОЗУ: ");
                        ramMin = Integer.parseInt(sk.nextLine()); 
                        System.out.print("Введите макимальный размер ОЗУ: ");
                        ramMax = Integer.parseInt(sk.nextLine()); 
                    }                    
                    for (Laptop item : db) {
                        if (item.RamGB>=ramMin && item.RamGB<=ramMax) {
                            lp.add(item);
                        }
                    }
                    filter.put("ramMin", String.valueOf(ramMin));
                    filter.put("ramMax", String.valueOf(ramMax));
                    break;
                case 2: 
                    //HD тип
                    String hd = null;
                    if (filter.containsKey("hd")) hd = filter.get("hd");
                    if (hd != null) {
                        System.out.printf("Тип диска %s",hd);
                        System.out.println();
                        System.out.println("Изменить параметр поиска? y/n ");
                        ch = sk.nextLine();
                    }
                    if (ch.equals("y")) {
                        System.out.print("Введите тип диска: ");
                        hd = sk.nextLine(); 
                    }
                    for (Laptop item : db) {
                        if (item.memoryType.equals(hd)) {
                            lp.add(item);
                        }
                    }
                    filter.put("hd", hd);
                    break;
                case 3: 
                    //HD размер
                    Integer hdMin = null,hdMax = null;
                    if (filter.containsKey("hdMin")) hdMin = Integer.parseInt(filter.get("hdMin"));
                    if (filter.containsKey("hdMax")) hdMax = Integer.parseInt(filter.get("hdMax"));
                    if (hdMin != null && hdMax!=null) {
                        System.out.printf("hdMin=%d hdMax=%d",hdMin,hdMax);
                        System.out.println();
                        System.out.println("Изменить параметры поиска? y/n ");
                        ch = sk.nextLine();
                    }
                    if (ch.equals("y")) {
                        System.out.print("Введите минимальный размер диска: ");
                        hdMin = Integer.parseInt(sk.nextLine()); 
                        System.out.print("Введите макимальный размер диска: ");
                        hdMax = Integer.parseInt(sk.nextLine()); 
                    }
                    for (Laptop item : db) {
                        if (item.memorySizeGB>=hdMin && item.memorySizeGB<=hdMax) {
                            lp.add(item);
                        }
                    }
                    filter.put("hdMin", String.valueOf(hdMin));
                    filter.put("hdMax", String.valueOf(hdMax));
                    break;
                case 4:
                    //Размер экрана
                    Integer sizeMin = null,sizeMax = null;
                    if (filter.containsKey("sizeMin")) sizeMin = Integer.parseInt(filter.get("sizeMin"));
                    if (filter.containsKey("sizeMax")) sizeMax = Integer.parseInt(filter.get("sizeMax"));
                    if (sizeMin != null && sizeMax!=null) {
                        System.out.printf("sizeMin=%d sizeMax=%d",sizeMin,sizeMax);
                        System.out.println();
                        System.out.println("Изменить параметры поиска? y/n ");
                        ch = sk.nextLine();
                    }
                    if (ch.equals("y")) {
                        System.out.print("Введите минимальный размер экрана: ");
                        sizeMin = Integer.parseInt(sk.nextLine()); 
                        System.out.print("Введите макимальный размер экрана: ");
                        sizeMax = Integer.parseInt(sk.nextLine()); 
                    }
                    for (Laptop item : db) {
                        if (item.screenSize>=sizeMin && item.screenSize<=sizeMax) {
                            lp.add(item);
                        }
                    }
                    filter.put("sizeMin", String.valueOf(sizeMin));
                    filter.put("sizeMax", String.valueOf(sizeMax));
                break;
                }

            }   catch (Exception e) {

        }
        return lp;
    }

    public static void addLaptop(ArrayList<Laptop> db) {
        Scanner sk = new Scanner(System.in, "cp866");
        try {
            Laptop lp = new Laptop();
            System.out.println("Введите Брэнд");
            lp.brand = sk.nextLine();
            System.out.println("Введите Процессор");
            lp.processor = sk.nextLine(); 
            System.out.println("Введите размер ОЗУ, ГБ");
            lp.RamGB = Integer.parseInt(sk.nextLine()); 
            System.out.println("Введите тип диска");
            lp.memoryType = sk.nextLine();
            System.out.println("Введите размер диска, ГБ");
            lp.memorySizeGB = Integer.parseInt(sk.nextLine()); 
            System.out.println("Введите размер экрана, дюймы");
            lp.screenSize = Integer.parseInt(sk.nextLine()); 
            System.out.println("Выберите тип ОС (1 - Windows 10, 2 - Windows 11, 3 - Linux)");
            int num = Integer.parseInt(sk.nextLine());
            switch (num) {
                case 1: 
                    lp.os = OS.Windows10;
                    break;
                case 2: 
                    lp.os = OS.Windows11;
                    break;
                case 3: 
                    lp.os = OS.Linux;
                    break;
            }
            System.out.println("Выберите цвет (1 - black, 2 - white, 3 - grey, 4 - red, 5 - green, 6 - blue)");
            num = Integer.parseInt(sk.nextLine());
            switch (num) {
                case 1: 
                    lp.color = Color.black;
                    break;
                case 2: 
                    lp.color = Color.white;
                    break;
                case 3: 
                    lp.color = Color.grey;
                    break;
                case 4: 
                    lp.color = Color.red;
                    break;
                case 5: 
                    lp.color = Color.green;
                    break;
                case 6: 
                    lp.color = Color.blue;
                    break;
            }
            lp.name = lp.toString();
            db.add(lp);
        } catch (Exception e) {
             System.out.println(e);
        }
    }

    public static ArrayList<Laptop> randomNotebooks(int num) {
        ArrayList<Laptop> temp = new ArrayList<Laptop>();
        Random rnd = new Random();

        String[] brands = new String[] {"Apple", "Acer", "ASUS", "HUAWEI", "Lenovo", "Microsoft", "Xiaomi", "GIGABYTE", "MSI", "Samsung"};
        String[] processor = new String[] {"Apple", "Intel", "AMD"};
        Integer[] ramGB = new Integer[] {4, 8, 16, 32, 64, 128, 256};
        String[] memoryType = new String[] {"HDD", "SSD", "Flash Storage"};
        Integer[] memorySize = new Integer[] {256, 512, 1024};
        Integer[] screenSize = new Integer[] {10, 11, 12, 13, 14, 15, 16, 17, 18};
        OS[] os = new OS[] {OS.Windows10, OS.Windows11 , OS.Linux};
        Color[] color = new Color[] {Color.black, Color.white, Color.grey, Color.red, Color.green, Color.blue};

        for (int i = 0; i < num; i++) {
            Laptop lp = new Laptop(brands[rnd.nextInt(brands.length)], 
            processor[rnd.nextInt(processor.length)], 
            ramGB[rnd.nextInt(ramGB.length)],
            memoryType[rnd.nextInt(memoryType.length)],
            memorySize[rnd.nextInt(memorySize.length)],
            screenSize[rnd.nextInt(screenSize.length)],
            os[rnd.nextInt(os.length)], 
            color[rnd.nextInt(color.length)]);
            lp.name = lp.toString();
            temp.add(lp);
        }
        
        return temp;
    }

    public static void printDB(List<Laptop> db) {
            System.out.println("Брэнд/Процессор/ОЗУ/Тип диска/Размер диска/Размер экрана/ОС/Цвет");
            for (var notebook: db) {
                System.out.printf("%s",notebook.toString());
                System.out.println();
            }
            System.out.println();
    }


    public static void main(String[] args) {
        ArrayList<Laptop> db = new ArrayList<Laptop>();
        Map<String,String> filter = new HashMap<String,String>(); 

        db = randomNotebooks(10);
        Scanner skn = new Scanner(System.in, "cp866");
        boolean flagExit = false;
        String ch;
        while (!flagExit) {
            System.out.println("[1] Добавить ноутбук");
            System.out.println("[2] Вывести всех");
            System.out.println("[3] Поиск Размер ОЗУ");
            System.out.println("[4] Поиск Тип HD");
            System.out.println("[5] Поиск Объем HD");
            System.out.println("[6] Поиск Размер экрана");
            System.out.println("[7] Выход");
            ch = skn.nextLine();
            switch (ch) {
                case "1":
                    addLaptop(db);
                    break;
                case "2":
                    printDB(db);
                    break;
                case "3":
                    printDB(getFiltered(db,filter,1));
                    break;
                case "4":
                    printDB(getFiltered(db,filter,2));
                    break;
                case "5":
                    printDB(getFiltered(db,filter,3));
                    break;
                case "6":
                    printDB(getFiltered(db,filter,4));
                    break;
                case "7":
                    flagExit = true;
            }
        }
        skn.close();
    }
}