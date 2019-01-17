package chaos.string;

public class ReplaceDemo {
    public static void main(String[] args) {
        String text ="kod kod Javie zwar w ta r w f  t";
        System.out.println(text.replaceAll("(\\b\\w+\\b)\\s\\1", "z"));

    }
}
