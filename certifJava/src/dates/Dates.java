package dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by EBR3556 on 22/08/2017.
 */
public class Dates {


    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate.now(): " + localDate);

        localDate = LocalDate.of(2016, 01, 15);
        System.out.println("LocalDate.of(2016, 01, 15): " + localDate);

        localDate = LocalDate.ofYearDay(2017, 1);
        System.out.println("LocalDate.ofYearDay(2017, 1): " + localDate);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        System.out.println("dd/mm/yyyy : " + localDate.format(formatter));

    }

}
