
import java.util.Scanner;

class LectRoom {

    int classCode;
    String name;
    int capacity;
    int currentSeats;

    LectRoom(int classCode, String name, int capacity) {
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
        this.currentSeats = 0;
    }

    boolean reserveSeats(int current) {
        if (capacity < currentSeats + current) {
            return false;
        } else {
            currentSeats += current;
            return true;
        }
    }
}

public class LectureRoom1Task4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        LectRoom[] rooms = new LectRoom[k + 1];
        for (int i = 1; i <= k; ++i) {
            int classCode = scan.nextInt();
            String name = scan.next();
            int capacity = scan.nextInt();
            rooms[i] = new LectRoom(classCode, name, capacity);
        }
        int n = scan.nextInt();
        for (int i = 0; i < n; ++i) {
            int noRoom = scan.nextInt();
            int countMem = scan.nextInt();
            boolean check = false;
            int num = 0;
            for (int a = 1; a <= k; a++) {
                if (rooms[a].classCode == noRoom) {
                    check = true;
                    num = a;
                }
            }
            if (!check) {
                System.out.println("sorr!y");
            } else {
                LectRoom room = rooms[num];
                if (room.capacity >= countMem) {
                    System.out.println(room.name);
                    room.capacity -= countMem;
                } else {
                    System.out.println("sorry");
                }

            }
        }
    }
}
