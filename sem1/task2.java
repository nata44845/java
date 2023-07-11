// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

public class task2 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1 };
        int cnt=0;
        int maxcnt=0;
        int len=arr.length;
        for  (int i = 0; i < len; i++)  {
            if (arr[i]==0 || i==len-1) {
                if (arr[i]==1) cnt++;
                if (cnt>maxcnt) {
                    maxcnt = cnt;  
                }
                cnt=0;
            } 
            else {
                cnt++;
            }
        }
        System.out.println(maxcnt);

        int count = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
            count++;
            } else  {
            if (count > max) max = count;
            count = 0;
            }
        }

        if (count > max)
        max = count;

        // System.out.println(max);

    }


}
