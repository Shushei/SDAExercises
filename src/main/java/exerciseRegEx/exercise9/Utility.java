package exerciseRegEx.exercise9;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utility {
    public static void saveFile(){

        try {
            PrintWriter writer = new PrintWriter("G:\\Java\\SDK\\SDAProjects\\Projects\\src\\main\\resources\\file.html");
            writer.println("The first line");
            writer.println("The second line");
            writer.close();
        }catch(IOException error){

        }
    }
    public static List<String> loadFromFile(){
        List<String> lines = new ArrayList<>();
        Path path = Paths.get("G:\\Java\\SDK\\SDAProjects\\Projects\\src\\main\\resources\\file.html");
        try {
            lines = Files.readAllLines(path);
        }catch (IOException error){
            error.printStackTrace();
        }
        return lines;
    }
}
