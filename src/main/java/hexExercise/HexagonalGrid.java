package hexExercise;

public class HexagonalGrid {
    int[][] coordinates;
    public HexagonalGrid(int size){
        if(size == 0){
            System.out.println("Rozmiar minimum 2");
            return;
        }
        coordinates = new int[size*2+1][];
        for(int i =0;i<(size*2+1);i++){
                coordinates[i]= new int[(size*2+1)-(Math.max(0,Math.abs(((size)-i))))];
        }
    }
    public void printHexMap(int size){
        for(int i = 0; i<coordinates.length;i++){
            if(i<size){
                for(int j = 0;j<(size+1-i);j++){
                    System.out.print("  ");
                }
            }else if( i> size){
                for(int j =(size); j<=i;j++){
                    System.out.print("  ");
                }
            }
            for(int j = 0; j<coordinates[i].length;j++){
                if(i<size) {
                    System.out.print(i + " " + (j+size-i) + "  ");
                }else {
                    System.out.print(i + " " + j + "  ");
                }
            }
            System.out.println();
        }
    }
}
