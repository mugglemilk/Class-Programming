/*
import java.util.Scanner;

class Route {

    String[] names;
    int[] distances;

    public Route(String[] names, int[] distances) {
        this.names = names;
        this.distances = distances;
    }

    void getStopInfo(int numb) {
        if (numb >= 1 && numb < distances.length) {
            System.out.println(names[numb]+" "+distances[numb]);
        }else{
            System.out.println("invalid number");
        }
    }
}

public class BusRoute1 {

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
        int k = scan.nextInt();
        for (int i = 0; i < k; ++i) {
            int numb = scan.nextInt();
            route.getStopInfo(numb);
        }
    }
}
*/