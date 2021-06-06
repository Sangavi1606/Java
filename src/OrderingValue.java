import java.util.HashMap;
import java.util.Map;

public class OrderingValue {
    public static void main(String[] args) {
        //revalue();
        //searchAdd();
        //maxNumTimes();
        //uniqueValue();
        //maximalNum();
        arrayFind1();
        arrayFind2();
    }

    public static void revalue() {
        int[] arr = {2, 0, 0, 1};
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((i == 0 && arr[j] != 0) || (i != 0)) {
                    if (arr[i] > arr[j]) {
                        swap = arr[i];
                        arr[i] = arr[j];
                        arr[j] = swap;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void searchAdd() {
        int[] arr = {8, 6, 4, 2, 5, 1, 3, 5};

        for (int i = 0; i < arr.length; i++) {  //n
            for (int j = i + 1; j < arr.length; j++) { //n  O(n*n)=O(n^2)
                if (arr[i] + arr[j] == 10) {
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }
    }

    public static void maxNumTimes() {
        int[] arr = {0, 2, 6, 6, 9, 6};
        int count = 1, value;

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int tempcount = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (tempcount < count) {
                value = temp;
                count = tempcount;
                System.out.println(value);
            }
        }
    }

    public static void uniqueValue() {
        int[] arr = {10, 20, 30, 10, 40, -2, 30};
        int[] val = new int[7];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 0) {
                val[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.println(val[i]);
        }
    }

    public static void maximalNum() {
        int[] arr = {1, 4, 0, 3};
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((i == 0 && arr[j] != 0) || (i != 0)) {
                    if (arr[i] < arr[j]) {
                        swap = arr[i];
                        arr[i] = arr[j];
                        arr[j] = swap;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void arrayFind1() {
        String s = "Masai School";
        int count;

        for (int i = 0; i < s.length(); i++) {
            count = 1;
            for (int j = 0; j < s.length(); j++) {
                if (i != j) {
                    if (s.charAt(i) == s.charAt(j)) {
                        count += 1;
                    }
                }
            }
            System.out.println(s.charAt(i) + "-" + count);
        }

    }

    public static void arrayFind2() {
        String s = "Masai School";
        int count;

        for (int i = 0; i < s.length(); i++) {
            count = 1;
            for (int j = 0; j < s.length(); j++) {
                if (i != j) {
                    if (s.charAt(i) == s.charAt(j)) {
                        count += 1;
                    }
                }
            }


            System.out.println(s.charAt(i) + "-" + count);
        }

    }


}

class Hash {
    public static void main(String[] args) {


        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Mukesh", 984);
        hashMap.put("sho", 789);
        hashMap.put("rit", 786);
        hashMap.put("san", 345);
        hashMap.put("shi", 546);
        hashMap.put("devi", 766454);


        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            System.out.println(map.getKey() + "-" + map.getValue());
        }
    }
}
