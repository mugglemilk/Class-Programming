
import java.util.Scanner;

class Grader {

    String name;
    String desc;
    int[] pts;
    String[] sols;

    public Grader(String name, String desc, int[] pts, String[] sols) {
        this.name = name;
        this.desc = desc;
        this.pts = pts;
        this.sols = sols;
    }
}
