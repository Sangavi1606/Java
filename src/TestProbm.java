public class TestProbm {
    public static void main(String[] args) {
        mirrorImage();
        absoluteDiff();
    }

    public static void mirrorImage() {
        String s = "deaf";
        int index;
        char val;
        for (int i = 0; i < s.length(); i++) {
            index = 'z' - s.charAt(i);
            //System.out.println(index);
            val = (char) ('a' + index);
            System.out.println(val);
        }
    }

    public static void absoluteDiff() {
        int n = 1;
        int m = 10;
        int diff = (n - m);
        if (diff < 0) {
            diff = (n - m) * (-1);
        }
        System.out.println(diff);
    }
}
