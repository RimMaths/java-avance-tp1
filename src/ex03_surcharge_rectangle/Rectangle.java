package ex03_surcharge_rectangle;

public class Rectangle {
    private double largeur;
    private double hauteur;

    // Constructeur principal
    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    // Constructeur pour créer un carré
    public Rectangle(double cote) {
        this(cote, cote);
    }

    // Constructeur par défaut
    public Rectangle() {
        //un sans paramètre avec largeur / hauteur = 1
        this(1, 1);
    }

    public double aire() {
        return largeur * hauteur;
    }

    public double perimetre() {
        return 2 * (largeur + hauteur);
    }
}
