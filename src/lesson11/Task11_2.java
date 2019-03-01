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

    private static final String FILENAME1 = "manArrayList.xml";
    private static final String FILENAME2 = "myClassArrayList.xml";

    public static void start() {
        Task11_1.start();
        System.out.println();
        System.out.println("ЗАДАНИЕ 11_2");
        try {
            Document document1 = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder().newDocument();
            Document document2 = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder().newDocument();

            // Корневой элемент1
            Element database = document1.createElement("database");
            document1.appendChild(database);
            // Корневой элемент2
            Element application = document2.createElement("application");
            document2.appendChild(application);

            // Элемент типа students
            Element students = document1.createElement("students");
            database.appendChild(students);

            //Создание myClassArrayList.xml
            for (int i = 0; i < Task11_1.getMyClassArrayList().size(); i++) {
                // Элемент типа class
                Element clas = document2.createElement("class");
                application.appendChild(clas);

                clas.setAttribute("name", Task11_1.getMyClassArrayList().get(i).getName());
                for (int j = 0; j < Task11_1.getMyClassArrayList().get(i).getMethodList().size(); j++) {
                    Element method = document2.createElement("method");

                    clas.appendChild(method);
                    method.setAttribute("name", Task11_1.getMyClassArrayList().get(i).getMethodList().get(j).getName());
                    method.setTextContent(Task11_1.getMyClassArrayList().get(i).getMethodList().get(j).getValue());
                }
            }

            for (Man man : Task11_1.getManArrayList()) {
                if (man instanceof Student) {
                    // Элемент типа student
                    Element student = document1.createElement("student");
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
            Element professors = document1.createElement("professors");
            database.appendChild(professors);

            for (Man man : Task11_1.getManArrayList()) {
                if (man instanceof Professor) {
                    // Элемент типа professor
                    Element professor = document1.createElement("professor");
                    professors.appendChild(professor);

                    professor.setAttribute("name", man.getName());
                    professor.setAttribute("experience", ((Professor) man).getExperience());
                    professor.setAttribute("discipline", ((Professor) man).getDiscipline());
                }
            }

            // Элемент типа service
            Element service = document1.createElement("service");
            database.appendChild(service);

            for (Man man : Task11_1.getManArrayList()) {
                if (man instanceof Member) {
                    // Элемент типа member
                    Element member = document1.createElement("member");
                    service.appendChild(member);

                    member.setAttribute("name", man.getName());
                    member.setAttribute("position", ((Member) man).getPosition());
                }
            }

            // Сохранить текстовое представление XML документа в файл
            Transformer transformer = TransformerFactory.newInstance()
                    .newTransformer();
            DOMSource source1 = new DOMSource(document1);
            DOMSource source2 = new DOMSource(document2);
            StreamResult result1 = new StreamResult(
                    new File(System.getProperty("user.dir")
                            + File.separator + FILENAME1));
            StreamResult result2 = new StreamResult(
                    new File(System.getProperty("user.dir")
                            + File.separator + FILENAME2));

            // Для соображений отладки можно вывести результат работы
            // программы на стандартный вывод
            // StreamResult result = new StreamResult(System.out);

            transformer.transform(source1, result1);
            transformer.transform(source2, result2);

            System.out.println("Документы сохранены!");

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