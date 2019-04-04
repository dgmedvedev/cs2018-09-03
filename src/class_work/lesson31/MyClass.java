package class_work.lesson31;

import java.util.List;

public class MyClass {
    private final int NUMBER;
    private String name;
    private static int value;

    MyClass(int NUMBER){
        this.NUMBER = NUMBER;
    }

    public void setName(String name) {
        this.name = name;
        value++;
    }

    public static void setValue(int value) {
        MyClass.value = value;
    }

    public static String getValue(){
        return "Текущее значение:" + value;
    }

    public int getNUMBER() {
        return NUMBER;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "NUMBER=" + NUMBER +
                ", name='" + name + '\'' +
                '}';
    }
}
