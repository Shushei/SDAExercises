package exerciseRegEx.exercise11;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CsvParser {
    public List<Person> parser(List<String> lineList){
        Pattern filePattern = Pattern.compile("(.*),(.*),(.*),(.*)");
        Matcher matcher;
        List<Person> personList= new ArrayList<>();
        for(String line:lineList){
            matcher = filePattern.matcher(line);
            if(matcher.matches()) {
                personList.add(new Person(matcher.group(1),matcher.group(2),matcher.group(3),Integer.parseInt(matcher.group(4))));
            }
        }
        return personList;
    }
}
