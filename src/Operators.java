public class Operators {
    public static void main(String[] args) {
        int n = 4, row, col;
        for (row = 1; row <= 4; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
4, 4<=4,5

    1, 1<=4,2

        *
 */