package ex08_gestion_reservation_avec_localDate;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        try {

            Reservation r1 = new Reservation(
                    "Rim",
                    LocalDate.of(2026, 7, 10),
                    LocalDate.of(2026, 7, 15)
            );

            Reservation r2 = new Reservation(
                    "Sara",
                    LocalDate.of(2026, 10, 3),
                    LocalDate.of(2026, 10, 8)
            );

            System.out.println(
                    r1.getNomClient()
                            + " : "
                            + r1.dureeSejour()
                            + " nuits"
            );

            System.out.println(
                    "Haute saison : "
                            + Reservation.estEnHauteSaison(r1.getDateArrivee())
            );

            System.out.println();

            System.out.println(
                    r2.getNomClient()
                            + " : "
                            + r2.dureeSejour()
                            + " nuits"
            );

            System.out.println(
                    "Haute saison : "
                            + Reservation.estEnHauteSaison(r2.getDateArrivee())
            );

        } catch (IllegalArgumentException e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
