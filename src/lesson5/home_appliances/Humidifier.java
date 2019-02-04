package lesson5.home_appliances;

class Humidifier extends Cleaning{
    Humidifier(double width, double length,double height, String color){
        super(width,length,height,color,"увлажнитель воздуха","очищает и увлажняет воздух");
    }

    @Override
    void work() {
        System.out.println(getTITLE() + " тихо работает");
    }
}