package by.HeadFirst.Objects;

public abstract class SuperHero {
    private String name;
    private String suit;
    private String specialPower;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }

    public String getSuit(){
        return suit;
    }
    public void setSuit(String s){
        suit=s;
    }

    public String getSpecialPower(){
        return specialPower;
    }
    public void setSpecialPower(String sp){
        specialPower=sp;
    }

    public void useSpecialPower() {
        System.out.println(getSpecialPower());
    }



}