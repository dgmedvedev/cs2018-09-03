package lesson11.Task11_1copy;

public class Method {
    private String name;
    private String value;

    Method(String name){
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}