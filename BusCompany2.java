
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

    boolean reserve(int k) {
        boolean check = false;

        if (k < 0 || reserve + k > seats || !status) {
            return false;
        } else {
            reserve += k;
            return true;
        }
    }

    void sendToRepair() {
        status = false;
    }

    void backToService() {
        status = true;
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

public class BusCompany2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus bus = new Bus(id, type, seats);

        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int P = scan.nextInt();
            int K = scan.nextInt();
            if (P == 1) {
                bus.reserve(K);
            } else if (P == 2) {
                bus.sendToRepair();
            } else if (P == 3) {
                bus.backToService();
            }
            bus.printStats();
        }
    }
}
