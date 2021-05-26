import java.util.Scanner;

public class May14_Assing {
    public static void main(String[] args) {
        //equilibrium();
        // minMaxArray();
        // secLargest();
        //divisible();
        minArrayUpdatedReq();

    }


    public static void equilibrium() {
//        Scanner sc= new Scanner (System.in);
//        System.out.println("Enter size:");
//        int size= sc.nextInt();
//        System.out.println("Enter array elements:");
//        int[] arr= new int[size];
//        for(int c=0; c<size; c++ ){
//            arr[c]= sc.nextInt();
//        }
        int[] arr = {3, 3, 5, 5, 1};
        int rightSum;
        int leftSum = 0;
        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {

            rightSum = 0;

            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (rightSum == leftSum) {
                flag = false;
                System.out.println(i + 1);
                break;
            }
            leftSum += arr[i];
        }
        if (flag) {
            System.out.println(-1);
        }
    }

    public static void minMaxArray() {
        int[] arr = {32, 3, 79, 5, 78, 4, 9};
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min" + "=" + min);
        System.out.println("max" + "=" + max);
    }

    public static void secLargest() {
        int[] arr = {5, 2, 1, 6, 8, 9};
        int max = arr[0], sec_max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sec_max = max;
                max = arr[i];
            } else if (arr[i] > sec_max && arr[i] != max) {
                sec_max = arr[i];
            }
        }

        System.out.println(sec_max);
    }

    public static void divisible() {
        Scanner sc = new Scanner(System.in);
        //char ch= sc.next().charAt(0);
        boolean c = true;
        while (c) {
            char i = sc.next().charAt(0);
            switch (i) {
                case 'Y':
                    int n = sc.nextInt();
                    if (n % 5 == 0 && n % 7 == 0) {
                        System.out.println("Divisible by both the Numbers");
                    } else if (n % 5 == 0) {
                        System.out.println("Divisible by 5 Not Divisible by 7");
                    } else if (n % 7 == 0) {
                        System.out.println("Divisible by 7 Not Divisible by 5");
                    } else {
                        System.out.println("Not Divisible by both");
                    }
                    break;
                case 'N':
                    c = false;
                    System.out.println("Exit");
                    break;
            }
        }

    }

    public static void minArrayUpdatedReq() {
        int n = 4;
        int[] arr = {1, 3, 8, 3, 5};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < n) {
                int temp = n - arr[i];
                arr[i] += temp;
                count += temp;
            }
        }
        System.out.println(count);
    }
}
