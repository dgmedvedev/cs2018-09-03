package lesson6;

public class Task6_2 {
    public static void start() {
        System.out.println(9%5);
        int[]arr10 = {0,2,4,6,8,10,12,14,16,18};
        int[]arr20 = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.arraycopy(arr10,0,arr20,(arr20.length-arr10.length)/2,arr10.length);

        for(int i : arr20)
            System.out.print(i+" ");
    }
}
