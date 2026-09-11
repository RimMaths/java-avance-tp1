package ex05_surchage_methode_afficher;

public class Produit {

    // Attributs
    String nom;
    double prix;

    // Constructeur
    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    // afficher() : affiche nom et prix
    public void afficher() {
        System.out.println("Produit : " + nom);
        System.out.println("Prix : " + prix);
    }

    // afficher(double remise) : affiche le prix après remise
    public void afficher(double remise) {
        //this
        double prixRemise = this.prix - (this.prix * remise / 100);

        System.out.println("Prix après remise de "
                + remise + "% : "
                + prixRemise);
    }

    // afficher(String devise) : affiche le prix avec la devise
    public void afficher(String devise) {
        System.out.println("Prix : " + prix + " " + devise);
    }
}
