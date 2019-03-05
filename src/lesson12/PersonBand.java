package lesson12;

import java.util.LinkedList;
import java.util.List;

public class PersonBand {
    private List<Person> persons = new LinkedList<>();

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }
}
