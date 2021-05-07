public class April30Assing {
    public static void main(String[] args) {
        //vowelFind();
        //countOfWords();
        //palindromeCheck();
        numToWords();
    }

    public static void vowelFind() {
        String s1 = "education";
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
                count = count + 1;
            }
        }
        System.out.println(count);
    }

    public static void countOfWords() {
        String s1 = "Kabil is my brother. I love him so much.";
        int count = 1;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                count += 1;
            }
        }
        System.out.println(count);
    }

    public static void palindromeCheck() {
        String s1 = "madam bob";
        char temp1 = 0;
        char temp2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            temp1 = s1.charAt(i);
        }
        for (int i = s1.length() - 1; i >= 0; i--) {
            temp2 = s1.charAt(i);
        }
        if (temp1 == temp2) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }

    public static void numToWords() {
        String s1 = "345";

        for (int i = 0; i < s1.length(); i++) {

            switch (i) {
                case 0:
                    if (s1.charAt(i) == 0) {
                        System.out.println("Zero");
                    }
                    break;
                case 1:
                    if (s1.charAt(i) == 1) {
                        System.out.println("One");
                    }
                    break;
                case 2:
                    if (s1.charAt(i) == 2) {
                        System.out.println("Two");
                    }
                    break;
                case 3:
                    if (s1.charAt(i) == 3) {
                        System.out.println("Three");
                    }
                    break;
                case 4:
                    if (s1.charAt(i) == 4) {
                        System.out.println("Four");
                    }
                    break;
                case 5:
                    if (s1.charAt(i) == 5) {
                        System.out.println("Five");
                    }
                    break;
                case 6:
                    if (s1.charAt(i) == 6) {
                        System.out.println("Six");
                    }
                    break;
                case 7:
                    if (s1.charAt(i) == 7) {
                        System.out.println("Seven");
                    }
                    break;
                case 8:
                    if (s1.charAt(i) == 8) {
                        System.out.println("Eight");
                    }
                    break;
                case 9:
                    if (s1.charAt(i) == 9) {
                        System.out.println("Nine");
                    }
                    break;
            }
        }

    }
}
