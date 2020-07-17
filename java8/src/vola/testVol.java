package vola;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class testVol {
    public static Object lock=new Object();
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (testVol.lock) {
                    while (true) {
                        try {
                            testVol.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("t1 out");
                        testVol.lock.notifyAll();
                    }
                }
            }
        });
        t1.start();
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (testVol.lock) {
                    while (true) {
                        System.out.println("t2 out");
                        testVol.lock.notifyAll();
                        try {
                            testVol.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        t2.start();
    }
}
