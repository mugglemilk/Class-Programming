/*
import java.util.Scanner;

class Bus {

    String id;
    int type;
    int seats;
    int reserve;
    boolean status = false;

    public Bus(String id, int type, int seats) {
        this.id = id;
        this.type = type;
        this.seats = seats;
        this.reserve = 0;
        this.status = true;
    }

    void printStats() {
        System.out.println(id);
        if (type == 1) {
            System.out.println("Fan");
        } else if (type == 2) {
            System.out.println("P1");
        } else if (type == 3) {
            System.out.println("VIP");
        }
        System.out.println(reserve + " " + seats);
        if (status) {
            System.out.println("Active");
        } else {
            System.out.println("Inactive");
        }
    }
}

public class BusCompany1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus bus = new Bus(id, type, seats);
        bus.printStats();
    }
}
*/