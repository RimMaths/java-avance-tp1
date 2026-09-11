package ex06_formes_geo_abstraites;

public class Main {
    public static void main(String[] args) {

        Forme[] formes = {
                new Cercle(3),
                new Rectangle(4, 5),
                new Triangle(6, 4)
        };

        for (Forme forme : formes) {
            forme.afficherAire();
        }
    }
}
