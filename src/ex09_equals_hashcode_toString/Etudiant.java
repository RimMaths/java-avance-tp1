package ex09_equals_hashcode_toString;
import java.util.Objects;
// en vrai java considère qu'étudiant extends de la classe Object
public class Etudiant {
    //les attributs
    private String numeroEtudiant;
    private String nom;
    private double moyenne;
    //constructeur
    public Etudiant(String numeroEtudiant, String nom, double moyenne) {
        this.numeroEtudiant = numeroEtudiant;
        this.nom = nom;
        this.moyenne = moyenne;
    }
    //2. Redéfinir toString() pour afficher une phrase lisible résumant l'étudiant.
    //c'est pour ça on va redéfinir les méthode toString() , hashCode() et equals

    @Override
    public String toString() {
        return numeroEtudiant + " " + nom + " " + moyenne;
    }
    //. Redéfinir equals(Object o) pour que deux étudiants soient considérés égaux si et seulement si leur
    //numeroEtudiant est identique (peu importe le nom ou la moyenne)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || !(obj instanceof Etudiant)) {
            return false;
        }

        Etudiant e1 = (Etudiant) obj;

        return Objects.equals(this.numeroEtudiant, e1.numeroEtudiant);
    }
    //4. Redéfinir hashCode() en cohérence avec equals() (utiliser Objects.hash(numeroEtudiant))
    @Override
    public int hashCode() {
        //utiliser Objects.hash(numeroEtudiant)
        //il faut prendre en considération quand numeroEtudiant est nulle aussi
        //Object.hash(numeroEtudiant) prend déjà si c'estnulle
        return Objects.hash(numeroEtudiant);
    }

}
