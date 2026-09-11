package ex07_appareils_connectes;

public class TelephonePortable implements Allumable, ConnectWifi {
    private boolean allume;
    private String reseauConnecte;

    public TelephonePortable() {
        this.allume = false;
        this.reseauConnecte = null;
    }

    @Override
    public void allumer() {
        allume = true;
        System.out.println("Téléphone allumé.");
    }

    @Override
    public void eteindre() {
        allume = false;
        System.out.println("Téléphone éteint.");
    }

    @Override
    public void connecter(String reseau) {
        reseauConnecte = reseau;
        System.out.println("Téléphone connecté au réseau : " + reseau);
    }

    @Override
    public void deconnecter() {
        reseauConnecte = null;
        System.out.println("Téléphone déconnecté du Wi-Fi.");
    }
}
