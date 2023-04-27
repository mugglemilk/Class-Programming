
import java.util.Scanner;

class Carriage {

    int nseat;
    int type;
    int id;
    int nreserve;

    Carriage(int nseat, int type, int id) {
        this.nseat = nseat;
        this.type = type;
        this.id = id;

        if (type == 3) {
            this.nseat += 10;
        }
    }

    void reserveSeats(int seatreserve) {
        if (nreserve + seatreserve <= nseat) {
            nreserve += seatreserve;
        }
    }

    void printStats() {

        if (type == 1 || type == 2) {
            System.out.println(id + " " + type + " " + nreserve + " " + nseat);
        } else {
            int nstand = 10;
            int nseat = this.nseat - nstand;
            int nreverse = this.nreserve;
            int nreversestand = 0;
            if (this.nreserve > nseat) {
                nreserve = nseat;
                nreversestand = this.nreserve - nseat;
            }
            System.out.println(id + " " + type + " " + nreserve + " " + nseat + " " + nreversestand + " " + nstand);
        }
    }
}

public class Train {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Carriage[] carriages = new Carriage[n + 1];
        for (int i = 1; i <= n; ++i) {
            int type = scan.nextInt();
            int nseat = scan.nextInt();
            int id = scan.nextInt();

            carriages[i] = new Carriage(nseat, type, id);
        }
        int k = scan.nextInt();
        for (int i = 0; i < k; ++i) {
            int p = scan.nextInt();
            int q = scan.nextInt();
            carriages[p].reserveSeats(q);
        }
        for (int i = 1; i <= n; ++i) {
            carriages[i].printStats();
        }
    }
}
