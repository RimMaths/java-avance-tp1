package ex04_Hieararchie_employe;

public class Manager extends Employe {
    private double prime;

    public Manager(String nom, double salaireBase, double prime) {
        //on appelle le constructeur de la classe Main
        super(nom, salaireBase);

        this.prime = prime;
    }
    //on définit la methode héritée
    @Override
    public double calculerSalaire() {
        return salaireBase + prime;
    }
}
