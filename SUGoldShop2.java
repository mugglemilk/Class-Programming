
import java.util.Scanner;

class item2 {

    boolean type;
    double weight;

    item2(boolean type, double weight) {
        this.type = type;
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
}

public class SUGoldShop2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double price = scan.nextInt();
        double nsaleWeight = 0;
        double nsalePrice = 0;
        double nbuyWeight = 0;
        double nbuyPrice = 0;

        for (int i = 0; i < n; ++i) {
            String gold1 = scan.next();
            String gold2 = scan.next();
            double weight = scan.nextDouble();
            item2 gold = null;
            if(gold1.equalsIgnoreCase("s")){
                nsaleWeight += weight;
                if(gold2.equalsIgnoreCase("t")){
                    gold = new item2(true, weight);
                    nsalePrice += gold.saleprice(price);
                }
                else{
                    gold = new item2(false, weight);
                    nsalePrice += gold.saleprice(price);
                }
            }
            else{
                nbuyWeight += weight;
                if(gold2.equalsIgnoreCase("t")){
                    gold = new item2(true, weight);
                    nbuyPrice += gold.buyprice(price);
                }
                else{
                    gold = new item2(false, weight);
                    nbuyPrice += gold.buyprice(price);
                }
            }
        }
        System.out.println(nsaleWeight + " " + nsalePrice);
        System.out.println(nbuyWeight + " " + nbuyPrice);
    }
}
