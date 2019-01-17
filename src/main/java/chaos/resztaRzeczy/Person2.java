package chaos.resztaRzeczy;

public class Person2 {
    String firstName;
    String lastName;
    int dayBirth;
    int monthBirth;
    int yearBirth;

    Person2(String firstName, String lastName, int dayBirth, int monthBirth, int yearBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayBirth = dayBirth;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
    }
    public String toString(){
        return firstName+ " " + lastName + " " + dayBirth + "." + monthBirth + "." +yearBirth;
    }
}
