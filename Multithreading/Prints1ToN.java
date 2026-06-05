/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;
class NumberPrinter extends Thread {
    private int n;

    public NumberPrinter(int n) {
        this.n = n;
    }

    public void run() {
        try {
            for (int i = 1; i <= n; i++) {
                System.out.println(Thread.currentThread().getName() + " prints: " + i);
                Thread.sleep(100); 
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        } catch (Exception e) {
            System.out.println("Exception in " + Thread.currentThread().getName() + ": " + e.getMessage());
        }
    }
}

 public class Prints1ToN  {
    public static void main(String[] args) {
        int n = 5;

        Thread t1 = new NumberPrinter(n);
        Thread t2 = new NumberPrinter(n);
        Thread t3 = new NumberPrinter(n);

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
