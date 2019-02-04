package lesson5.home_appliances;

class Vacuum extends Cleaning {
    Vacuum(double width, double length,double height, String color){
        super(width,length,height,color,"пылесос","всасывание пыли");
    }

    @Override
    void work() {
        System.out.println(getTITLE() + " работает. ничего не слышно");
    }
}