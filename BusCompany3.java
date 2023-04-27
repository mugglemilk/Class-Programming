/*
import java.util.Scanner;

class Bus {

    String id;//ชื่อรหัสรถบัส
    private int seats;//จำนวนที่นั่งทั้งหมด
    int type; //ชนิด
    private int reserve;//จำนวนที่นั่งที่มีคนจองไปแล้ว
    private boolean status;//สถานะของรถบัส

    public Bus(String id, int type, int seats) {
        this.id = id;
        this.seats = seats;
        this.type = type;
        this.reserve = reserve;
        this.status = true;
    }

    void printStats() {
        System.out.println(id + " ");
        if (type == 1) {
            System.out.println("Fan");
        } else if (type == 2) {
            System.out.println("P1");
        } else if (type == 3) {
            System.out.println("VIP");
        }
        System.out.print(reserve + " ");
        System.out.println(seats + " ");
        if (status) {
            System.out.println("Active");
        } else {
            System.out.println("Inactive");
        }
    }

    boolean reserve(int k) {
        boolean check = false;
        if (k < 0 || seats < k + reserve || !status) {

        } else {
            reserve += k;
            check = true;
        }
        return check;
    }

    void sendToRepair() {
        status = false;
    }

    void backToService() {
        status = true;
    }
}

public class BusCompany3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus b = new Bus(id, type, seats);

        int q = scan.nextInt();
        for (int i = 0; i < q; ++i) {
            int p = scan.nextInt();
            int k = scan.nextInt();
            int t = scan.nextInt();
                b.reserve(k);
            if (p == 1) {
            } else if (p == 2) {
                b.sendToRepair();
            } else if (p == 3) {
                b.backToService();
            }
            b.printStats();
        }

    }
}
*/