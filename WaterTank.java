
import java.util.Scanner;

class WaterTank {

    int capacity;
    int volume;

    public WaterTank(int width, int length, int height) {
        capacity = width * length * height;
        volume = 0;
    }

    int fill(int water) {
        if (capacity < (volume + water)) {
            System.out.println("Cannot fill the tank");
            return -1;
        } else {
            volume += water;
            return volume;
        }
    }
}

public class TankObserver {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        int length = scan.nextInt();
        int height = scan.nextInt();
        WaterTank water = new WaterTank(width, length, height);
        for (int i = 0; i < 5; ++i) {
            int amount = scan.nextInt();
            int a = water.fill(amount);
            System.out.println(a);
        }
    }
}
