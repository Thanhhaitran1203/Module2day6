
public class Main {
    public static void main(String[] args) {
        Point2D p2 = new Point2D ();
        Point3D p3 = new Point3D ();
        System.out.println (p2.toString ());
        System.out.println (p3.toString ());
        float[] a = p3.getXYZ ();
        System.out.println (a[1]);
    }
}