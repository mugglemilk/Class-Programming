
import java.util.Scanner;

class Food {

    String names;
    String FirstMenu;
    int weight1;
    int callories;

    public Food(String names, String FirstMenu, int weight1, int callories) {
        this.names = names;
        this.FirstMenu = FirstMenu;
        this.weight1 = weight1;
        this.callories = (callories * weight1);
    }

    void addContent(String FirstMenu, int weight1, int callories) {
        this.weight1 += weight1;
        this.FirstMenu += " " + FirstMenu;
        this.callories += (callories * weight1);
    }

    void printInfo() {
        System.out.println(names);
        System.out.println(weight1 + " " + callories);
        System.out.print(FirstMenu+" ");
    }
}

public class FoodContents2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String names = scan.next();
        String FirstMenu = scan.next();
        int weight1 = scan.nextInt();
        int callories = scan.nextInt();
        Food food = new Food(names, FirstMenu, weight1, callories);
        for (;;) {
            int k = scan.nextInt();
            if (k == 0) {
                break;
            } else if (k == 1) {
                food.printInfo();
            } else if (k == 2) {
                String SecondMenu = scan.next();
                int weight2 = scan.nextInt();
                int callories2 = scan.nextInt();
                food.addContent(SecondMenu, weight2, callories2);
            }
        }
    }
}
