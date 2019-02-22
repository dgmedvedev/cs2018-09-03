package lesson9.building;

public class Lamp {
    private int lux;

    Lamp(int lux) {
        this.lux = lux;
        if (lux < 0) {// в комнате могут быть лампочки, которые не горят)
            System.out.println("Недопустимое значение освещенности лампы");
            System.exit(1);
        }
    }

    public int getLux() {
        return lux;
    }
}