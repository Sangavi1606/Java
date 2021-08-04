public class MaxWaterStore {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter size of array");
//        int n=sc.nextInt();
//        System.out.println("Enter array");
//        int[] arr=new int[n];
//        for(int i:arr) {
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {2, 1, 3, 4, 6, 5};
        int n = arr.length;


        System.out.println(maxStored(arr, n));

    }

    public static int maxStored(int[] arr, int n) {

        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int current = (Math.min(arr[i], arr[j])) * (j - i - 1);
                max = Math.max(max, current);
            }
        }
        return max;
    }
}
