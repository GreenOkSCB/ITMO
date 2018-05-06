package lesson18;

import java.lang.reflect.*;
import java.text.NumberFormat;
import java.util.Arrays;

public class Reflection {
    public static void main(String[] args) throws
            ClassNotFoundException,
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException,
            NoSuchFieldException {
//        java.lang.Class
//        String className = "TstClass";
        Class unknownClass = Class.forName(args[0]);
//        Class unknownClass = TstClass.class;
        System.out.println(unknownClass);

        // Получение имени класса
        String fullName = unknownClass.getName();
        String className = unknownClass.getSimpleName();

        System.out.println(fullName + " : " + className);

        // Получение модификатора
        int classModif = unknownClass.getModifiers();
//        Modifier.isAbstract(int modifier);
//        Modifier.isFinal(int modifier);
//        Modifier.isInterface(int modifier);
//        Modifier.isNative(int modifier);
//        Modifier.isPrivate(int modifier);
//        Modifier.isProtected(int modifier);
//        Modifier.isPublic(int modifier);
//        Modifier.isStatic(int modifier);

        // получение информации о пакете
        Package apack = unknownClass.getPackage();
        System.out.println(apack);

        // Получение суперкласса
        Class superClass = unknownClass.getSuperclass();

        // Получение реализованных интерфейсов
        Class[] interfaces = unknownClass.getInterfaces();
        System.out.println(Arrays.toString(interfaces));

        // Получение информации о конструкторах
        Constructor[] constructors = unknownClass.getConstructors();
        System.out.println(Arrays.toString(constructors));

        Class[] paramTypes = constructors[0].getParameterTypes();
        System.out.println(Arrays.toString(paramTypes));

        Constructor constructor =
                unknownClass.getConstructor(int.class, String.class);

//      Создание объектов
        Object tstObj = constructor.newInstance(21, "Object");


        // Получение атрибутов класса (public)
        Field[] fields = unknownClass.getFields();
        System.out.println(Arrays.toString(fields));
        Field field = unknownClass.getField("tstAtr");

        String fieldName = field.getName();
        Object fieldType = field.getType();

        Object val = field.get(tstObj); // получение значения поля у объекта
        System.out.println(val);
        field.set(tstObj, "Some val"); // установили значение поля у объекта

        // Получение информации о методах
        Method[] methods = unknownClass.getMethods();
        Method method = unknownClass.getMethod("getStrData",
                null);

        // получить тип возвращаемого значения
        Class returnType = method.getReturnType();

        // вызов метода объекта
        System.out.println(method.invoke(tstObj, null));
//        method.invoke(null, params); если метод static


        // Доступ к приватным полям
        // Class.getDeclaredFields() и Class.getDeclaredField(name)
        // и методам
        Method privateMethod = unknownClass.getDeclaredMethod("callPrivate",
                null);
        privateMethod.setAccessible(true);
        privateMethod.invoke(tstObj, null);
        privateMethod.setAccessible(false);

    }
}
