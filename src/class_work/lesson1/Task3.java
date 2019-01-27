package class_work.lesson1;

public class Task3 {
    public static void main(String[] args) {
        int []mas={5,4,3,0,6,0,0,5,6,0,25,0,8,7,3,0,1,1,0,6,4};
        int []mas1=new int[21];
        for(int j=mas.length-1;j>=0;j--){
            for(int i=0;i<mas.length-1;i++){
                if(mas[i]!=0){
                    mas1[j]=mas[i];
                    j++;
                }
            }
        }
        for(int x:mas1)
            System.out.print(x+" ");
    }
}
