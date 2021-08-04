import java.util.Scanner;

public class RepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0)
            return 0;
        int count[] = new int[256];
        int left = 0, right = 0;
        int max = 1;
        while (right < s.length()) {
            char ch = s.charAt(right);
            if (count[ch] == 0) {
                max = Math.max(max, right - left + 1);
                count[ch]++;
                right++;
            } else {
                count[s.charAt(left++)]--;
            }
        }
        return max;
    }
}
