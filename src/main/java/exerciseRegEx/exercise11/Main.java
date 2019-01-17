package exerciseRegEx.exercise11;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CsvParser csvParser = new CsvParser();
        List<Person> personList = csvParser.parser(Utility.loadFromFile());
        for(Person person : personList){
            System.out.println(person.name +" " +person.surName +" "+person.email +" "+person.age);
        }
    }
}
