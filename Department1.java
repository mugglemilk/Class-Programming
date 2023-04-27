/*
import java.util.Scanner;

class Dept {

    int ministryBudget;
    int eduFee;
    int serviceFee;
    int donation;

    public Dept(int n, int k) {
        computeIncome(n, k);
    }

    void computeIncome(int n, int k) {
        ministryBudget = (n * 500000) + (k * 3000);
        eduFee = k*5000;
        serviceFee = 300000;
        donation = 100000;
    }

    void printReport() {
        System.out.println("ministry budget = "+ministryBudget);
        System.out.println("education fee = "+eduFee);
        System.out.println("service fee = "+serviceFee);
        System.out.println("donation = "+donation);
    }
}

public class Department1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        Dept dept = new Dept(n, k);
        dept.printReport();
    }
}
*/