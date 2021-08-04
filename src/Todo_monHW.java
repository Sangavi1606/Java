import java.util.Scanner;

public class Todo_monHW {
    public static void main(String[] args) {
        //printing();
        printOddChar();
        //calendar();
    }

    public static void printing() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(i + "." + j);
            }
        }
    }

    public static void printOddChar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = sc.nextLine();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(s1.charAt(i));
            }
        }
    }

    public static void calendar() {
        int year = 2020;
        for (int mon = 1; mon <= 7; mon++) {
            if (mon % 2 != 0) {
                for (int date = 1; date <= 31; date++) {
                    System.out.println(year + "-" + mon + "-" + date);
                }
            } else if (mon == 2) {
                for (int date = 1; date <= 29; date++) {
                    System.out.println(year + "-" + mon + "-" + date);
                }
            } else {
                for (int date = 1; date <= 30; date++) {
                    System.out.println(year + "-" + mon + "-" + date);
                }
            }
        }
        for (int mon = 8; mon <= 12; mon++) {
            if (mon % 2 != 0) {
                for (int date = 1; date <= 30; date++) {
                    System.out.println(year + "-" + mon + "-" + date);
                }
            }

            if (mon % 2 == 0) {
                for (int date = 1; date <= 31; date++) {
                    System.out.println(year + "-" + mon + "-" + date);
                }
            }
        }


    }
}
