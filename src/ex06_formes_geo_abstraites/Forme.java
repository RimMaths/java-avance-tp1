package ex06_formes_geo_abstraites;

public abstract class Forme {

    //pas de constructeur
    public abstract double aire();
    public void afficherAire(){
        System.out.println("Aire : " + aire());
    }
    //5 ajout d'une methode statique Forme plusGrande(Forme[] formes)
    public static Forme plusGrande(Forme[] formes) {

        double aireMax = 0.0;
        Forme formeMax = null;

        for (Forme forme : formes) {

            double aire = forme.aire();

            if (aire > aireMax) {
                aireMax = aire;
                formeMax = forme;
            }
        }

        return formeMax;
    }

}
