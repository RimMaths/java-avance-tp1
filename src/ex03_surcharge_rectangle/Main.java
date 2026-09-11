package ex03_surcharge_rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(3);
        Rectangle r3 = new Rectangle();

        System.out.println("Rectangle 1");
        System.out.println("Aire : " + r1.aire());
        System.out.println("Périmètre : " + r1.perimetre());

        System.out.println();

        System.out.println("Rectangle 2");
        System.out.println("Aire : " + r2.aire());
        System.out.println("Périmètre : " + r2.perimetre());

        System.out.println();

        System.out.println("Rectangle 3");
        System.out.println("Aire : " + r3.aire());
        System.out.println("Périmètre : " + r3.perimetre());
    }
}
