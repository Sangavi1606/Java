import java.util.Scanner;

public class Xpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter length");
//        int len=sc.nextInt();
//        int[] arr=new int[len];
//
//        for (int i=0; i<len; i++) {
//            System.out.println("Enter elements of array");
//            arr[i]=sc.nextInt();
//        }
//        for (int i=0; i<len; i++) {
//            System.out.println(arr[i]);
//        }
        System.out.println("Enter a word");
        String str = sc.nextLine();


        // patternX(arr,len);
        strPattern(str);

    }

    private static void patternX(int[] arr, int len) {
        for (int i = 0; i < len; i++) {
            int j = len - 1 - i;
            for (int k = 0; k < len; k++) {
                if (k == i || k == j) {
                    System.out.print(arr[k]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void strPattern(String str) {
        for (int i = 0; i < str.length(); i++) {
            int j = str.length() - 1 - i;
            for (int k = 0; k < str.length(); k++) {
                if (k == i || k == j) {
                    System.out.print(str.charAt(k));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }


}

