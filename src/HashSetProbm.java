import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class HashSetProbm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<Character> hashset = new LinkedHashSet<>();

        // String[] s= {"M","a","s","a","i"," ", "S", "c", "h", "o", "o", "l"};
        char[] c = {'M', 'a', 's', 'a', 'i', ' ', 'S', 'c', 'h', 'o', 'o', 'l'};
        for (Character i : c) {
            hashset.add(i);
        }

        System.out.println(hashset);
    }
}
