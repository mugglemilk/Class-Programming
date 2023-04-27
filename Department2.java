
import java.util.Scanner;

class Dept {

    int ministryBudget;
    int eduFee;
    int serviceFee;
    int donation;
    int salary;
    int elec;
    int eduCost;
    int sumIncome;
    int sumExpense;

    public Dept(int n, int k) {
        sumIncome = computeIncome(n, k);
        sumExpense = computeExpense(n, k);
        System.out.println("total income = " + sumIncome);
        System.out.println("total expense = " + sumExpense);
        System.out.println("income – expense = " + (sumIncome - sumExpense));
    }

    int computeIncome(int n, int k) {

        ministryBudget = (n * 500000) + (k * 3000);
        eduFee = k * 5000;
        serviceFee = 300000;
        donation = 100000;
        int totalincome = ministryBudget + eduFee + serviceFee + donation;
        return totalincome;
    }

    void printReport() {
        
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
        System.out.println("salary = " + salary);
        System.out.println("electricity = " + elec);
        System.out.println("educational cost = " + eduCost);
    }

    int computeExpense(int n, int k) {

        salary = n * 600000;
        elec = (n + k )* 2000;
        eduCost = k * 4000;
        int totalexpense = salary + elec + eduCost;
        return totalexpense;
    }
}

public class Department2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        Dept dept = new Dept(n, k);
        dept.printReport();
    }
}
