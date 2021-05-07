public class May01Assing {
    public static void main(String[] args) {
        sumOfArray();
        oddOrEvenNumber();
    }

    public static void sumOfArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void oddOrEvenNumber() {
        int[] arr = {2, 5, 4, 3, 8, 7, 9};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }
        System.out.println("even=" + even);
        System.out.println("odd=" + odd);
    }

}
