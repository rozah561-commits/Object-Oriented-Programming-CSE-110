/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

class Printer {
  
    public synchronized void print(String document) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " started printing: " + document);
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }
        System.out.println(threadName + " finished printing: " + document);
    }
}

class PrintJob implements Runnable {
    private Printer printer;
    private String document;

    public PrintJob(Printer printer, String document) {
        this.printer = printer;
        this.document = document;
    }

    public void run() {
        printer.print(document);
    }
}

public class PrintSystemTest {
    public static void main(String[] args) {
        Printer printer = new Printer(); 

        Thread t1 = new Thread(new PrintJob(printer, "Document-A"), "User-1");
        Thread t2 = new Thread(new PrintJob(printer, "Document-B"), "User-2");
        Thread t3 = new Thread(new PrintJob(printer, "Document-C"), "User-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
