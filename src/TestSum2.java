public class TestSum2 {
    public static void main(String[] args) {

        String a = "masai";

        for (int i = 0; i < a.length(); i++) {
            for (int j = i; j < a.length(); j++) {
                subString(a, i, j);
            }
        }
    }

    public static void subString(String str, int i, int j) {
        String temp = "";
        boolean flag = false;
        for (int k = i; k <= j; k++) {
            if (temp.contains("" + str.charAt(k))) {
                flag = true;
                break;
            }
            temp += str.charAt(k);
        }
        if (!flag) System.out.println(temp);
    }
}


