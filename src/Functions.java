import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a side");
        int side = sc.nextInt();
        areaOfSquare(side);

        System.out.println("Enter a length and breadth");
        int len = sc.nextInt();
        int bre = sc.nextInt();
        areaOfRectangle(len, bre);

        System.out.println("Enter a base and height");
        int base = sc.nextInt();
        int height = sc.nextInt();
        areaOfTriangle(base, height);

        System.out.println("Enter a radius");
        int radius = sc.nextInt();
        areaOfCircle(radius);
    }

    public static void areaOfSquare(int side) {
        int area = side * side;
        System.out.println("area of square " + area);
    }

    public static void areaOfRectangle(int len, int bre) {
        int area = len * bre;
        System.out.println("area of Rectangle " + area);
    }

    public static void areaOfTriangle(int base, int height) {
        float area = 0.5f * base * height;
        System.out.println("area of triangle " + area);
    }

    public static void areaOfCircle(int radius) {
        float area = 3.14f * radius * radius;
        System.out.println("area of circle " + area);
    }
}
