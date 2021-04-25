import java.util.Scanner;

public class AsciiValueHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a integer");
        int a = sc.nextInt();
        asciiValue1(a);

        System.out.println("Enter a character");
        char b = sc.next().charAt(0);
        asciiValue2(b);
    }

    public static void asciiValue1(int ascii) {
        char value = (char) ascii;
        System.out.println(value);
    }

    public static void asciiValue2(char ascii) {
        int value = ascii;
//        System.out.println(ascii);
        System.out.println(value);
    }
}
