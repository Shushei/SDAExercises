package chaos.string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(char i = '0'; i<='9';i++){
            builder.append(i + " ");
        }
        for(char c = 'A';c <='F' ;c++){
            builder.append(c+ " ");
        }
        System.out.println(builder);
    }
}
