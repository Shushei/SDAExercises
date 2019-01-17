package chaos.string;

public class StringFun {
    public static void main(String[] args) {
//    olgierd();
    stringFun();
    }
    private static void olgierd(){
        String imie = "Olgierd";
        System.out.println(imie.toUpperCase());
        System.out.println(imie.toLowerCase());
        System.out.println("Długość imienia to : " + imie.length());
        System.out.println(imie.startsWith("O"));
        System.out.println(imie.contains("e"));
        String imiemodyfkowane = imie.replaceAll("i","");
        imiemodyfkowane = imiemodyfkowane.replaceAll("e","");
        System.out.print(imiemodyfkowane + "\n\r");
        for(int i=0;i<imie.length();i++){
            System.out.printf("[%s] = %s \n\r",i,(imie.toCharArray())[i]);
        }

    }
    private static void stringFun(){
        String napis ="count of NUMBERS";
        napis = napis.toLowerCase();
        String[] words = napis.split(" ");
        napis = words[0];
        for(int i = 1;i<words.length;i++){
            words[i]= (words[i].charAt(0)+"").toUpperCase() + words[i].substring(1);
            napis +=words[i];
        }
        System.out.println(napis);
    }
}
