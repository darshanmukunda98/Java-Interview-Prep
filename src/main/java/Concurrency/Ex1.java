package Concurrency;

public class Ex1 implements Runnable {
    public void run(){
        System.out.println("Hello from a thread!");
    }
    public static void main(String[] args){
        Thread t = new Thread(new Ex1());
        t.start();

    }
}
