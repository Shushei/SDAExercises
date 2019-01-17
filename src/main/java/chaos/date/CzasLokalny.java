package chaos.date;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class CzasLokalny {
    public static void main(String[] args) {
//        czas();
//        System.out.println();
        data();
//        System.out.println();
//        dataICzas();
//        System.out.println();
//        porownanieDat();
//        System.out.println();
//        porownanieCzasu();
//        System.out.println();
//        czasWTokyo();
//        System.out.println();
//        czasWBydgoszczy();
    }

    private static void czas() {
        LocalTime time = LocalTime.now();
        System.out.println(time.toSecondOfDay()-LocalTime.of(9,0,0).toSecondOfDay());
        System.out.print((time.getNano() - LocalTime.of(0,0,0).getNano())/10E9);
    }

    private static void data() {
        LocalDate data = LocalDate.now();
        System.out.print(data);
        String x = "aa:aa:aaPM";
                System.out.print(x.charAt(8));

    }

    private static void dataICzas() {
        LocalDateTime czasiData = LocalDateTime.now();
        System.out.print(czasiData);
    }

    private static void porownanieDat() {
        LocalDate data1 = LocalDate.of(1989, 3, 16);
        LocalDate data2 = LocalDate.now();
        Period period = Period.between(data1, data2);
        System.out.print("Mineło " + period.getYears() + " lat " + period.getMonths() + " miesiecy " + period.getDays() + " dni");
    }

    private static void porownanieCzasu() {
        LocalTime czas1 = LocalTime.of(14, 11);
        LocalTime czas2 = LocalTime.of(18, 41);
        Duration duration = Duration.between(czas1, czas2);
        System.out.print("Upłyneło " + duration.toHours() + "godzin i " + (duration.toMinutes() - (duration.toHours() * 60)) + " minut");
    }

    private static void czasWTokyo() {
        LocalTime czasTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.print(czasTokyo);

    }

    private static void czasWBydgoszczy() {
        LocalDateTime czasWBydgoszczy = LocalDateTime.now();
        DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("dd LLLL YYYY 'roku', EEEE HH:mm:ss");
        System.out.print(czasWBydgoszczy.format(dateFormater));
    }
}
