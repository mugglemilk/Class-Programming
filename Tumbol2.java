
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

    int allocateBudget(int[] budget) {//งบประมาณของโครงการ
        boolean check = false;
        int sum = 0;
        for (int i = 1; i < budget.length; ++i) {
            if (availBudget >= budget[i]) {
                availBudget -= budget[i];
                sum += budget[i];
                System.out.print(i + " ");
                check = true;
            }
        }
        if (!check) {
            System.out.print("none");
        }
        return sum;
    }
}

public class Tumbol2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        Tumbol[] tumbols = new Tumbol[k];
        for (int i = 0; i < k; ++i) {
            String name = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int population = scan.nextInt();
            tumbols[i] = new Tumbol(name, x, y, population);
        }

        int total = 0;
        for (int i = 0; i < k; ++i) {
            int N = scan.nextInt();
            int[] budget = new int[N+1];
            for (int j = 1; j <= N; ++j) {
                budget[j] = scan.nextInt();
            }
            total += tumbols[i].allocateBudget(budget);
            System.out.println();
        }
        System.out.println(total);
    }
}
