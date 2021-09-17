import java.util.Scanner;

class ZohoSolution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String str = sc.nextLine();
        int length = str.length();


        int add = 0;

        if (length % 2 != 0) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == 'A') {
                    if (str.charAt(i + 1) == '1' || str.charAt(i - 1) == '1') {
                        add = 1;
                    } else {
                        add = 0;
                    }
                } else if (str.charAt(i) == 'B') {
                    if (str.charAt(i + 1) == '1' && add == 1) {
                        add = 1;
                    } else {
                        add = 0;
                    }
                } else if (str.charAt(i) == 'C') {
                    if (add == str.charAt(i + 1)) {
                        add = 0;
                    } else {
                        add = 1;
                    }
                }
            }
            System.out.println(add);
        } else {
            System.out.println("It's invalid");
        }
    }
}

class ZohoSolution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        System.out.println(subString(s1));

    }

    public static String subString(String s1) {
        String temp = "";
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i; j <= s1.length(); j++) {
                temp = s1.substring(i, j);
            }
        }
        String temp1 = "";
        for (int j = temp.length() - 1; j >= 0; j--) {
            temp1 = temp1 + temp.charAt(j);
        }
        if (temp.equals(temp1)) {
            return temp;
        }
        return null;
    }

}
