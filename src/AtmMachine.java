import java.util.HashMap;
import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> bankDetalis = new HashMap<>();

        bankDetalis.put("Kabil", "2190");
        bankDetalis.put("Sangu", "1670");
        bankDetalis.put("Raj", "2672");
        bankDetalis.put("Chandra", "7726");

        System.out.println("Enter Username");
        String userName = sc.nextLine();

        System.out.println("Enter Pin");
        String pinNumber = sc.nextLine();
        int pinNum = Integer.parseInt(pinNumber);

        if (bankDetalis.containsKey(userName)) {
            if (bankDetalis.get(userName).equals(pinNumber)) {
                atmUser();
            } else {
                System.out.println("PinNumber is wrong");
            }
        } else {
            System.out.println("UserName not found");
        }
    }

    public static void atmUser() {

        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        boolean b = true;
        while (b) {
            System.out.println("Enter any number from 1-3 to do process, atlast press 4 to exit your process");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter money to withdraw:");
                    int withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                        System.out.println("Now Balance amount= " + balance);
                    } else {
                        System.out.println("Insufficient Balance");
                        System.out.println("your Balance is" + balance);
                    }
                    break;

                case 2:
                    System.out.print("Enter money to be deposited:");
                    int deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("Now current Balance is " + balance);
                    break;

                case 3:
                    System.out.println("Balance amount  : " + balance);
                    break;

                case 4:
                    b = false;
                    System.out.println("Exited");
                    break;
            }
        }
    }

    public static int balance(int n) {
        int balance = 0;
        while (n > 0) {
            int sum = n % 10;
            balance = sum + balance;
            n = n / 10;
        }
        return balance * 100;

    }


}
