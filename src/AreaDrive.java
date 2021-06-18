public class AreaDrive {

    static int breadth = 10;
    int length = 20;

    public static void ar2() {
        AreaDrive ar = new AreaDrive();
        int PerimeterOfRectangle = 2 * (ar.length + breadth);
        System.out.println("Perimeter =" + PerimeterOfRectangle);
    }

    public void ar() {
        int AreaOfRectangle = length * breadth;
        System.out.println("Area =" + AreaOfRectangle);
    }
}
