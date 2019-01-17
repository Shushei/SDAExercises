package chaos.resztaRzeczy;

import lombok.Getter;
import lombok.Setter;

public class Address {
    @Getter @Setter private String street;
    @Getter @Setter private String city;
    @Getter @Setter private String country;
    @Getter @Setter private int flatNo;
    @Getter @Setter private int homeNo;
    public Address(String street,String city, String country, int flatNo, int homeNo){

    }
}
