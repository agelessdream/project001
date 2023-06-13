package thread;

public class Ticket implements Runnable {
    int ticket = 100;

    @Override
    public void run() {
        while (ticket > 0) {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + "卖出一张票，票号:" + ticket);
                ticket--;
            }
        }
    }
}

class Sell {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread t1 = new Thread(t, "窗口1");
        Thread t2 = new Thread(t, "窗口2");
        Thread t3 = new Thread(t, "窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
