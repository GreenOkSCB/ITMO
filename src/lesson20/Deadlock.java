package lesson20;

/**
 * Created by xmitya on 07.03.17.
 */
public class Deadlock {
    private static volatile int i;

    private static final Object O1 = new Object();
    private static final Object O2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized (O1) {
                    i |= 1;

                    while ((i & 2) == 0);

                    System.out.println("T1 locked O1");
                    synchronized (O2) {

                        System.out.println("T2 locked O2");
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                synchronized (O2) {
                    i |= 2;

                    while ((i & 1) == 0);

                    System.out.println("T2 locked O2");
                    synchronized (O1) {

                        System.out.println("T2 locked O1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
