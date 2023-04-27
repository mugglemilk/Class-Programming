
import java.util.Scanner;
import java.util.Arrays;

class Audience {

    boolean isconnected;
    String[] msg;
    int posIndex;

    public Audience(String[] msg) {
        isconnected = true;
        this.msg = msg;
        posIndex = 0;
    }

    boolean isBeautiful() {
        boolean result = msg[posIndex % msg.length].equals("beautiful");
        posIndex += 1;
        return result;
    }
}

public class BeautifulBrotherBeautiful {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        String[] phrases = new String[k];
        scan.nextLine();
        for (int i = 0; i < k; ++i) {
            phrases[i] = scan.nextLine();
        }
        int c = scan.nextInt();
        Audience[] cs = new Audience[c + 1];
        for (int p = 1; p <= c; ++p) {
            int n = scan.nextInt();
            String[] msg = new String[n];
            scan.nextLine();
            for (int i = 0; i < n; ++i) {
                msg[i] = scan.nextLine();
            }
            cs[p] = new Audience(msg);
        }
        for (int i = 0; i < k; ++i) {
            String caster = phrases[i];
            boolean crack = caster.equals("crack");
            boolean kick = false;

            for (int p = 1; p <= c; ++p) {
                boolean beautiful = cs[p].isBeautiful();
                if (crack && beautiful == false && cs[p].isconnected == true) {
                    cs[p].isconnected = false;
                    kick = true;
                    System.out.print(p + " ");
                }
            }
            if (crack) {
                if (kick == false) {
                    System.out.println("x");
                } else {
                    System.out.println("");
                }
            }
        }
    }
}
