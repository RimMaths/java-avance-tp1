package ex10_exception_personnalisee_retrait;

public class Main {
    public static void main(String[] args) {

        CompteBancaire c1 = new CompteBancaire(500, "Rim");

        try {

            // Test du bonus
            c1.retirer(-100);

        } catch (SoldeInsuffisantException e) {

            System.out.println("Erreur : " + e.getMessage());

            System.out.println(
                    "Montant manquant : "
                            + e.getMontantManquant()
                            + " EU"
            );

        } catch (MontantInvalideException e) {

            System.out.println("Erreur : " + e.getMessage());

        } finally {

            System.out.println(
                    "Solde final : "
                            + c1.getSolde()
                            + " EU"
            );
        }
    }
}