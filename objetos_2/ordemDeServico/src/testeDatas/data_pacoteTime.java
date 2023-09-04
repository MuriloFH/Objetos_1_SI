package testeDatas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class data_pacoteTime {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        
        System.out.println("agora -> " + agora);
        
        LocalDate nascimento = LocalDate.of(1999, Month.MAY, 23);
        
        System.out.println("Nascimento -> " + nascimento);
        
        DateTimeFormatter formata = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println(nascimento.format(formata) + "\n");
        
        LocalDate outraDAta = LocalDate.parse("12/03/1292", formata);
        
        System.out.println(outraDAta);
        
        Period periodo = Period.between(nascimento, agora);
        
        System.out.println(periodo.getYears() + " | " + periodo.getMonths() + " | " + periodo.getDays());
        
        //until
        
        long numeroDias = nascimento.until(agora, ChronoUnit.HOURS);
        
        System.out.println(numeroDias);
    }
}
