
import java.util.Scanner;

class Character {

    String[] msg;
    int num = 0;

    public Character(String[] msg) {
        this.msg = msg;
    }

    void speak() {
        num += 1;
        if(num >= msg.length){
            num = 1;
        }
        System.out.println(msg[num]);

    }
}

public class CharVoice1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] msg = new String[n+1];
        scan.nextLine(); // Skip end-line char
        for (int i = 1; i <= n; ++i) {
            msg[i] = scan.nextLine();
        }
        Character character = new Character(msg);
        int k = scan.nextInt();
        for (int i = 0; i < k; ++i) {
            character.speak();
        }
    }
}
