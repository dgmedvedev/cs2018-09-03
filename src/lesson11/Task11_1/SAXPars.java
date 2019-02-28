package lesson11.Task11_1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.Arrays;

public class SAXPars extends DefaultHandler {

    private MyClass myClass;
    private Method method;
    private String methodValue;

    public Method getMethod() {
        return method;
    }

    public MyClass getMyClass() {
        return myClass;
    }

    public String getMethodValue() {
        return methodValue;
    }

    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("class")) {
            String nameClass = attributes.getValue("name");
            this.myClass = new MyClass(nameClass);
            Task11_1.getMyClassArrayList().add(myClass);
        }
        if(qName.equals("method")){
            String nameMethod = attributes.getValue("name");
            this.method = new Method(nameMethod);
            this.myClass.getMethodList().add(method);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        methodValue = new String(ch, start, length);
        methodValue = methodValue.replace("\n", "").trim();
        if (!methodValue.isEmpty()) {
            if (methodValue.equals("method"))
                method.setValue(methodValue);
        }
    }
}