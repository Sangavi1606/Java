import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int len = arr.length;
        dupicates(arr, len);
    }

    public static void dupicates(char[] arr, int len) {
        int index = 0;
        for (int i = 0; i < len; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (j == i) {
                arr[index++] = arr[i];
            }
        }
        System.out.println(Arrays.copyOf(arr, index));
    }
}
