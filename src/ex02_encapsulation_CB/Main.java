package ex02_encapsulation_CB;

public class Main {
    public static void main(String[ ] args) {
        try {
        CompteBancaire c1 = new CompteBancaire(-500,"Rim");
            System.out.println("Titulaire : " + c1.getTitulaire());
            System.out.println("Solde : " + c1.getSolde());
        } catch (Exception e) {
            System.out.println("Something went wrong:"+e.getMessage());
        }
    }
}
