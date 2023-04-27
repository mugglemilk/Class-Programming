
import java.util.Scanner;

class Party {
    
    String partyname;
    int partymember;
    String[] names;
    String[] surnames;
    int[] regions;
    
    Party(String partyname, int partymember, Scanner in) {
        this.partyname = partyname;
        this.partymember = partymember;
        names = new String[partymember + 1];
        surnames = new String[partymember + 1];
        regions = new int[partymember + 1];
        
        for (int i = 1; i <= partymember; ++i) {
            names[i] = scan.next();
            surnames[i] = scan.next();
            regions[i] = scan.nextInt();
        }
    }
    
    private Party(String string, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void printInfo(int region) {
        if (region < 0) {
            System.out.println("invalid region number");
        } else if (region == 0) {
            for (int i = 1; i <= partymember; ++i) {
                System.out.println(names[i] + " " + surnames[i]);
            }
        } else {
            int count = 0;
            for (int i = 1; i <= partymember; ++i) {
                if (regions[i] == region) {
                    System.out.println(names[i] + " " + surnames[i]);
                }
            }
            if (count == 0) {
                System.out.println("none");
            }
        }
    }
}
    public class KorKorTor {
        
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int numbParty = scan.nextInt();
            String[] partyname = new String[numbParty + 1];
            int[] partymember = new int[numbParty + 1];
            for (int i = 1; i < numbParty; ++i) {
                partyname[i] = scan.next();
                partymember[i] = scan.nextInt();
            }
            Party[] party = new Party[numbParty + 1];
            for (int i = 1; i < numbParty; ++i) {
                party[i] = new Party(partyname[i], partymember[i]);
            }
            int k = scan.nextInt();
            for (int i = 0; i < k; ++i) {
                int partyNumber = scan.nextInt();
                int regionNumber = scan.nextInt();
                party[partyNumber].printInfo(regionNumber);
            }
        }
    }

