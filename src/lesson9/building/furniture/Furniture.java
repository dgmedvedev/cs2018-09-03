package lesson9.building.furniture;

public abstract class Furniture {
    private double areaFurniture;
    private String areaFurnitureStr;
    private double minAreaFurniture;
    private double maxAreaFurniture;
    private String title_name;

    Furniture(String title_name, double areaFurniture) {
        this.title_name = title_name;
        this.areaFurniture = areaFurniture;
    }

    Furniture(String title_name, String areaFurnitureStr) {
        this.title_name = title_name;
        this.areaFurnitureStr = areaFurnitureStr;
    }

    public double getMinAreaFurniture() {
        String[] str = this.areaFurnitureStr.split("-");
        return Double.parseDouble(str[0]);
    }

    public double getMaxAreaFurniture() {
        String[] str = this.areaFurnitureStr.split("-");
        return Double.parseDouble(str[1]);
    }

    public double getAreaFurniture() {
        return areaFurniture;
    }

    public String getTitle_name() {
        return title_name;
    }
}