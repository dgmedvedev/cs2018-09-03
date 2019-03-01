package lesson11.People;

import lesson11.Task11_1;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXMans extends DefaultHandler {

    private Member member;
    private Professor professor;
    private Student student;

    public Member getMember() {
        return member;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("student")) {
            String name = attributes.getValue("name");
            String course = attributes.getValue("course");
            String specialization = attributes.getValue("specialization");
            this.student = new Student(name,course,specialization);
            Task11_1.getManArrayList().add(student);
        }
        if (qName.equals("professor")) {
            String name = attributes.getValue("name");
            String experience = attributes.getValue("experience");
            String discipline = attributes.getValue("discipline");
            this.professor = new Professor(name,experience,discipline);
            Task11_1.getManArrayList().add(professor);
        }
        if (qName.equals("member")) {
            String name = attributes.getValue("name");
            String position = attributes.getValue("position");
            this.member = new Member(name,position);
            Task11_1.getManArrayList().add(member);
        }
    }
}