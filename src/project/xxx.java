package project;

import java.util.*;

public class xxx {


    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        ListIterator<String> listIter = states.listIterator();

        while (listIter.hasNext()) {
            if (listIter.next().equals("France")) {
                System.out.println("Франция");

            } else{
                System.out.println(states.get(listIter.previousIndex()));
           }

        }
    }
}
