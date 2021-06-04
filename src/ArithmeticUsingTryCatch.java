import java.util.Scanner;

public class ArithmeticUsingTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        try {
            c = b / 0;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Run other code");
    }
}
