public class StringReverse {
    public static void main(String[] args) {
        wordReverse();
        sentenceReverse();
        palindrome();
        numberPalindrome();
    }

    public static void wordReverse() {
        String str = "name";
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        System.out.println(str2);
    }

    public static void sentenceReverse() {
        String[] s = "This is my book".split(" ");
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--) {
            ans += s[i] + " ";
        }
        String ans1 = ans.trim();
        System.out.println(ans1);
    }

    public static void palindrome() {
        String s = "bob";
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ans += s.charAt(i);
        }
        if (s.equals(ans)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static void numberPalindrome() {
        int num = 121;
        int rev = 0;
        int rem;

        int oNum = num;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if (oNum == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
