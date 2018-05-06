package lesson18.annotation;



import lesson18.TstClass;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ParseAnnotation {
    public static void main(String[] args) throws
            NoSuchFieldException {
        Class aclass = TstClass.class;
//        Class bclass = TstClass2.class;

        Field field = aclass.getDeclaredField("strData");

        UserAnnotation userAnnotation =
                field.getAnnotation(UserAnnotation.class);

//        getAnnotations();
//        @UserAnnotation(author = "not me")

        System.out.println("author" + userAnnotation.author());
    }
}
