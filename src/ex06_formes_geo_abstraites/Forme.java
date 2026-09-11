package ex06_formes_geo_abstraites;

public abstract class Forme {

    //pas de constructeur
    public abstract double aire();
    public void afficherAire(){
        System.out.println("Aire : " + aire());
    }

}
