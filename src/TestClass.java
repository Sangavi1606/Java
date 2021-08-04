import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int temp[] = new int[N];
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (i < N / 2) {
                while (A[i] >= 10) {
                    A[i] = A[i] / 10;
                    A[i] = temp[i];
                }
            } else {
                int l = A[i] % 10;
                l = temp[i];
            }
        }
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                sum1 = temp[i] + sum1;
            } else {
                sum2 = sum2 + temp[i];
            }
        }

        System.out.println(sum1);
        System.out.println(sum2);
        int diff = sum1 - sum2;
        System.out.println(diff);

        if (diff % 11 == 0) {
            System.out.println("OUI");
        } else {
            System.out.println("NON");
        }
    }
}


class TestClass2 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String zooName = sc.nextLine();
        int countZ = 0;
        int countO = 0;
        for (int i = 0; i < zooName.length(); i++) {
            if (zooName.charAt(i) == 'z') {
                countZ = countZ + 1;
            } else if (zooName.charAt(i) == 'o') {
                countO = countO + 1;
            }
        }

        if (2 * countZ == countO) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

class TestClass3 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            //System.out.println("Enter an input");
            int N = sc.nextInt();
            if (N == 42) {
                break;
            }
            System.out.println(N);
        }
    }
}




