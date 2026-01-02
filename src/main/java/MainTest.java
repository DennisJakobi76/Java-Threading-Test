public class MainTest {

    public static void main(String[] args) {

//        MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println("Thread is started.");

//        MyRunnable myRunnable = new MyRunnable();
//        Thread myThread = new Thread(myRunnable);
//        myThread.start();
//        System.out.println("Thread is started.");

        MyThread myThread = new MyThread();
        System.out.println("Before start: " + myThread.getState());
        myThread.start();
        System.out.println("After start: " + myThread.getState());
    }
}
