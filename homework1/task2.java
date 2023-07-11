// Вывести все простые числа от 1 до 1000

public class task2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        boolean flag;
        long num=0;
        int value=1000;

        for (int i=2; i<=value; i++) {
            flag=false;
            for (int j=2;j<=i-1;j++){
                num++;
                if (i%j==0) {
                    flag=true;
                    break;
                }

            }
            if (!flag) System.out.printf("%d ",i);
        }
        System.out.println();
        System.out.printf("%d операций",num);

        System.out.println();
        System.out.println();
        num=0;
        int[] arr = new int[value];
        int counter = -1;
        for (int i=2; i<=value; i++) {
            flag=false;
            for (int j=0;j<=counter;j++){
                num++;
                if (i%arr[j]==0) {
                    flag=true;
                    break;
                }
            }
            if (!flag) arr[++counter]=i;
        }

        for (int i=0; i<=counter; i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.println();
        System.out.printf("%d операций",num);
        
    }   
}
