package ex05_surchage_methode_afficher;

public class Main {
    public static void main(String[] args) {

        Produit p1 = new Produit("Ordinateur", 1200);

        p1.afficher();
        p1.afficher(20);
        p1.afficher("EUR");
    }
}
