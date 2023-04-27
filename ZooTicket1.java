/*
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

public class ZooTicket1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        ZooTicket zoo = new ZooTicket(name);
        for (;;) {
            int services = scan.nextInt();
            if (services == 0) {
                break;
            } else if (services == 1) {
                zoo.bookRide();
            } else if (services == 2) {
                zoo.bookSealShow();
            } else if (services == 3) {
                zoo.bookTigerShow();
            }
        }
        zoo.summarize();
    }
}
*/