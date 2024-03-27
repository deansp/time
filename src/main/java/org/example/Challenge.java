package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Challenge {

    public static void main(String[] args) {

        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd.MM.yy");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime now: " + localDateTime.format(form));
        LocalDateTime futurelocalDateTime = localDateTime.plusWeeks(2);
        System.out.println("Time in two weeks: " + futurelocalDateTime.format(form));

        LocalDateTime randomTime = LocalDateTime.of(2024,4,11,13,0,0);
        System.out.println("random Time        " + randomTime.format(form));

        if(randomTime.isBefore(futurelocalDateTime)){
            System.out.println("Zeitpunkt liegt vor der festgelegten Zeit");
        }else System.out.println("Zeitpunkt liegt nicht vor der festgelegten Zeit");

        long daysBetween = ChronoUnit.DAYS.between(localDateTime,randomTime);
        System.out.println("Differenz: " + daysBetween);


    }


}
