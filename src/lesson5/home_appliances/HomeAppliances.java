package lesson5.home_appliances;

abstract class HomeAppliances {
    private double width, length, height;
    private String color;
    private final String TITLE, FUNCTION;

    HomeAppliances(double width, double length, double height, String color, String title, String function) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.color = color;
        this.TITLE = title;
        this.FUNCTION = function;
    }

    abstract void work();

    @Override
    public String toString() {
        return "HomeAppliances{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", TITLE='" + TITLE + '\'' +
                ", FUNCTION='" + FUNCTION + '\'' +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public String getTITLE() {
        return TITLE;
    }

    public String getFunction() {
        return FUNCTION;
    }
}