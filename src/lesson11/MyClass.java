package lesson11;

import java.util.ArrayList;

public class MyClass {
    private String name;
    private ArrayList<Method> methodList = new ArrayList<>();

    MyClass(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Method> getMethodList() {
        return methodList;
    }
}