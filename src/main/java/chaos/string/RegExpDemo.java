package chaos.string;

public class RegExpDemo {
    public static void main(String[] args) {
        String str = "255.255.255.256";

//        System.out.println(str.matches("a*"));
//        System.out.println(str.matches("\\d{2}-\\d{3}"));
//        System.out.println(str.matches("[0-4]\\d"));
//        System.out.println(str.matches(".*\\.[0-2]|.*[\\..*\\..*"));
        System.out.println(str.matches("\\b(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\b\\.\\b(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\b\\.\\b(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\b\\.\\b(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\b"));
        System.out.println(str.matches("(\\b(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\b)\\.\\1\\.\\1\\.\\1"));

    }
}