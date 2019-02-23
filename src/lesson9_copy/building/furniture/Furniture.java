package lesson9_copy.building.furniture;

import lesson9_copy.building.my_exception.NegativeValueAreaException;

public abstract class Furniture {
    private double areaFurniture;
    private String areaFurnitureStr;
    private double minAreaFurniture;
    private double maxAreaFurniture;
    private String title_name;

    Furniture(String title_name, double areaFurniture) {
        try {
            this.title_name = title_name;
            this.areaFurniture = areaFurniture;
            if (areaFurniture <= 0) throw new NegativeValueAreaException();
        } catch (NegativeValueAreaException nae) {
            nae.getStackTrace();
            System.exit(1);
        }
    }

    Furniture(String title_name, String areaFurnitureStr) {
        try {
            this.title_name = title_name;
            this.areaFurnitureStr = areaFurnitureStr;
            String[] str = areaFurnitureStr.split("-");
            this.minAreaFurniture = Double.parseDouble(str[0]);
            this.maxAreaFurniture = Double.parseDouble(str[1]);
            if (minAreaFurniture <= 0 || maxAreaFurniture <= 0||maxAreaFurniture<minAreaFurniture)
                throw new NumberFormatException();
        } catch (NumberFormatException nfe) {
            System.err.println("Допустимый формат ввода " + "\"number1-number2" + "\", при этом:" +"\n"+
                    "- number1 и number2 должны быть больше нуля;\n"+
                    "- number2 должно быть больше number1.");
            System.exit(1);
        }
    }

    public double getMinAreaFurniture() {
        return minAreaFurniture;
    }

    public double getMaxAreaFurniture() {
        return maxAreaFurniture;
    }

    public String getAreaFurnitureStr() {
        return areaFurnitureStr;
    }

    public double getAreaFurniture() {
        return areaFurniture;
    }

    public String getTitle_name() {
        return title_name;
    }
}