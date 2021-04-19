import java.util.Scanner;

public class Function_example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = sc.nextInt();
        evenOrOdd(n);

        System.out.println("Enter how many numbers to print");
        int a = sc.nextInt();
        numbers(a);

        System.out.println("Printing a Sentence");
        String d = sc.next();
        printString(d);
    }

    public static void evenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void numbers(int a) {
        for (int i = 0; i <= a; i++) {
            System.out.println(" " + i);
        }
    }

    public static void printString(String d) {
        System.out.println("I am " + d + " because of her");
    }
}
