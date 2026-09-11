package ex10_exception_personnalisee_retrait;
//Créer une exception checked personnalisée SoldeInsuffisantException extends Exception, avec un
//constructeur prenant un message et un attribut montantManquant (double)
public class SoldeInsuffisantException extends Exception{
    private double montantManquant;
    public SoldeInsuffisantException(String message, double montant) {
        super(message);
        this.montantManquant = montant;
    }
    public double getMontantManquant() {
        return montantManquant;
    }
}
