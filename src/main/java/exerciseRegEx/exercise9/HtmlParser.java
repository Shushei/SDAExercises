package exerciseRegEx.exercise9;

import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlParser {
    public void parseHtml(List<String> listLines){
        Pattern imagePattern = Pattern.compile("<img (src=\"(.*)\")>");
        Matcher matcher;
        for(String line : listLines){
            matcher = imagePattern.matcher(line);
            if(matcher.matches()) {
                System.out.println(matcher.group(2));
            }
        }
    }
}
