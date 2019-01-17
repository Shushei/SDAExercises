package chaos.resztaRzeczy;

import lombok.Getter;
import lombok.Setter;

public class Person {
    @Getter @Setter private String name;
    @Getter @Setter private String surname;
    @Getter @Setter private int age;
    @Getter @Setter private Address address;

    public Person(String name,String surname, int age, Address address){
        this.name = name;
        this.surname =surname;
        this.age = age;
        this.address = address;
    }
    public void introduce(){
        System.out.print("Witam mam na imię "+name+surname );
    }
}
