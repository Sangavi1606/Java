public class HighestOfArray {
    public static void main(String[] args) {
//        toFind();
        lowestArray();
        highestArray();
    }

    public static void toFind() {
        int[] arr = {10, 3, 5, 16, 8};
        int toFind = 16;
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

    }

    public static void lowestArray() {
        int[] arr = {10, 5, 16, 8, 3};

        int low = arr[0];//3 //8
        for (int i = 0; i < arr.length - 1; i++) {

            int a = arr[i];
            int b = arr[i + 1];

            if (a < b) { //10<3, 3<5, 5<16, 16<8
                if (low > a) { //3>3, 3>5
                    low = a;
                }
            } else {
                if (low > b) {
                    low = b;
                }
            }
        }
        System.out.println(low);
    }

    public static void highestArray() {
        int[] arr = {10, 5, 16, 8, 3};

        int high = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {

            int a = arr[i];
            int b = arr[i + 1];

            if (a > b) {
                if (high < a) {
                    high = a;
                }
            } else {
                if (high < b) {
                    high = b;
                }
            }
        }
        System.out.println(high);
    }
}
