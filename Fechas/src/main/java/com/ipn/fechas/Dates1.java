package com.ipn.fechas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.util.logging.Logger;

public class Dates1 {

    private static Logger LOG = Logger.getLogger(Dates1.class.getName());

    public static void main(String[] args) {

        LocalDate fecha1 = LocalDate.of(1990, Month.SEPTEMBER, 10);
        LocalDate fecha2 = LocalDate.now();

        LOG.info("Fecha Cumpleaios  " + fecha1);
        LOG.info("Fecha Actual  " + fecha2);

        LOG.info("Is aftter: " + fecha1.isAfter(fecha2));
        LOG.info("Is aftter: " + fecha1.isBefore(fecha2));

        LocalTime tiempo1 = LocalTime.now();
        LocalTime tiempo2 = LocalTime.of(22, 30, 20);

        LOG.info("Tiempo asignado: " + tiempo2);
        LOG.info("Tiempo actual: " + tiempo1);

        LocalDateTime fechaTiempo1 = LocalDateTime.of(2012, Month.DECEMBER, 10, 10, 12, 5);
        LocalDateTime fechaTiempo2 = LocalDateTime.now();

        LOG.info("Fecha y tiempo: " + fechaTiempo1);
        LOG.info("Fecha y tiempo actuales: " + fechaTiempo2);

        Dates1.mostrarFechaNacimiento();
        Dates1.duracionTiempo();

    }

    public static void mostrarFechaNacimiento() {

        LocalDate nacimiento = LocalDate.of(1996, Month.DECEMBER, 10);
        LocalDate actual = LocalDate.now();

        Period periodo = Period.between(nacimiento, actual);
        LOG.info("Han Transcurrido " + periodo.getYears() + "años y " + periodo.getMonths() + "meses y " + periodo.getDays() + "dias, desde que naciste");
    }

    public static void duracionTiempo() {
        try {
            Instant ini = Instant.now();
            Thread.sleep(1000);
            Instant fin = Instant.now();
            
            LOG.info("Duracion: " + Duration.between(ini, fin));
            
        } catch(InterruptedException ex)  {
            

        }
    }

}
