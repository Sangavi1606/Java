import java.util.*;

public class HashSetProbm2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Character, Integer> hashmap = new LinkedHashMap<>();

        HashSet<String> hashSet = new LinkedHashSet<>();

        String s = "Masai School";
        int count;
        for (int i = 0; i < s.length(); i++) {
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count += 1;
                }
            }
            hashmap.put(s.charAt(i), count);

        }
        for (Map.Entry<Character, Integer> map : hashmap.entrySet()) {
            System.out.println(map.getKey() + "-" + map.getValue());
        }
    }
}
