import java.util.concurrent.locks.ReentrantLock;

import static myprint.Print.*;
public class ThreadTest {
    static int a = 0;
    //定义锁
    private ReentrantLock mylock = new ReentrantLock();
    public void Aplus(){
//        boolean captured = mylock.tryLock();
        try {
//            if (captured){
//                println("Aplus get lock success!");
//            }else {
//                println("Aplus get lock failed!");
//            }
            a++;
            println("a = "+a);;
        }finally {
//            if (captured){
//                mylock.unlock();
//            }
        }
    }
    public void Aminus(){
//        boolean captured = false;

        try {
//            captured =  mylock.tryLock();
//            if (captured){
//                println("Aminus get lock success!");
//            }else {
//                println("Aminus get lock failed!");
//            }
            a--;
            println("a = "+a);;
        }finally {
//            if (captured){
//                mylock.unlock();
//            }
        }
    }

    public static void main(String[] args) {
        ThreadTest myLockTest = new ThreadTest();

        Thread thread_b = new Thread(new Runnable() {
            @Override
            public void run() {
//                int cnt = 10;
                while (true){
//                    println("Thread b is running!");
                    try {
                        Thread.sleep(100);
//                        println("Thread b is yieding!!");
//                        Thread.yield();
                        myLockTest.Aplus();


                      } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        Thread thread_a = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
//                    println("Thread a is running!");
                    try {
                        Thread.sleep(100);
                        myLockTest.Aminus();
//                        println("Thread a is yieding!!");
//                        Thread.yield();
//                        thread_b.join();
                    } catch (InterruptedException e) {
//                        println("exit * * * * ");
                    }finally {
//                        println("over******");
                    }
                }

            }
        });

//        thread_a.setDaemon(true);
        thread_a.start();

        thread_b.start();
    }
}
