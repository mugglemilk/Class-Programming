/*
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

public class LectureRoom1 {

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
        for (int i = 0; i < 3; ++i) {
            int j = scan.nextInt();
            LectRoom room = rooms[j];
            System.out.println(room.classCode + " " + room.name + " " + room.capacity);
        }
    }
}
*/