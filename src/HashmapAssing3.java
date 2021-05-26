import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapAssing3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Yokesh", 91857);
        hashMap.put("Nrupul", 63458);
        hashMap.put("Prateek", 53427);
        hashMap.put("Aman", 95734);
        hashMap.put("Madhankumar", 74398);

        System.out.println("Enter the user");
        String user = sc.nextLine();
        System.out.println("user" + "=" + user);

        boolean isfound = false;

        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            if (map.getKey().equals(user)) {
                isfound = true;
                System.out.println(map.getValue());
                break;
            }
        }
        if (!isfound) {
            System.out.println("No User Found");
        }

    }
}
//O(n)