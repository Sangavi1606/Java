public class PatternOne {
    public static void main(String[] args) {
        int n = 5;
        //pyramidPattern(n);
//       hollowTriangle(n);
        numberPattern(n);
//        alphabetPattern(n);
//        reverseTriangle();
//        alPattern();
    }

    public static void pyramidPattern(int n) {
        int row, col, spc;
        for (row = 0; row < n; row++) {
            for (spc = n - row; spc >= 1; spc--) {
                System.out.print(" ");
            }
            for (col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (row = n; row >= 0; row--) {
            for (spc = n - row; spc >= 1; spc--) {
                System.out.print(" ");
            }
            for (col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spc = 1; spc <= n - row; spc++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row * 2 - 1; col++) {
                if (col == 1 || col == row * 2 - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int row = n - 1; row >= 1; row--) {
            for (int spc = 1; spc <= n - row; spc++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row * 2 - 1; col++) {
                if (col == 1 || col == row * 2 - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void numberPattern(int n) {
        int val = 1;
        for (int row = 1; row < n; row++) {
            for (int spc = 1; spc < n - row; spc++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                if (val % 2 == 0)
                    System.out.print("* ");
                else
                    System.out.print(val + " ");
                val++;
            }
            //val++;
            System.out.println();
        }
    }

    public static void alphabetPattern(int n) {
        char alb = 'A';
        for (int row = 1; row <= n; row++) {
            alb = 'A';
            for (int col = 1; col <= row; col++) {
                System.out.print(alb++ + " ");
            }

            System.out.println(" ");
        }
    }

    public static void reverseTriangle() {
        int n = 7;
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void alPattern() {
        int n = 3;
        char alb = 'a';
        for (int row = 1; row <= n; row++) {
            alb = 'a';
            for (int spc = 1; spc <= n - row; spc++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {

                System.out.print(alb++ + " ");
            }
            System.out.println();
        }
        for (int row = n - 1; row >= 1; row--) {
            alb = 'a';
            for (int spc = 1; spc <= n - row; spc++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {

                System.out.print(alb + " ");
            }

            System.out.println();
        }
    }
}
