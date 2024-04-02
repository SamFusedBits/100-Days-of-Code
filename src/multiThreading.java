package src;
import java.util.ArrayList;
import java.util.List;

public class multiThreading {
/*
    Thread: A thread is the smallest unit of execution within a process. It allows concurrent execution of tasks within a program.

    We can create Threads by:
    Extending the Thread class: Create a subclass of Thread and override the run() method to define the task to be executed.
    Implementing the Runnable interface: Implement the run() method in a class that implements the Runnable interface. Then, create a Thread object and pass an instance of this class to its constructor.
*/
    public static class MyThread extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }

        public static void main(String args[]) {
            MyThread t1 = new MyThread();
            MyThread t2 = new MyThread();
            t1.start();
            t2.start();
        }
    }

    public static class MyRunnable implements Runnable {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }

        public static void main(String args[]) {
            Thread t1 = new Thread(new MyRunnable()); // Create thread passing instance of MyRunnable
            Thread t2 = new Thread(new MyRunnable());
            t1.start(); // Start the first thread
            t2.start(); // Start the second thread
        }
    }

//   Q. Consider a scenario where a company needs to process orders from multiple customers concurrently.
//    Each order processing task will be handled by a separate thread.

    public static class OrderProcessor extends Thread {
        private String order;

        public OrderProcessor(String order) {
            this.order = order;
        }

        public void run() {
            System.out.println("Processing order: " + order);
            // order processing time
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Order processed: " + order);
        }
    }

        public static void main(String[] args) {
            // List of orders to be processed
            List<String> orders = new ArrayList<>();
            orders.add("Order 1");
            orders.add("Order 2");
            orders.add("Order 3");
            orders.add("Order 4");
            orders.add("Order 5");

            // Process each order concurrently using threads
            for (String order : orders) {
                new OrderProcessor(order).start();
            }
        }
    }
