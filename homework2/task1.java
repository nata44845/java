import java.io.BufferedReader;
import java.io.FileReader;

// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, 
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Пример вывода: "select * from students WHERE name = Ivanov AND country = Russia.....".

/**
 * task1
 */
public class task1 {
    public static void main(String[] args) {
        String str, key, value;
        
        String[] arr;
        int len;
        int count;
        try{
            FileReader fr = new FileReader("task1.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((str = br.readLine()) != null) {
                System.out.println(str);
                str = str.replace("{", "").replace("}", "").replace("\"", "").trim();
                StringBuilder query = new StringBuilder();
                if (str.length()==0)
                {
                    query.append("select * from students");
                } else {
                    arr = str.split(",");
                    len = arr.length;
                    query.append("select * from where");
                    count=0;
                    for (String i:arr) {
                        key = i.split(":")[0].trim();
                        value = i.split(":")[1].trim();  
                        if (value.equals("null")) {
                            query.append(" "+key + " is " + value);
                        } else {
                            query.append(" "+key + " = " + value);
                        }     
                        if (count<len-1) query.append(" and");         
                        count++;
                    }
                }
                
                System.out.println(query);
            }
            br.close(); 
            fr.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        
    }
}