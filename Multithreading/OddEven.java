/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;
class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.print(i + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
}
class ThreadB extends Thread {
    public void run() {
        try {
            Thread.sleep(100); 
        } catch (InterruptedException e) {}

        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {}
        }
    }
}
public class OddEven {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();

        t1.start();
        t2.start();
    }
}