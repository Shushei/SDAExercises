package chaos.resztaRzeczy;

public class Petla {
    public static void main(String[] args) {
        petlaFor();
        petlaWhile();
        petlaDoWhile();
    }
    private static void petlaFor(){
        for(int i =1; i<=49;i++){
            System.out.print(i +" ");
        }
        System.out.println();
    }
    private static void petlaWhile(){
        int i = 1;
        while(i<=49){
            System.out.print(i +" ");
            i++;
        }
        System.out.println();
    }
    private static void petlaDoWhile(){
        int i = 1;
        do{
            System.out.print(i +" ");
            i++;
        }while(i<=49);
        System.out.println();
    }
}
