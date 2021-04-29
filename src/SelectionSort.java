public class SelectionSort {
    public static void main(String[] args) {

        ascendSort();
        descendSort();
        stringSort();
        charAscendSort();
        charDescendSort();
    }

    public static void ascendSort() {
        int[] arr = {45, 68, 74, 54, 42, 64, 98, 24, 50, 13};
        int set;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    set = arr[i];
                    arr[i] = arr[j];
                    arr[j] = set;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();
    }

    public static void descendSort() {
        int[] arr = {45, 68, 74, 54, 42, 64, 98, 24, 50, 13};
        int set;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    set = arr[i];
                    arr[i] = arr[j];
                    arr[j] = set;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void stringSort() {
        String[] arr = {"hi anna", "hi bro", "hi sis", "hi buddy"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void charAscendSort() {
        char[] arr = {'f', 'a', 'd', 'b'};
        char set;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    set = arr[i];
                    arr[i] = arr[j];
                    arr[j] = set;
                }
            }
        }
        for (char c : arr) {
            System.out.println(c);
        }
        System.out.println();
    }

    public static void charDescendSort() {
        char[] arr = {'f', 'a', 'd', 'b'};
        char set;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    set = arr[i];
                    arr[i] = arr[j];
                    arr[j] = set;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
