package by.it.zharsky.lesson06;

class Dog {

    public String name;
    public int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString()
    {
        String opening = "Кличка: ";
        String Age = "Возраст: ";;
        String ret =opening+name+". "+Age+age;

        return ret;
    }
}
