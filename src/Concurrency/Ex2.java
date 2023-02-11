package Concurrency;

public class Ex2 extends Thread {
    public void run(){
        System.out.println("Hello from a thread");
    }
    public static void main(String[] args){
        (new Ex2()).run();
    }
}
