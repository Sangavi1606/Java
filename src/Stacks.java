import java.util.Scanner;
import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            while (!stack.isEmpty()) {

                if (stack.peek() < arr[i]) {
                    System.out.println(stack.peek());
                    stack.push(arr[i]);
                    break;
                }

                stack.pop();
            }
            if (stack.isEmpty()) {
                System.out.println(0);
                stack.push(arr[i]);
            }

        }

    }
}

class Stacks2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) { //2 8 4 5 3 1

            while (!stack.isEmpty()) {

                if (stack.peek() > arr[i]) {
                    System.out.println(stack.peek());
                    stack.push(arr[i]);
                    break;
                }

                stack.pop();

            }
            if (stack.isEmpty()) {
                System.out.println(0);
                stack.push(arr[i]);
            }
        }
    }
}

