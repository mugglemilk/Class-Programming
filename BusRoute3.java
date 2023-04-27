
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
    
    void getTripInfo(int first, int last) {
        if (first < 1 || first > distances.length - 1 || last < 1 || last > distances.length - 1 || first >= last) {
            System.out.println("invalid number");
        } else {
            int sum = 0;
            for (int i = first+1; i <= last; ++i) {
                sum += distances[i];
            }
            System.out.println(names[first] + " " + names[last] + " " + sum);
        }
    }
}

public class BusRoute3 {
    
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
        for (int i = 1; i <= k; ++i) {
            int fist = scan.nextInt();
            int last = scan.nextInt();
            route.getTripInfo(fist, last);
        }
    }
}
