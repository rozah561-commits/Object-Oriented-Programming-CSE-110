/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;
class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread1: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
}
class Thread2 extends Thread {
    public void run() {
        for (int i = 4; i <= 7; i++) {
            System.out.println("Thread2: " + i);
            try { 
                Thread.sleep(100); 
            } catch (InterruptedException e) {}
        }
    }
}
class Thread3 extends Thread {
    public void run() {
        for (int i = 8; i <= 10; i++) {
            System.out.println("Thread3: " + i);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {}
        }
    }
}
public class PrintNumbersByExtendingThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t1.start();
        t2.start();
        t3.start();
    }
}
//class NumberPrinter implements Runnable {
//    int start, end;
//    String threadName;
//
//    public NumberPrinter(String name, int start, int end) {
//        this.start = start;
//        this.end = end;
//        this.threadName = name;
//    }
//
//    @Override
//    public void run() {
//        for (int i = start; i <= end; i++) {
//            System.out.println(threadName + ": " + i);
//            try {
//                Thread.sleep(100); // simulate time gap
//            } catch (InterruptedException e) {
//                System.out.println(threadName + " interrupted.");
//            }
//        }
//    }
//}
//
//public class ConcurrentNumberPrinter {
//    public static void main(String[] args) {
//        Thread t1 = new Thread(new NumberPrinter("Thread1", 1, 3));
//        Thread t2 = new Thread(new NumberPrinter("Thread2", 4, 7));
//        Thread t3 = new Thread(new NumberPrinter("Thread3", 8, 10));
//
//        // Start all threads concurrently
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//}
