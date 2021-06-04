import java.util.Scanner;

public class ArrayIndexUsingTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int a=sc.nextInt();
        // int b=sc.nextInt();

        int[] arr = new int[5];

        try {
            for (int i = 0; i < arr.length + 1; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Run other codes");
    }
}
