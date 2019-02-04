package lesson5.home_appliances;

class Microwave extends Cooking{
    Microwave(double width, double length,double height, String color){
        super(width,length,height,color,"микроволновка","разогрев продуктов");
    }

    @Override
    void work() {
        System.out.println(getTITLE() + " работает, не забудьте выключить");
    }
}