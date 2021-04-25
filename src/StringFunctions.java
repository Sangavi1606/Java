public class StringFunctions {
    public static void main(String[] args) {


//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter a String");
//        String k1= sc.nextLine();
//        System.out.println("Enter a String");
//        String k2= sc.nextLine();
//        System.out.println(conCat(k1,k2));


        String k1 = "     Hi everyone     ";
        String k2 = "Hijio";
//
//        System.out.println(equalsTo(k1,k2));
//        compareTo(k1, k2);
//        replace(k1);
//        System.out.println(isEmpty(k1));
//        subString(k1,1,6);
        trim(k1);
    }

    public static String conCat(String s1, String s2) {
        return s1 + s2;
    }

    public static boolean equalsTo(String s1, String s2) {
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }

            }
            return true;
        }
        return false;
    }

    public static void compareTo(String s1, String s2) {
        if (s1.length() < s2.length()) {
            for (int i = 0; i < s1.length(); i++) {

                if (s1.charAt(i) != s2.charAt(i)) {
                    System.out.println(s1.charAt(i) - s2.charAt(i));
                    break;
                }
            }

        } else {
            for (int i = 0; i < s2.length(); i++) {

                if (s1.charAt(i) != s2.charAt(i)) {
                    System.out.println(s1.charAt(i) - s2.charAt(i));
                    break;
                }
            }

        }
    }


    public static void replace(String s1) {
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'H') {
                s2 += 'o';
            } else {
                s2 += s1.charAt(i);
            }

        }
        System.out.println(s2);

    }

    public static boolean isEmpty(String s1) {
        if (s1 == "") {
            return true;
        } else {
            return false;
        }
    }

    public static void subString(String s1, int startIdx, int endIdx) {
        String a = "";
        for (int i = startIdx; i < endIdx; i++) {
            a += s1.charAt(i);
        }
        System.out.println(a);
    }

    public static void trim(String s1) { //     Hi everyone
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != ' ') {
                startIndex = i;
                break;
            }
        }
        for (int i = s1.length() - 1; i > 0; i--) {
            if (s1.charAt(i) != ' ') {
                endIndex = i;
                break;
            }
        }
        System.out.println(s1.substring(startIndex, endIndex + 1));
    }
}


