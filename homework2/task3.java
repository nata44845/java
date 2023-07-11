import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class task3 {

    public static String[] getPersons(String str) {
        String[] arr;
        str = str.replace("[", "").replace("]","").trim();
        if (str.length()==0) {
            arr = new String[0];
            return arr;
        }
        arr = str.split("},");
        return arr;
    }

    public static String getPerson(String str) {
        String[] arr;
        str = str.replace("{", "").replace("}","").trim();
        str = str.replace("\"", "").trim();
        
        if (str.length()==0) {
            return "";
        } else
        {
            Map<String,String> dict = new HashMap<String,String>();
            arr = str.split(",");
            for (String i: arr) {
                dict.put(i.split(":")[0],i.split(":")[1]);
            }
            str=String.format("Студент %s получил %s по предмету %s \n",
                dict.get("фамилия"),
                dict.get("оценка"),
                dict.get("предмет")
            );
        }
        return str;
    }

    public static StringBuilder getValues(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String student: arr) {
            sb.append(getPerson(student));
        }
        return sb;
    }


    public static void main(String[] args) {
        String str;
        try{
            FileReader fr = new FileReader("task3.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((str = br.readLine()) != null) {
                System.out.println(str);
                
                StringBuilder query = new StringBuilder();
                if (str.length()>0)
                {
                    System.out.println(getValues(getPersons(str)));
                }                 
                
            }
            br.close(); 
            fr.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        
    }
}
