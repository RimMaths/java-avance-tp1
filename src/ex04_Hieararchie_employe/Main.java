package ex04_Hieararchie_employe;

public class Main {
    public static void main(String[] args) {

        Employe e1 = new Employe("Rim", 2000);
        Manager m1 = new Manager("Sara", 2500, 500);
        //le tableau est e type Employe [] even thought il contient manager
        Employe[] employes = {e1, m1};

        for (Employe employe : employes) {

            System.out.println(
                    employe.getNom()
                            + " : "
                            + employe.calculerSalaire()
                            + " €"
            );
        }
    }
}
