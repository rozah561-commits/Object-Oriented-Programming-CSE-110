/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

class Bus {
    private boolean[] seats;

    public Bus(int totalSeats) {
        seats = new boolean[totalSeats];
    }
    public synchronized void bookSeat(int seatNumber) {
        String user = Thread.currentThread().getName();

        if (seatNumber < 1 || seatNumber > seats.length) {
            System.out.println(user + ": Invalid seat number " + seatNumber);
            return;
        }

        if (!seats[seatNumber - 1]) {
            System.out.println(user + " is booking seat " + seatNumber);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(user + " was interrupted.");
            }
            seats[seatNumber - 1] = true;
            System.out.println(user + " successfully booked seat " + seatNumber);
        } else {
            System.out.println(user + ": Seat " + seatNumber + " is already booked");
        }
    }
}

class Booking implements Runnable {
    private Bus bus;
    private int seatNumber;

    public Booking(Bus bus, int seatNumber) {
        this.bus = bus;
        this.seatNumber = seatNumber;
    }

    public void run() {
        bus.bookSeat(seatNumber);
    }
}

public class BusBookingSystemTest {
    public static void main(String[] args) {
        Bus bus = new Bus(5);

        Thread t1 = new Thread(new Booking(bus, 1), "User-1");
        Thread t2 = new Thread(new Booking(bus, 2), "User-2");
        Thread t3 = new Thread(new Booking(bus, 1), "User-3"); 
        Thread t4 = new Thread(new Booking(bus, 3), "User-4");
        Thread t5 = new Thread(new Booking(bus, 2), "User-5"); 
        Thread t6 = new Thread(new Booking(bus, 6), "User-6"); 

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
