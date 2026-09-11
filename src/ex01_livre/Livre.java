package ex01_livre;

public class Livre {

    private String titre;
    private String auteur;
    private int nombrePages;
    private boolean disponible;

    // constructeur
    public Livre(String titre, String auteur, int nombrePages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombrePages = nombrePages;
        this.disponible = true;
    }
    // emprunter()
    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println("Le livre \"" + titre + "\" a été emprunté.");
        } else {
            System.out.println("Le livre \"" + titre + "\" n'est pas disponible.");
        }
    }
    // rendre()
    public void rendre(){
        disponible = true;
        System.out.println("Le livre \"" + titre + "\" a été rendu.");
    }
}