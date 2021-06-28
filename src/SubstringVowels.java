import java.util.Scanner;

public class SubstringVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//         String str1 = sc.nextLine();
//         String str2 = sc.nextLine();

        String str1 = "coronavirus";

//         for(int i=0; i<str1.length(); i++){
//             for(int j=i; j<=str1.length(); j++){
//                 System.out.println(str1.substring(i,j));
//             }
//         }
//
//         String str2= "dangerouscovid";
//
//        for(int i=0; i<str2.length(); i++){
//            for(int j=i+1; j<=str2.length(); j++){
//                System.out.println(str2.substring(i,j));
//            }
//        }
        char temp = ' ';
        int sum = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u'
                    || str1.charAt(i) == 'A' || str1.charAt(i) == 'E' || str1.charAt(i) == 'I' || str1.charAt(i) == 'O' || str1.charAt(i) == 'U') {
                temp = str1.charAt(i);
                System.out.println(temp);
                sum += str1.charAt(i);
                System.out.println(sum);
            }
        }

        for (int i = 0; i < str1.length(); i++) {
            for (int j = i; j <= str1.length(); j++) {
                System.out.println(str1.substring(i, j));
            }
        }
    }
}
