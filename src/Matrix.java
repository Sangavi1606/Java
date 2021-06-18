public class Matrix {
    public static void main(String[] args) {

        //transpose();
        //sumOfArray();
        //columnSum();
        //subMatrix();
        //diagonalMatrix();
        //humanReadDate();
        //checking();
        //google();
    }

    public static void transpose() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void sumOfArray() {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {2, 2, 4}};
        int[][] arr2 = {{2, 2, 4}, {7, 3, 2}, {1, 3, 5}};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void columnSum() {
        int[][] arr = {{1, 2, 3, 4}, {4, 5, 6, 7}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arr[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {      //00+10, 01+11, 02+12
                sum = sum + arr[j][i];
            }
            System.out.println(sum);
        }
    }

    public static void subMatrix() {
        int[][] arr = {{1, 2, 3}, {2, 1, 2}, {1, 5, 6}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void diagonalMatrix() {
        int[][] arr = {{1, 2, 3}, {2, 1, 2}, {1, 5, 6}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();        //(00 + 11 + 22)-(02 + 11 + 20)
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum1 = sum1 + arr[i][j];
                }
            }
        }
        System.out.println(sum1);

        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == arr.length - 1)
                    sum2 = sum2 + arr[i][j];
            }
        }
        System.out.println(sum2);
        System.out.println();

        int sum = sum1 - sum2;
        System.out.println(sum);
    }

    public static void humanReadDate() {
        String s1 = "2001-10-01";
        String[] arr = s1.split("-");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        switch (arr[1]) {
            case "01":
                System.out.println(arr[2] + " " + "January," + arr[0]);
                break;
            case "02":
                System.out.println(arr[2] + " " + "February," + arr[0]);
                break;
            case "03":
                System.out.println(arr[2] + " " + "March," + arr[0]);
                break;
            case "04":
                System.out.println(arr[2] + " " + "April," + arr[0]);
                break;
            case "05":
                System.out.println(arr[2] + " " + "May," + arr[0]);
                break;
            case "06":
                System.out.println(arr[2] + " " + "June," + arr[0]);
                break;
            case "07":
                System.out.println(arr[2] + " " + "July," + arr[0]);
                break;
            case "08":
                System.out.println(arr[2] + " " + "August," + arr[0]);
                break;
            case "09":
                System.out.println(arr[2] + " " + "September," + arr[0]);
                break;
            case "10":
                System.out.println(arr[2] + " " + "October," + arr[0]);
                break;
            case "11":
                System.out.println(arr[2] + " " + "November," + arr[0]);
                break;
            case "12":
                System.out.println(arr[2] + " " + "December," + arr[0]);
                break;
        }
    }

    public static void checking() {
        int[][] arr = {{1, 2}, {4, 5}, {7, 8}, {10, 11}, {13, 14}, {2, 3}, {4, 6}, {5, 7}, {6, 8}, {8, 9}};

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void google() {
        String str = "trending";
        boolean isTrue = false;

        for (int i = 0; i < str.length(); i++) {
            String str1 = "";
            for (int j = i; j < str.length(); j++) {
                str1 += str.charAt(j);
                System.out.println(str1);
                if (str1.equals("den")) {
                    System.out.println("True");
                    isTrue = true;
                    break;
                }
            }
        }
        if (!isTrue) {
            System.out.println("False");
        }
    }
}

