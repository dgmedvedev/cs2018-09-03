package lesson16.task16_1;

import lesson16.task16_1.people16_1.SAXMans;
import lesson16.task16_1.persons16_1.json.JsonReader;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class Processing implements Runnable {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " стартовал");

        try {
            Thread.sleep(500);
            synchronized (FileValue.getVALUE1()) {
                SAXParserFactory factory = SAXParserFactory.newInstance();
                SAXParser parser = factory.newSAXParser();
                SAXMans saxm = new SAXMans();
                parser.parse(new File(FileValue.getVALUE1()), saxm);
                FileValue.getVALUE1().notify();
            }
        } catch (InterruptedException | ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }

        name = Thread.currentThread().getName();
        System.out.println(name + " стартовал 2-ой раз");

        try {
            Thread.sleep(500);
            synchronized (FileValue.getVALUE2()) {

                FileValue.setPersonList(JsonReader.getPersons(FileValue.getJson()));
                FileValue.getVALUE2().notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}