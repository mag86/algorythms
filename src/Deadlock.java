/**
 * Created by admin on 24.05.2017.
 */
public class Deadlock {
    public static void main(String[] args) {

        Thread T1 =new Thread(new FirstThread());
        Thread T2 =new Thread(new SecobdThread());

        T1.start();
        T2.start();



    }

    public static Object a = new Object();
    public static Object b = new Object();

    private static  class FirstThread implements Runnable {
        @Override
        public void run() {
            synchronized (a) {
                System.out.println("FirstThread holding Lock1");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("FirstThread waiing for Lock2");
                synchronized (b) {
                    System.out.println("FirstThread holding Lock`1 and Lock2");

                }
            }
        }
    }

    private static class SecobdThread implements Runnable{
        @Override
        public void run() {
            synchronized (b){
                System.out.println("SecondThread holding Lock2");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("SecondThread waiting for Lock1");
                synchronized (a){
                    System.out.println("SecondThread holding Lock2 and Lock1");
                }
            }
        }
    }


}
