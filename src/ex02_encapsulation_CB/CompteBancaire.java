package ex02_encapsulation_CB;

public class CompteBancaire {
    private double solde;
    private String titulaire;
    //constructeur
    public CompteBancaire(double solde, String titulaire) {
        this.titulaire = titulaire;
        //this.solde = solde;
        //aucun setter directe pour solde on passe par un constructeur
        // on initialise l'objet au moment de son initialisation
        if (solde < 0) {
            throw new IllegalArgumentException(
                    "Le solde initial ne peut pas être négatif"
            );
        }
        this.solde = solde;
    }
    //les getter
    public double getSolde() {
        return solde;
    }
    public String getTitulaire() {
        return titulaire;
    }
    //3. Ajouter une méthode deposer(double montant) qui refuse (via une exception
    //IllegalArgumentException) tout montant négatif ou nul
    public void deposer(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException(
                    "Le montant doit être supérieur à 0"
            );
        }

        solde = solde + montant;
    }
    //4. Ajouter une méthode retirer(double montant) qui refuse un retrait si le solde est insuffisant (lever
    //IllegalArgumentException avec un message clair)
    public void retirer(double montant) {
        if(montant <= 0) {
            throw new IllegalArgumentException(
                    "le montant doit etre supérieur à 0");
        }
        if(montant > solde) {
            throw new IllegalArgumentException(
                    "Solde insuffisant"
            );
        }
        solde = solde-montant;
    }
}
