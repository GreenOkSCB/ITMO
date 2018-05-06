package lesson2;

public class lesson2 {
    public static void main(String[] args) {
        // if [else if else]
        boolean condition = true;
        // проверка условия,если оно true, то выполняется код в {}
        if (condition) {
            System.out.println("condition = true");
        }
        int a = 4;
        int b = 6;
        if (a + b < 10) { //a < b
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a = b");
        }

//        AND &&, OR ||, XOR ^, !         //& |
        if (a + b < 10 && condition) { //a < b
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a = b");
        }
        int day = 2;
        if (day == 1) {

        } else if (day == 2) {

        } else  if (day == 3) {

        }

        // switch
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            //...
            default:
                System.out.println("Неизвестный день недели");
        }

        switch (day) {
            case 1:
            case 2:
                System.out.println("Понедельник или Вторник");
                break;
            //...
            default:
                System.out.println("Неизвестный день недели");
        }

        int num = 13;
        String type;

        if (num % 2 == 0) {
            type = "even";
        }  else {
            type = "odd";
        }
        System.out.println("Type = " + type);

        // тернарный оператор
        type = num % 2 == 0 ? "even" : "odd";

        //condition ? "если условие true" : "если условие false";
        System.out.println("Type = " + type);

        // циклы позволяют повторно выполнять какую либо операцию
        // while
        int n = 0;
        while (n <= 5) {
            System.out.println(n);
            n = n + 1;
        }

        // for
        int i = 0;
        for (; i < 10; i++) {
            System.out.println(i);
        }

//        for (int i = 0; i < 10; i++) {
//            // code
//            for (int j = 0; j < 10; j++) {
//                // code
//                if (условие)
//                    break; // break outer;
//            }
//        }

//        for (int k =1; k < 10;k+=2) {
//            System.out.println(k);
//            k += 2; // k = k + 2;
//        }

        for (int k =1; k < 11;k++) {
            if (k % 2 !=0) {
                System.out.println("k" + k);
            }
        }

        // do while

//        do {
//            System.out.println("do while");
//        } while (condition);

        // от 5 до 1
        int j = 5;
        do {
            System.out.println("j" + j);
            j--;
        } while (j >= 1);



// В переменной m хранится натуральное двухзначное / трехзначное чило,
// Создайте программу, вычисляющую и выводящую на экран сумму цифр числа m

//    int m = 78;
//    System.out.println(m/10 + m%10);
        int m = 133;
        System.out.println(m%100/10 + m%100%10 + m/100);
    }
}
