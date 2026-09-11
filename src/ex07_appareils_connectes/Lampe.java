package ex07_appareils_connectes;

public class Lampe implements Allumable {
    private boolean allumee;
    public Lampe() {
        this.allumee = false;
    }

    @Override
    public void allumer() {
        allumee = true;
        System.out.println("La lampe est allumée");
    }

    @Override
    public void eteindre() {
        allumee = false;
        System.out.println("La lampe est éteinte");
    }
}
