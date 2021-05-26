import java.util.*;

public class HashmapAssing2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, List> hashMap = new HashMap<>();
        while (true) {
            List<String> list = new ArrayList<>();

            System.out.println("Enter name");
            String name = sc.nextLine();
            if (name.equals("-1")) {
                break;
            }

            while (true) {
                System.out.println("Enter skills");
                String skill = sc.nextLine();
                if (skill.equals("-1")) {
                    break;
                }
                list.add(skill);

            }
            hashMap.put(name, list);
        }
        for (Map.Entry<String, List> map : hashMap.entrySet()) {

            //System.out.println(map.getKey()+"-"+map.getValue());
            for (int i = 0; i < map.getValue().size(); i++) {
                if (map.getValue().get(i).equals("java")) {
                    System.out.println(map.getKey());
                    break;
                }
            }
        }
    }
}
