package lesson5.home_appliances;

class Fridge extends Cooking {
    Fridge(double width, double length,double height, String color){
        super(width,length,height,color,"холодильник","хранение и охлаждение продуктов");
    }

    @Override
    void work() {
        System.out.println(getTITLE() + " работает постоянно");
    }
}