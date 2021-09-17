import java.util.Scanner;

public class BreakPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palindrome = sc.nextLine();

        System.out.println(breakPalindrome(palindrome));
    }

    public static String breakPalindrome(String palindrome) {
        if (palindrome.length() == 1) return "";
        for (int i = 0; i < palindrome.length() / 2; ++i) {
            if (palindrome.charAt(i) != 'a') {
                return palindrome.substring(0, i) + 'a' +
                        palindrome.substring(i + 1);
            }
            if (palindrome.charAt(i) == 'a') {
                return "IMPOSSIBLE";
            }
        }
        return palindrome.substring(0, palindrome.length() - 1) + 'b';
    }
}
