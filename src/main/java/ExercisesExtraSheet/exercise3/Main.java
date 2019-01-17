package ExercisesExtraSheet.exercise3;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    ContactHandler handler = new ContactHandler();
    ArrayList<Contacts> contacts = new ArrayList<>();
    public static void main(String[] args) {
            Main obj = new Main();
            obj.mainMenu();

    }
    public void mainMenu(){
        // Napisz program który będzie przechowywał kontakty

        System.out.println("Zapisz");
        System.out.println("Wczytaj");
        System.out.println("Wyszukaj");
        System.out.println("Dodaj Wpis");
        String option;
        if((option = scanner.nextLine()).equals("Zapisz")){
            if(contacts.isEmpty()) {
                handler.saveToFile(handler.generateContacts());
            }
            handler.writeToJason(contacts);
            mainMenu();
        }else if(option.equals("Wczytaj")){
            contacts = handler.loadFromJson();
            System.out.println("Wczytano co chcesz zrobić dalej?");
            mainMenu();
        }else if(option.equals("Wyszukaj")){
            searchMenu();
            System.out.println("Koniec Szukania");
        } else if(option.equals("Dodaj Wpis")) {
            addContact();
            System.out.println("Dodałeś " + contacts.get(contacts.size()-1).name+" do listy");
        } else {
            System.out.println("Dowidzenia");
        }
    }
    public void searchMenu(){
        System.out.println("Wyszukaj po : imieniu, nazwisku, numerze telefonu emailu lub dowolne pole?");
        String option;
        if (contacts.isEmpty()) {
            contacts = handler.loadFromJson();
        }
        switch (option = scanner.nextLine()) {
            case "imieniu":{
                System.out.println("Podaj szukane imię");
                option = scanner.nextLine();
                for(int i =0;i<contacts.size();i++){
                    if(option.equals(contacts.get(i).name)){
                        System.out.println(contacts.get(i));
                    }
                }
                break;
            }
            case "nazwisku":{
                System.out.println("Podaj szukane nazwisko");
                option = scanner.nextLine();
                for(int i =0;i<contacts.size();i++){
                    if(option.equals(contacts.get(i).surname)){
                        System.out.println(contacts.get(i));
                    }
                }
                break;
            }
            case "numerze telefonu":{
                System.out.println("Podaj szukany numer telefonu");
                option = scanner.nextLine();
                for(int i =0;i<contacts.size();i++){
                    if(option.equals(contacts.get(i).telephoneNumber)){
                        System.out.println(contacts.get(i));
                    }
                }
                break;
            }
            case "emailu":{
                System.out.println("podaj szukane maila");
                option = scanner.nextLine();
                for(int i =0;i<contacts.size();i++){
                    if(option.equals(contacts.get(i).emailAdress)){
                        System.out.println(contacts.get(i));
                    }
                }
                break;
            }
            case "dowolne pole":{
                System.out.println("podaj szukane wyrazenie");
                option = scanner.nextLine();
                Pattern pattern = Pattern.compile(".*"+option+".*");
                Matcher matcher;
                for(int i = 0; i<contacts.size();i++){
                    if((pattern.matcher(contacts.get(i).name)).matches() || (pattern.matcher(contacts.get(i).surname)).matches() ||(pattern.matcher(contacts.get(i).telephoneNumber)).matches() ||(pattern.matcher(contacts.get(i).emailAdress)).matches()){
                        System.out.println("Imię: " + contacts.get(i).name+ " Nazwisko: " + contacts.get(i).surname +", tel.: " + contacts.get(i).telephoneNumber +", e-mail: "+ contacts.get(i).emailAdress);
                    }
                }
            }
        }
        mainMenu();
    }
    public void addContact(){
        if(contacts.isEmpty()) {
            contacts = handler.loadFromJson();
        }
        Pattern namePattern = Pattern.compile("^[A-Z][a-z]{1,}");
        Pattern numberPattern = Pattern.compile("[0-9]{9}");
        Pattern emailPattern = Pattern.compile("[A-Za-z0-9._%+\\-]+@[A-Za-z0-9.\\-]+\\.[A-Za-z]{2,4}");
        Matcher matcher;
        String name;
        String surname;
        String number;
        String email;
        do {
            System.out.println("Podaj imię");
            name = scanner.nextLine();
        }while (!(namePattern.matcher(name).matches()));
        do {
            System.out.println("Podaj Nazwisko");
            surname = scanner.nextLine();
        }while (!(namePattern.matcher(surname).matches()));
        do {
            System.out.println("Podaj number Telefonu");
            number = scanner.nextLine();
        }while (!(numberPattern.matcher(number).matches()));
        do {
            System.out.println("email");
            email = scanner.nextLine();
        }while (!(emailPattern.matcher(email).matches()));
        contacts.add(new Contacts(name,surname,number,email));
        mainMenu();
    }


}
