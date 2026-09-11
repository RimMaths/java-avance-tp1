package ex01_livre;

public class Main {

    public static void main(String[] args) {

        // création des livres
        Livre livre1 = new Livre(
                "1984",
                "George Orwell",
                328
        );

        Livre livre2 = new Livre(
                "Le Petit Prince",
                "Antoine de Saint-Exupéry",
                96
        );

        // tests emprunter / rendre
        //tests sur livre 1 et 2
        livre1.emprunter();
        livre2.emprunter();
        //Rendre le livre
        livre1.rendre();
        // Le livre peut maintenant être emprunté à nouveau
        livre1.emprunter();

        System.out.println();

        // Test sur livre2
        livre2.emprunter();
        livre2.rendre();
    }
}