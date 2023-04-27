
import java.util.Scanner;

class Runner {

    String name;//ข้อมูลผู้เข้าแข่งขัน
    String BIB;//รหัสบิบ
    static int num = 1;//ข้อมูลแบบสถิติเก็บจำนวนผู้สมัครแข่งขัน

    public Runner(String name, int type) {
        this.name = name;
        if (type == 1) {
            BIB = String.format("A%03d", num);
            num++;
        } else if (type == 2) {
            BIB = String.format("B%03d", num);
            num++;
        } else if (type == 3) {
            BIB = String.format("C%03d", num);
            num++;
        } else if (type == 4) {
            BIB = String.format("D%03d", num);
            num++;
        }
    }

    void printInfo() {
        if (BIB == null) {
            System.out.println("INVALID");
        }
        else{
            System.out.println(BIB + " " + name);
        }
        
    }

}

public class Marathon1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Runner[] a = new Runner[n];
        for (int i = 0; i < n; ++i) {
            String name = scan.next();
            int type = scan.nextInt();
            a[i] = new Runner(name, type);
        }
        for (int i = 0; i < n; ++i) {
            a[i].printInfo();
        }
    }
}
