
import java.util.Scanner;

class House {

    int landSize;//ขนาดที่ดินในหน่วยตารางวา
    int quality;//คุณภาพวัสดุบ้าน
    int floors;//จำนวนชั้นของตัวบ้าน
    int houseArea;//พื้นที่ใช้สอยของตัวบ้านในหน่วยตารางเมตร 
    public int price;
    int maxprice = Integer.MIN_VALUE;//ราคาบ้านสูงสุดที่ผู้ใช้รับได้
    int minhouseArea = Integer.MAX_VALUE;//พื้นที่ใช้สอยของตัวบ้านที่น้อยที่สุดที่ผู้ใช้รับได้

    public House(int landSize, int quality, int floors, int houseArea) {
        this.landSize = landSize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        this.price = computePrice(landSize, quality, floors, houseArea);//รอ return จาก computeprice
    }

    int computePrice(int landSize, int quality, int floors, int houseArea) {
        int sum = 0;
        sum += 10000 * landSize;

        if (floors > 1) {
            sum += (floors - 1) * 200000;
        }
        if (quality == 1) {
            sum += houseArea * 10000;
        } else if (quality == 2) {
            sum += houseArea * 8000;
        } else if (quality == 3) {
            sum += houseArea * 5000;
        }
        return sum;

    }
}

public class HousePrice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        House[] house = new House[n + 1];
        for (int i = 1; i <= n; ++i) {
            int landSize = scan.nextInt();
            int quality = scan.nextInt();
            int floors = scan.nextInt();
            int houseArea = scan.nextInt();
            house[i] = new House(landSize, quality, floors, houseArea);
        }
        int maxprice = scan.nextInt();//ราคาบ้านสูงสุดที่ผู้ใช้รับได้
        int minhouseArea = scan.nextInt();//พื้นที่ใช้สอยของตัวบ้านที่น้อยที่สุดที่ผู้ใช้รับได้
        boolean check = true;
        for (int i = 1; i <= n; ++i) {
            if (maxprice >= house[i].price && minhouseArea <= house[i].houseArea) {
                System.out.println(house[i].landSize + " " + house[i].quality + " " + house[i].floors + " " + house[i].houseArea + " " + house[i].price);
                check = false;
            }
        }
        if (check) {
            System.out.println("none");
        }
    }
}
