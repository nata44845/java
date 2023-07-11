// Напишите метод, который сжимает строку. 
// Ввод: aaaabbbcdd.
// Вывод: a4b3cd2


public class task2 {
    public static void main(String[] args) {
        String s = "aaaabbbcddassdsdaaaa", res="";

        int len=s.length();
        char elem = s.charAt(0);
        int count = 1;
        for (int i=1; i<len; i++){
            if (s.charAt(i)!=elem) {
              res+=elem;
              if (count>1) {
                res+=count;
              }
              count = 1;
              elem = s.charAt(i);
            } else {
                count++;
            }
        }
        res+=elem;
        if (count>1) {
            res+=count;
        }

        System.out.printf("%s",res);
    }
}
