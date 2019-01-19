package class_work;


import java.sql.Array;

public class Task1 {
    public static void main(String[] args) {
        int[]mas=new int[50];
        for (int i = 0,j=1; i < 50; i++,j+=2) {
            mas[i]=j;
        }
        for(int m:mas)
            System.out.print(m+" ");
        //System.out.println(Array.toString(mas));

    }
}
