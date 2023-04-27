/*
import java.util.Scanner;

class House {

    int landSize;//ขนาดที่ดินในหน่วยตารางวา
    int quality;//คุณภาพวัสดุบ้าน
    int floors;//จำนวนชั้นของตัวบ้าน
    int houseArea;//พื้นที่ใช้สอยของตัวบ้านในหน่วยตารางเมตร 
    public int price;

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

public class HousePrice1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int landSize = scan.nextInt();
        int quality = scan.nextInt();
        int floors = scan.nextInt();
        int houseArea = scan.nextInt();

        House house = new House(landSize, quality, floors, houseArea);
        System.out.println(house.landSize + " " + house.quality + " " + house.floors + " " + house.houseArea);
        System.out.println(house.price);

    }
}
*/