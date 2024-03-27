package org.example;

import javax.swing.text.DateFormatter;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        //LocalDate -> Nur Datum
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate " + localDate);

        //LocalDateTime -> Datum Uhrzeit
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime " + localDateTime);

        //International:
        //ZoneDateTime -> Datum und Uhrzeit und Zeitzone 27.03.2024 14:05:15 UTC+1
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("ZonedDateTime " + zonedDateTime);

        //Instant = zulu Zeitpunkt 27.03.2024 13:05:05z (Zulo (UNIX)-Zeit) von 01.01.1970)
        Instant instant = Instant.now();
        System.out.println("instantTime: " + instant);


        //Umwandlung Instant in LocalDateTime
        ZoneId zoneId2 = ZoneId.systemDefault();
        ZoneId zoneId = ZoneId.of("+1");
        LocalDateTime convertedLocalDateTime = instant.atZone(zoneId).toLocalDateTime();
        System.out.println("convertes Instant to localDateTime: " + convertedLocalDateTime);

        //Umwandlung LocalDateTime in Instant
        Instant convertedInstant = localDateTime.atZone(zoneId).toInstant();
        System.out.println("converted LocalDate in Instant " + convertedInstant);


        //Format für die Zeit anpassen
        //d= Tag / M = Monat / y = Jahr
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd.MM.yy"); // MMM Kurzschreibweise Monat MMMM ausgeschrieben
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd.MMM.yy   HH:mm:ss"); // MMM Kurzschreibweise Monat MMMM ausgeschrieben
        String formattedDate = zonedDateTime.now().format(formatter);
        System.out.println(formattedDate);

        //Errechnen der Differenz zwischen zwei Zeitpunkten
        LocalDateTime start = LocalDateTime.of(1988,2,8,9,0,0);
        LocalDateTime finish = LocalDateTime.of(2024,3,27,13,0,0);

        long hoursBetween = ChronoUnit.HOURS.between(start,finish);
        System.out.println(hoursBetween);


    }
}