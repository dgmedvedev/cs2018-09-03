package class_work.lesson14;


import java.lang.reflect.*;

public class Task14_1 {
    public static void start() {
        Class mClassObject = String.class;
        System.out.println("1 " + mClassObject);
        try {
            mClassObject = Class.forName("java.lang.String");
            System.out.println("2 " + mClassObject);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String fullClassName = mClassObject.getName();
        System.out.println("3 " + fullClassName);

        String justClassName = mClassObject.getSimpleName();
        System.out.println("4 " + justClassName);

        int classModifiers = mClassObject.getModifiers();
        System.out.println("5 " + classModifiers);

        System.out.println("6 " + Modifier.isAbstract(classModifiers));
        System.out.println("7 " + Modifier.isFinal(classModifiers));
        System.out.println("8 " + Modifier.isInterface(classModifiers));
        System.out.println("9 " + Modifier.isNative(classModifiers));
        System.out.println("10 " + Modifier.isPrivate(classModifiers));
        System.out.println("11 " + Modifier.isProtected(classModifiers));
        System.out.println("12 " + Modifier.isPublic(classModifiers));
        System.out.println("13 " + Modifier.isStatic(classModifiers));

        Class superclass = mClassObject.getSuperclass();
        System.out.println("14 " + superclass);
        Class superSuperclass = mClassObject.getSuperclass().getSuperclass();
        System.out.println("15 " + superSuperclass);
        Class[] interfaces = mClassObject.getInterfaces();

        for (Class cl : interfaces)
            System.out.println("16 " + cl);

        Constructor[] constructors = mClassObject.getConstructors();
        for (Constructor con : constructors)
            System.out.println("17 " + con);

        try {
            Constructor constructor = mClassObject.getConstructor(new Class[]{String.class});
            System.out.println("18 " + constructor);


            constructor = String.class.getConstructor(String.class);
            System.out.println("19 " + constructor);

            String myObject = (String) constructor.newInstance("строка");
            System.out.println("20 " + myObject);


            Field[] fields = mClassObject.getDeclaredFields();
            for (Field fi : fields) {
                //       fi.setAccessible(true);
                System.out.println("21 " + fi);
            }


            try {
                Field field = mClassObject.getDeclaredField("value");
                System.out.println("22 " + field);
                String fieldName = field.getName();
                System.out.println("23 " + fieldName);
                Object fieldType = field.getType();
                System.out.println("24 " + fieldType);

                String instance = new String();
                try {
                    field.setAccessible(true);
                    Object value = field.get(instance);
                    System.out.println("25 " + value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }

            Method[] methods = mClassObject.getMethods();
            for (Method met : methods)
                System.out.println("26 " + met);


            Method method = mClassObject.getMethod("format", new Class[]{String.class, Object[].class});
            System.out.println("27 " + method);

            method = mClassObject.getMethod("notify", null);
            System.out.println("28 " + method);

            //     method.invoke(myObject)


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}