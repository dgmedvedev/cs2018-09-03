package by.HeadFirst.Objects;

import java.util.Objects;

public class SuperHeroTestDrive {
    public static void main(String[] args) {

        Vet v = new Vet();
        SuperHero sm = new SpiderMan();
        SuperHero bm = new BatMan();
        sm.setName("Паук");
        sm.setSuit("Красный");
        bm.setName("Мышь");
        bm.setSuit("Черный");
        sm.setSpecialPower("Паутина");
        bm.setSpecialPower("Полет");


        for(int j=1;j<5;j++){
            String sh=new String();
            sh = "sh"+j;
            System.out.println(sh);

        }

        System.out.println(sm.getSpecialPower());
        System.out.println(bm.getSpecialPower());


        SuperHero[]v1= {sm,bm};

        v.putOnSuit(sm);
        v.putOnSuit(bm);

        for(int i = 0; i<v1.length;i++){
            v.putOnSuit(v1[i]);
        }

    }
}
