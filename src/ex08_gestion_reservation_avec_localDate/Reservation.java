package ex08_gestion_reservation_avec_localDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private String nomClient;
    private LocalDate dateArrivee;
    private LocalDate dateDepart;

    // Constructeur
    public Reservation(String nomClient, LocalDate dateArrivee, LocalDate dateDepart) {

        if (!dateDepart.isAfter(dateArrivee)) {
            throw new IllegalArgumentException(
                    "La date de départ doit être après la date d'arrivée"
            );
        }

        this.nomClient = nomClient;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
    }

    // Nombre de nuits
    public long dureeSejour() {
        return ChronoUnit.DAYS.between(dateArrivee, dateDepart);
    }

    // une methode statique Vérifie si la date est en juillet ou août
    public static boolean estEnHauteSaison(LocalDate date) {

        int mois = date.getMonthValue();
        //month.JULY || month.AUGUST
        return mois == 7 || mois == 8;
    }

    public String getNomClient() {
        return nomClient;
    }

    public LocalDate getDateArrivee() {
        return dateArrivee;
    }
}
