package lesson5.home_appliances;

class TV extends Entertainment {
    TV(double width, double height, String color){
        super(width,5,height,color,"телевизор","отображение изображения и звука");
    }

    @Override
    void work() {
        System.out.println(getTITLE() + " работает вечером");
    }
}