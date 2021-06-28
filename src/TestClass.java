import java.util.Scanner;

class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        String rev = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            rev = rev + S.charAt(i);
        }

        if (S.equals(rev)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}


