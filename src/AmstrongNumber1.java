
import java.util.Scanner;

public class AmstrongNumber1 {
    public static boolean isAmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp /= 10;
        }
        if (n == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            if (isAmstrong(i)) {
                System.out.println(i);
            }
        }
    }
}

class AmstrongNumber2 {
    public static boolean isAmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp /= 10;
        }
        if (n == sum) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isAmstrong(num)) {
            System.out.println("Amstrong number");
        } else {
            System.out.println("Not an amstrong");
        }
    }
}