package chaos.cwiczenia1;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private String surname;
    private LocalDateTime dateOfBirth;
    private String eyeColor;
    private char sex;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

}
