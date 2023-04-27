
import java.util.Scanner;

class item {

    boolean type;//ทองรูปพรรณ แท่ง
    double weight;

    item(boolean type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    item(double weight) {
        type = true;
        this.weight = weight;
    }

    double saleprice(double price) {
        if (type) {
            return (price + 1000) * weight;
        } else {
            return price * weight;
        }
    }

    double buyprice(double price) {
        if (type) {
            return price * weight * 0.98;
        } else {
            return (price - 100) * weight;
        }
    }

    void showdetail(double price) {
        if (type) {
            System.out.print("ornament " + weight + " baht");
        } else {
            System.out.print("bar " + weight + " baht");
        }
    }

    public class SUGoldShop1 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            double pricegold = scan.nextDouble();
            item[] arrayx = new item[n];
            for (int i = 0; i < n; i++) {
                String cmdline = scan.next();
                String attgold = scan.next();
                double weight = scan.nextDouble();
                if (attgold.equalsIgnoreCase("t")) {
                    arrayx[i] = new item(true, weight);
                } else {
                    arrayx[i] = new item(false, weight);
                }
                arrayx[i].showdetail(pricegold);
                if (cmdline.equalsIgnoreCase("s")) {
                    System.out.println(" sale " + arrayx[i].saleprice(pricegold));
                } else if (cmdline.equalsIgnoreCase("b")) {
                    System.out.println(" buy " + arrayx[i].buyprice(pricegold));
                }
            }
        }
    }
}
