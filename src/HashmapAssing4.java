public class HashmapAssing4 {
    public static void main(String[] args) {

        int[] arr = {1, 2, -3, 4, 5};
        int[] index = {0, 3, 8};
        boolean flag = true;

        for (int i = 0; i < index.length; i++) {
            if (index[i] < arr.length) {
                arr[index[i]] = 0;
            } else {
                System.out.println("Array index out of Bound");
                flag = false;
                break;
            }
        }
        if (flag) {
            for (int i : arr) {
                System.out.println(i);
            }
        }
    }
}
//O(n*m)