
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

public class LectureRoom1Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    }
}
