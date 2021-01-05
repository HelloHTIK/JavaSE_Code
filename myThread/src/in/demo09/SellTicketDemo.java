package in.demo09;

/**
 * @Author WTIHK
 * @Date 2021/1/6
 */

/*
    买票案例
 */

public class SellTicketDemo {
    public static void main(String[] args) {

        SellTicket st = new SellTicket();

        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
