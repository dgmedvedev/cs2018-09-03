package lesson5.home_appliances;

class MusicCentre extends Entertainment {
    MusicCentre(double width, double height, String color){
        super(width,25,height,color,"музыкальный центр","воспроизведение звука");
    }

    @Override
    void work() {
        System.out.println(getTITLE() + " работает");
    }
}