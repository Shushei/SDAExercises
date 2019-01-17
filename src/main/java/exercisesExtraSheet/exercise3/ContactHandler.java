package exercisesExtraSheet.exercise3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactHandler {
    public void saveToFile(ArrayList<Contacts> contacts){
        File file = new File("Contacts.txt");
        try {
            PrintWriter writer = new PrintWriter("Contacts.txt");
            for (int i = 0; i < contacts.size(); i++) {
                writer.println(contacts.get(i).toString());
            }
            writer.close();
        }catch (FileNotFoundException error){
            System.out.print("File not found");
        }
    }
    public ArrayList<Contacts> generateContacts(){
        ArrayList<Contacts> contacts = new ArrayList<>();
        contacts.add(new Contacts("Maciej", "Ratuszniak","738916283","fakemail@fake.com"));
        contacts.add(new Contacts("Lukasz","Sierakowski","500600700","fakemail2@fake.com"));
        return contacts;
    }
    public ArrayList<Contacts> loadFromFile(){
        File file = new File("Contacts.txt");
        ArrayList<Contacts> contacts = new ArrayList<>();
        ArrayList<String> data = new ArrayList<>();
        try {
            Scanner fromFile = new Scanner(file);
            Pattern pattern = Pattern.compile("\\'[a-zA-Z0-9\\.@]{1,30}\\'");
            while(fromFile.hasNextLine()) {
                Matcher matcher = pattern.matcher(fromFile.nextLine());
                while (matcher.find()) {
                    data.add(matcher.group().substring(1,(matcher.group().length()-1)));
                }
            }
            for(int i = 0;i<data.size()/4;i++){
                contacts.add(new Contacts(data.get(i),data.get(i+1),data.get(i+2),data.get(+3)));
            }
            System.out.println(contacts.get(0));
            System.out.println(contacts.get(1));
        }catch (FileNotFoundException error){
                System.out.println("ERROR");
        }
        return contacts;
    }
    public ArrayList<Contacts> loadFromJson() {
        ArrayList<Contacts> contacts = new ArrayList<Contacts>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            contacts = mapper.readValue(new File("Contacts.json"), mapper.getTypeFactory().constructCollectionType(ArrayList.class, Contacts.class));
        }catch (IOException error){
            error.printStackTrace();
        }
        for (int i = 0;i<contacts.size();i++){
            System.out.println(contacts.get(i));
        }
        return contacts;
    }
    public void writeToJason(ArrayList<Contacts> contacts){
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        try {
            mapper.writeValue(new File("Contacts.json"), contacts);
        }catch (IOException error){
            error.printStackTrace();
        }
    }
}
