package ex10_exception_personnalisee_retrait;

public class CompteBancaire {
    private double solde;
    private String titulaire;
    //constructeur
    public CompteBancaire(double  solde, String titulaire) {
        this.solde = solde;
        this.titulaire = titulaire;
    }
    //3. La méthode retirer(double montant) throws SoldeInsuffisantException doit lever l'exception (avec
    //throw) si montant > solde, en précisant le montant manquant dans le message.
    public void retirer(double montant)
        throws SoldeInsuffisantException{
        //Bonus exception unchecked
        if (montant <= 0) {
            throw new MontantInvalideException(
                    "Le montant doit être supérieur à 0."
            );
        }
        //Solude insufisant
        if(montant>solde) {
            double montantManquant = montant - solde;

            throw new SoldeInsuffisantException("Solde insuffisant, il manque" + montantManquant +"EU"
                    ,montantManquant);
        }
        //s'il n'ya pas d'exception
        solde = solde - montant;
    }
    //un getter car l'attribut solde est private
    public double getSolde() {
        return solde;
    }

}
