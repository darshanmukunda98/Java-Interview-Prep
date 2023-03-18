package Concurrency;

public class MultiThreadRun {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MultiThreadClass mtc = new MultiThreadClass();
            mtc.start();
        }


        //mtc.start();

    }
}
