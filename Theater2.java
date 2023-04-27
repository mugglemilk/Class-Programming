
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kanyanat Pumiwatr
 */
public class Theater2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int threeD1 = scan.nextInt();
        int luxury1 = scan.nextInt();
        int numSeats = scan.nextInt();
        boolean threeD = false;
        boolean luxury = false;
        if (threeD1 == 1) {
            threeD = true;
        }
        if (luxury1 == 1) {
            luxury = true;
        }
        Theater t = new Theater(threeD, luxury, numSeats);

        String dummy = scan.nextLine(); // throw away new line character
        String title = scan.nextLine();
        t.setTitle(title);

        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);

        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int numberOfSeats = scan.nextInt();
            int seatNumber = scan.nextInt();
            int totalPrice;
            if (numberOfSeats == 1) {
                totalPrice = t.reserveOne(seatNumber);
            } else {
                totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);
            }
            if (totalPrice > 0) {
                System.out.println(totalPrice);
            }
        }

        t.printInfo();
    }
}
