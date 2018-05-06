package lesson1;

// однострочный комментарий

/*
многострочные комментарий
 */

/**
 * описание документации
 */

// имя публичного класса! должно соответствоать имени файла, учитывая регистр
public class lesson1 {

// main - основной метод. Точка входа в программу, с него начинается выполнение программы.
// Ключевое слово public - это спецификатор доступа.
// Когда члену класса предшествует public, то к этому члену возможен доступ из кода,
// внешнего по отношению к классу, в котором описан данный метод.
// В данном случае, main объявлен как public так, чтобы JVM мог обратиться к этому методу

// Ключевое слово static позволяет методу main() вызываться без потребности создавать объект.
// Ключевое слово void говорит компилятору, что метод не возвращает никакого значения.
// String args [ ] - один из параметров, который передаётся основному методу.

// System - класс, который обеспечивает доступ к системе.
// out - выходной поток и связан с консолью.
// Вывод строки осуществляется с помощью метода println ()

    public static void main(String[] args) {  // в idea psvm
        System.out.println("Все, что хотите вывести на экран"); // в idea sout

//        Объявление переменных в java
//    int (тип данных) varName (имя переменной);
        int varName;

//     присвоние переменной значения
        varName = 90;
        varName = 12; // переопределение переменной

//        можно объявить сразу несколько переменных одного типа
        int a, b, c;
//        можно присвоить значения сразу нескольким переменным
        a = b = c = 20;


        // short от -32768 до 32768
        short shortA = 2;
        short shortB = 3;
//        short shortC = shortA + shortB;
        short shortC = (short)(shortA + shortB);

        // int
        int a1 = 5;
        int b1 = 4;
//        int c1 = a1 / b1;
        float c1 = (float)(a1 / b1);
        System.out.println(c1);

// типы с плавающей точкой
        float a2 = 0.2f;
        float b2 = 0.3f;
        float c2 = a2 * b2;
        System.out.println(c2);

        double a3 = 0.2f;
        double b3 = 0.3f;
        double c3 = a3 * b3;
        System.out.println(c3);

// char от 0  до 65536
        char char1 = 74;
        char char2 = 'a';
        char char3 = 118;
        char char4 = 97;
        System.out.println("Char: " + char1 + char2 + char3 + char4);
        char char5 = '\u0054';
        System.out.println(char5);

        int a5 = 100; // число
        Integer a6 = 120; // ссылка на объект

//    byte x = Byte.parseByte("100");
        int x1 = Integer.parseInt("100");
        short x2 = Short.parseShort("100");
        long x3 = Long.parseLong("100");
        double x4 = Double.parseDouble("100.9");
        float x5 = Float.parseFloat("100.9");

        System.out.println(x1);

        String str = "STRING";
        String str2 = "STRING";

        String str3 = new String("STRING");
        String str4 = new String("STRING");

        System.out.println(str == str2); // true
        System.out.println(str3 == str4); // false
        System.out.println(str3.equals(str4)); // true

// арифметическе операторы
        a = 10;
        b = 20;
        c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++));
        System.out.println("b--   = " +  (a--));
        System.out.println("d++   = " +  (d++));
        System.out.println("++d   = " +  (++d));

// Операторы сравнения
        a = 10;
        b = 20;
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );

//        операторы присваивания
        a = 10;
        b = 20;
        c = 0;

        c = a + b;
        System.out.println("c = a + b = " + c );

        c += a ;
        System.out.println("c += a  = " + c );

        c -= a ;
        System.out.println("c -= a = " + c );

        c *= a ;
        System.out.println("c *= a = " + c );

        a = 10; c = 15; c /= a ;
        System.out.println("c /= a = " + c );

        a = 10; c = 15; c %= a ;
        System.out.println("c %= a  = " + c );

        // тернарные оператор
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println( "Значение b: " +  b );

        b = (a == 10) ? 20 : 30;
        System.out.println( "Значение b: " + b );
    }
}
