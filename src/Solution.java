import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int x = sc.nextInt();

        Solution s = new Solution();
        s.reverse(x);

    }

    public void reverse(int x) {
        int digit, reverse = 0;
        while (x != 0) {
            digit = x % 10;
            reverse = (reverse * 10) + digit;
            x = x / 10;

        }
        System.out.println(reverse);
    }
}
