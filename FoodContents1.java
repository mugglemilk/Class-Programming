/*
import java.util.Scanner;

class Food {

    String names;
    String FirstMenu;
    int weight1;

    public Food(String names, String FirstMenu, int weight1) {
        this.names = names;
        this.FirstMenu = FirstMenu;
        this.weight1 = weight1;
    }

    void addContent(String FirstMenu, int weight1) {
        this.weight1 += weight1;
        this.FirstMenu += " " + FirstMenu;
    }

    void printInfo() {
        System.out.println(names);
        System.out.println(weight1);
        System.out.println(FirstMenu);
    }
}

public class FoodContents1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String names = scan.next();
        String FirstMenu = scan.next();
        int weight1 = scan.nextInt();
        Food food = new Food(names, FirstMenu, weight1);
        for (;;) {
            int k = scan.nextInt();
            if (k == 0) {
                break;
            } else if (k == 1) {
                food.printInfo();
            } else if (k == 2) {
                String SecondMenu = scan.next();
                int weight2 = scan.nextInt();
                food.addContent(SecondMenu, weight2);
            }
        }
    }
}
*/