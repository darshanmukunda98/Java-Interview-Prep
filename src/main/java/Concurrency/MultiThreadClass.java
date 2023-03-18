package Concurrency;

public class MultiThreadClass  extends Thread{
    @Override
    public void run() {
       // super.run();
        for(int i = 0;i <= 5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }

    }
}
