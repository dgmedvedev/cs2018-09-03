package lesson11;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import lesson11.People.Man;
import lesson11.People.Member;
import lesson11.People.Professor;
import lesson11.People.Student;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Task11_2 {

    private static final String FILENAME = "manArrayList.xml";

    public static void start() {
        Task11_1.start();
        System.out.println();
        System.out.println("ЗАДАНИЕ 11_2");
        try {
            Document document = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder().newDocument();

            // Корневой элемент
            Element database = document.createElement("database");
            document.appendChild(database);

            // Элемент типа students
            Element students = document.createElement("students");
            database.appendChild(students);

            for (Man man : Task11_1.getManArrayList()) {
                if (man instanceof Student) {
                    // Элемент типа student
                    Element student = document.createElement("student");
                    students.appendChild(student);
                    // Определяем имя
                    student.setAttribute("name", man.getName());
                    // Еще можно сделать так
                    //   Attr name = document.createAttribute("name");
                    //   name.setTextContent("Maksim");
                    //   student.setAttributeNode(name);

                    student.setAttribute("course", ((Student) man).getCourse());
                    student.setAttribute("specialization", ((Student) man).getSpecialization());
                }
            }
            // Элемент типа professors
            Element professors = document.createElement("professors");
            database.appendChild(professors);

            for (Man man : Task11_1.getManArrayList()) {
                if (man instanceof Professor) {
                    // Элемент типа professor
                    Element professor = document.createElement("professor");
                    professors.appendChild(professor);

                    professor.setAttribute("name", man.getName());
                    professor.setAttribute("experience", ((Professor) man).getExperience());
                    professor.setAttribute("discipline", ((Professor) man).getDiscipline());
                }
            }

            // Элемент типа service
            Element service = document.createElement("service");
            database.appendChild(service);

            for (Man man : Task11_1.getManArrayList()) {
                if (man instanceof Member) {
                    // Элемент типа member
                    Element member = document.createElement("member");
                    service.appendChild(member);

                    member.setAttribute("name", man.getName());
                    member.setAttribute("position", ((Member) man).getPosition());
                }
            }

            // Сохранить текстовое представление XML документа в файл
            Transformer transformer = TransformerFactory.newInstance()
                    .newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(
                    new File(System.getProperty("user.dir")
                            + File.separator + FILENAME));

            // Для соображений отладки можно вывести результат работы
            // программы на стандартный вывод
            // StreamResult result = new StreamResult(System.out);

            transformer.transform(source, result);

            System.out.println("Документ сохранен!");

        } catch (ParserConfigurationException
                | TransformerConfigurationException ex) {
            Logger.getLogger(Task11_2.class.getName())
                    .log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(Task11_2.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }
}
