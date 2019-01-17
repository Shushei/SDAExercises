package chaos.resztaRzeczy;

public class TablicaDziesieciu {
    public static void main(String[] args){
        int[] liczby = new int[10];
        for(int i = 0; i<10;i++){
            liczby[i]=i+1;
        }
        System.out.println("Długość tablicy "+ liczby.length);
        for(int i = 0; i<10;i++){
            System.out.print(liczby[i]+ " ");
            liczby[i] *=2;
        }
        System.out.println();
        for(int i = 0; i<10;i++) {
            System.out.print(liczby[i]+ " ");
        }
    }
}
