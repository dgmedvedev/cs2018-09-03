package by.HeadFirst.Polimorph;

public class SonTestDrive {
    public static void main(String[] args) {
        SonTestDrive std = new SonTestDrive();
        std.test();
    }

    public void test() {
        GrendFather grendFather = new GrendFather();
        Father father = new Father();
        Son son1 = new Son();
        GrendFather son2 = new Son();

        grendFather.setAge(57);
        grendFather.setHeight(173);
        grendFather.setPower(100);
        father.setAge(32);
        father.setHeight(178);
        father.setMind(15);
        father.setPower(70);
        son1.setAge(7);
        son1.setHeight(130);
        son1.setMind(10);
        son1.setPower(10);
        son2.setAge(1);
        son2.setHeight(50);
        son2.setPower(1);

        grendFather.foundWeight();
        father.foundWeight(father);
        son1.foundWeight(son1);
        son2.foundWeight();
    }
}
