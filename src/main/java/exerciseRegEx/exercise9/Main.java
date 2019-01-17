package exerciseRegEx.exercise9;

public class Main {
    public static void main(String[] args) {
        HtmlParser htmlParser = new HtmlParser();
        htmlParser.parseHtml(Utility.loadFromFile());
    }
}
