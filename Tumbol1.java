/*
import java.util.Scanner;

class Tumbol {

    String name;
    int longtitude;
    int latitude;
    int people;
    int availBudget;

    public Tumbol(String name, int longtitude, int latitude, int people) {
        this.name = name;
        this.longtitude = longtitude;
        this.latitude = latitude;
        this.people = people;
        this.availBudget = people * 5000;//งบประมาณที่ตำบลจะได้
    }

    void allocateBudget(int[] budget) {//งบประมาณของโครงการ
        boolean check = false;
        for (int i = 1; i < budget.length; ++i) {
            if (availBudget >= budget[i]) {
                availBudget -= budget[i];
                System.out.print(i + " ");
                check = true;
            }
        }
        if (!check) {
            System.out.println("none");
        }
        System.out.println();
    }
}

public class Tumbol1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int longtitude = scan.nextInt();
        int latitude = scan.nextInt();
        int people = scan.nextInt();
        int n = scan.nextInt();//จำนวนโครงการ
        int[] budget = new int[n + 1];//งบประมาณของแต่ละโครงการ
        for (int i = 1; i <= n; ++i) {
            budget[i] = scan.nextInt();
        }
        Tumbol tumbol = new Tumbol(name, longtitude, latitude, people);
        tumbol.allocateBudget(budget);
    }
}
*/