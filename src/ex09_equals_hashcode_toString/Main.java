package ex09_equals_hashcode_toString;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("E001", "Rim", 18.5);
        Etudiant e2 = new Etudiant("E002", "Sara", 17.0);

        // Même numéro étudiant que e1,
        // mais nom et moyenne différents
        Etudiant e3 = new Etudiant("E001", "Nora", 10.0);

        ArrayList<Etudiant> etudiants = new ArrayList<>();

        etudiants.add(e1);
        etudiants.add(e2);

        // Test de toString()
        System.out.println(e1);

        // Test de equals()
        System.out.println("e1.equals(e3) : " + e1.equals(e3));

        // Test de contains()
        System.out.println("La liste contient e3 : " + etudiants.contains(e3));

    }
}
