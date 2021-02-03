package CreateThread;

public class Main {
     static int count=0;
    public  synchronized void print(){
        System.out.println(count);
    }

    public static void main(String[] args){
        Main main=new Main();

Thread thread1=new Thread(new Runnable() {
    @Override
    public void run() {
        for (int i=0;i<10;i++){
          main.print();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
});
Thread thread2=new Thread(new Runnable() {


    @Override
    public void run() {
        for (int i=0;i<10;i++){
         main.print();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}});
thread1.start();
thread2.start();


}}