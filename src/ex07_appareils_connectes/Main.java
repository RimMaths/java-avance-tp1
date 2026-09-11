package ex07_appareils_connectes;

public class Main {
    public static void main(String[] args) {

        Allumable[] appareils = {
                new TelephonePortable(),
                new Lampe()

        };

        for (Allumable appareil : appareils) {
            appareil.allumer();
            if (appareil instanceof ConnectWifi) {

                ConnectWifi appareilWifi =
                        (ConnectWifi) appareil;

                appareilWifi.connecter("WiFi_Cnam");
            }
        }
    }
}
