
import java.util.Scanner;

class FoodShop {

    int nFoods;
    String name;

    public FoodShop(String name) {
        this.nFoods = 0;
        this.name = name;
    }

    boolean addFood() {
        boolean check = false;
        if (nFoods < 5) {
            nFoods++;
            check = true;
            System.out.print(nFoods + " ");
        } else {
            System.out.print(-1+" ");
        }
        return check;
    }

    void printMenu() {
        System.out.print(name + " ");
        System.out.println(nFoods);
    }
}

public class FoodTiger1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        FoodShop[] fs = new FoodShop[n + 1];
        for (int i = 1; i <= n; ++i) {
            String name = scan.next();
            fs[i] = new FoodShop(name);
        }

        int q = scan.nextInt();
        for (int i = 0; i < q; ++i) {
            int s = scan.nextInt();
            boolean ret = fs[s].addFood();
            System.out.println(ret);
        }
        for (int i = 1; i <= n; ++i) {
            fs[i].printMenu();
        }
    }
}
