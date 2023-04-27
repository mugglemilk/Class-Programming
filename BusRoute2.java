/*
import java.util.Scanner;

class Route {

    String[] names;
    int[] distances;

    public Route(String[] name, int[] distances) {
        this.names = name;
        this.distances = distances;
    }

    void getStopInfo(int numb) {
        if (numb >= 1 && numb < distances.length) {
            System.out.println(names[numb] + " " + distances[numb]);
        } else {
            System.out.println("invalid number");
        }
    }

    void summarizeRoute() {
        int sum = 0;
        for (int i = 1; i < distances.length; ++i) {
            sum += distances[i];
        }
        System.out.print(names[1] + " " + names[names.length - 1] + " " + sum);
    }
}

public class BusRoute2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] names = new String[n + 1];
        int[] distances = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            names[i] = scan.next();
            distances[i] = scan.nextInt();
        }
        Route route = new Route(names, distances);
        route.summarizeRoute();
    }
}
*/