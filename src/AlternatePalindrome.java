import java.util.Scanner;

public class AlternatePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the testcases:");
//        int n= sc.nextInt();

        System.out.println("Enter a String:");
        String s = sc.nextLine();

        stringChange(s);

    }

    private static void stringChange(String s) {

        int countChar = 0;
        for (int i = 0; i < s.length(); i++) {
            countChar++;
        }

        for (int i = 0; i < s.length(); i++) {
            int countLetters = 1;
            char a = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                if (i != j) {
                    if (s.charAt(j) == a) {
                        countLetters++;
                        System.out.println(countLetters);
                    }
                }
            }
        }

    }

}
