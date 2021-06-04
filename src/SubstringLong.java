import java.util.Scanner;

public class SubstringLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of a Strings:");
        int n = sc.nextInt();
        sc.nextLine();
        int count;
        int finalcount;
        System.out.print("Strings:");
        for (int s = 0; s < n; s++) {
            String st = sc.nextLine();
            count = 1;
            finalcount = 0;
            for (int i = 0; i < st.length(); i++) {
                char temp = st.charAt(i);
                for (int j = i + 1; j < st.length(); j++) {
                    if (temp == st.charAt(j)) {
                        temp += st.charAt(j);
                        count++;
                    } else {
                        break;
                    }
                }
                if (finalcount < count) {
                    finalcount = count;
                }
            }
            System.out.println(finalcount);
        }
    }
}

