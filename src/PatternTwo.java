public class PatternTwo {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int spc = 1; spc <= n - row; spc++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = n - 1; row >= 1; row--) {
            for (int spc = 1; spc <= n - row; spc++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
    1 2 3 4
  1 *
  2 * *
  3 * * *
  4 * * * *



        *
       * *
      * * *
     * * * *
 */