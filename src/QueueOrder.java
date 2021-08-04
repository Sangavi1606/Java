import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            while (!queue.isEmpty()) {
                System.out.println(queue.remove(arr[i]));
            }

            if (queue.isEmpty()) {
                System.out.println(0);
                queue.add(arr[i]);
            }
        }
    }
}
