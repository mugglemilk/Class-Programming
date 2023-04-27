
import java.util.Scanner;

class Ship {

    int capacity;

    Ship(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0;
        }
    }

    int load(int[] weight, int con) {
        int total = con;
        int numb = 0;
        for (int i = con; i < weight.length; ++i) {
            if (weight[i] + numb > capacity) {
                total = i;
                break;
            } else {
                numb += weight[i];
                total = i + 1;
            }
        }
        return total;
    }
}

public class Cerry {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        Ship[] ship = new Ship[m];
        for (int i = 0; i < m; i++) {
            int cap = in.nextInt();
            ship[i] = new Ship(cap);
        }
        int p1 = 0;
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = in.nextInt();
        }
        for (int i = 0; i < m; ++i) {
            p1 = ship[i].load(weight, p1);
        }
        System.out.print(p1 + " ");
        int sum_weight = 0;
        for (int i = 0; i < p1; i++) {
            sum_weight += weight[i];
        }
        System.out.println(sum_weight);
    }
}
