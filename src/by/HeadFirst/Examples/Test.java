package by.HeadFirst.Examples;


import java.util.Date;

public class Test {
    static int i=676825778;
    static double j= 123456789.866;
    static String k;
    static String l;

    public static void main(String[] args) {

        Test.go();
    }
    public static void go(){

        System.out.println(i);
        System.out.println(j);

        k=String.format("Число i равно %,d, число j равно %,.2f и еще %d",i,j,i);
        System.out.println(k);
        l=String.format("%td %tB %tY (%tD)",new Date(),new Date(),new Date(),new Date());
        System.out.print(l);
    }
}