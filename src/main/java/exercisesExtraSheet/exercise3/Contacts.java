package exercisesExtraSheet.exercise3;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Contacts {
    String name;
    String surname;
    String telephoneNumber;
    String emailAdress;

    public Contacts(){

    }
    public Contacts(String name, String surname, String telephoneNumber, String emailAdress) {
        this.name = name;
        this.surname = surname;
        this.telephoneNumber = telephoneNumber;
        this.emailAdress = emailAdress;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", emailAdress='" + emailAdress + '\'' +
                '}';
    }
}
