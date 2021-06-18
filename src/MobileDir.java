import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MobileDir {
    public static void main(String[] args) {
        try {
            print();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void print() {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> hashMap = new LinkedHashMap<>();

        while (true) {
            System.out.println("Enter name");
            String name = sc.next();
            if (name.equals("Q")) {
                break;
            }
            System.out.println("Enter Mobile number");
            int num = sc.nextInt();

            hashMap.put(name, num);

        }
        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {

            for (int i = 0; i < map.getKey().length(); i++) {
                if (map.getKey().charAt(i) == ' ') {
                    map.getKey().trim();
                }
            }
            System.out.println(map.getKey() + "-" + map.getValue());

            char arr = ' ';
            for (int i = 0; i < map.getKey().length(); i++) {
                arr = map.getKey().charAt(i);
                System.out.print(arr);
                if (i == 4) {
                    break;
                }
            }

            int count = 1;
            int sum = 0;
            for (int i = 0; i < map.getValue(); i++) {
                sum += map.getValue();
                count++;
            }
            int average = sum / count;
            System.out.println(arr + average);
        }
    }
}
