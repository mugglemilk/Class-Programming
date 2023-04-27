
import java.util.Scanner;

class ZooTicket {

    String name;
    boolean ride = false;
    boolean seal = false;
    boolean tiger = false;

    public ZooTicket(String name) {
        this.name = name;
    }

    void bookRide() {
        ride = true;
    }

    void bookSealShow() {
        seal = true;
    }

    void bookTigerShow() {
        tiger = true;
    }

    boolean useRide() {
        if (ride) {
            System.out.println("okay");
            ride = false;
            return true;
        } else {
            System.out.println("no");
            return false;
        }
    }

    boolean enterSealShow() {
        if (seal) {
            System.out.println("okay");
            seal = false;
            return true;
        } else {
            System.out.println("no");
            return false;
        }
    }

    boolean enterTigerShow() {
        if (tiger) {
            System.out.println("okay");
            tiger = false;
            return true;
        } else {
            System.out.println("no");
            return false;
        }
    }

    void summarize() {
        System.out.println(name);
        int sum = 100;
        if (ride) {
            sum += 40;
            System.out.println("Ride");
        }
        if (seal) {
            sum += 50;
            System.out.println("Seal");
        }
        if (tiger) {
            sum += 65;
            System.out.println("Tiger");
        }
        System.out.println(sum);
    }
}

public class ZooTicket2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        ZooTicket zoo = new ZooTicket(name);
        for (;;) {
            int services1 = scan.nextInt();
            if (services1 == 0) {
                break;
            } else if (services1 == 1) {
                zoo.bookRide();
            } else if (services1 == 2) {
                zoo.bookSealShow();
            } else if (services1 == 3) {
                zoo.bookTigerShow();
            }
        }
        zoo.summarize();
        int k = scan.nextInt();
        for (int i = 0; i < k; ++i) {
            int services2 = scan.nextInt();
            if (services2 == 1) {
                System.out.println(zoo.useRide());
            } else if (services2 == 2) {
                System.out.println(zoo.enterSealShow());
            } else if (services2 == 3) {
                System.out.println(zoo.enterTigerShow());
            }
        }
    }
}
