package chaos.cwiczenia1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.toString());
        Person person2 = new Person("Maciej", "Ratuszniak");
        System.out.println((person2.toString()));
        person2.getName();
        Person person3 = new Person("Maciej", " Ratuszniak", LocalDateTime.of(LocalDate.of(1989,3,16),LocalTime.now()),"brown", 'm');
        System.out.println(person3.toString());
    }

}
