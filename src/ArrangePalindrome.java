import java.util.Scanner;

public class ArrangePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int n = sc.nextInt();

        System.out.println("Enter String");
        String str = sc.next();

        String str1 = "";
        String str2 = "";

        boolean isTrue = false;

        for (int i = 0; i < str.length(); i++) {
            str1 = "";
            for (int j = i; j < str.length(); j++) {
                str1 += str.charAt(j);
                str2 = "";
                if (str1.length() > 1) {
                    for (int k = str1.length() - 1; k >= 0; k--) {
                        str2 += str1.charAt(k);
                    }
                }
                if (str1.equals(str2)) {
                    System.out.println("Palindrome");
                    isTrue = true;
                    break;
                }
            }
        }
        if (!isTrue) {
            System.out.println("Not a Palindrome");
        }
    }
}
