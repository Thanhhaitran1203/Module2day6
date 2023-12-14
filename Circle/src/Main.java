
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle (2,"blue");
        Cylinder cy = new Cylinder (3);
        System.out.println (c.toString ());
        System.out.println (cy.getVolume ());
    }
}