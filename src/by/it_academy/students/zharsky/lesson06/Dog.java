package by.it_academy.students.zharsky.lesson06;

class Dog {

    public String name;
    public int age;
    private int weight;
    private double power;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, int weight, double power) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.power = power;
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
    public void setAge(int age) { this.age = age; }
    public int getWeight() { return weight; }
    public void setWeight(int weight) {this.weight = weight; }
    public double getPower() { return power; }
    public void setPower(double power) { this.power = power; }
    
    public String toString()
    {
        String opening = "Кличка: ";
        String Age = "Возраст: ";;
        String ret =opening+name+". "+Age+age;

        return ret;
    }
     public static boolean win(Dog first, Dog other)
    {

        double firstChance = (0.2*first.age)+(0.3*first.weight)+(0.5*first.power);
        double otherChance = (0.2*other.age)+(0.3*other.weight)+(0.5*other.power);
        if(firstChance>otherChance){return true;}
        else{return false;}


    }
}
