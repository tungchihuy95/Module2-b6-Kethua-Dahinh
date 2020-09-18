package bt_point2D_point3D;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(3,5);
        System.out.println(point2D);

        System.out.println("************");

        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(4, 5, 7);
        System.out.println(point3D);

    }
}
