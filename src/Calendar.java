import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = sc.nextInt();
        for (int month = 1; month <= 12; month++) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    for (int date = 1; date <= 31; date++) {
                        System.out.println(year + "-" + month + "-" + date);
                    }
                    break;
                case 2:
                    if (year % 4 == 0 || year % 400 == 0 || year % 100 == 0) {
                        for (int date = 1; date <= 29; date++) {
                            System.out.println(year + "-" + month + "-" + date);
                        }
                    } else {
                        for (int date = 1; date <= 28; date++) {
                            System.out.println(year + "-" + month + "-" + date);
                        }
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    for (int date = 1; date <= 30; date++) {
                        System.out.println(year + "-" + month + "-" + date);
                    }
                    break;
            }
        }
    }
}