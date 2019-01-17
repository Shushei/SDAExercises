package chaos.battleShips;

public abstract class AbstractPlayer {
    Map playerMap = new Map();
    Map hitMap = new Map(true);
    abstract boolean playTurn(Map enemyMap);
    boolean hasWon(Map map){
        for(int i = 1; i<11;i++){
            for (int j = 1; j<11;j++ ){
                if(map.map[i][j] == '1' || map.map[i][j] == '2' || map.map[i][j] == '3'|| map.map[i][j] == '4'|| map.map[i][j] == '5'){
                    return false;
                }
            }
        }
        return true;
    }
}
