package lesson14.task14_1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task14_1 {
    public static void start() {
        MyClass mc = new MyClass();
        Class c = mc.getClass();

        try {
            Field[] privateFields = c.getDeclaredFields();
            for (Field field : privateFields) {
                field.setAccessible(true);
                if (field.getName().equals("string"))
                    field.set(mc, "строка");
                if (field.getName().equals("valueInt"))
                    field.set(mc, 10);
                if (field.getName().equals("valueFloat"))
                    field.set(mc, 100F);
            }
            Method method = c.getMethod("getString");
            System.out.println((String) method.invoke(mc));

            method = c.getMethod("getValueInt");
            System.out.println((int) method.invoke(mc));

            method = c.getMethod("getValueFloat");
            System.out.println((float) method.invoke(mc));

        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}