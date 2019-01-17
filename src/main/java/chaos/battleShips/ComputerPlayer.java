package chaos.battleShips;

import java.util.Random;

public class ComputerPlayer extends AbstractPlayer {
    Random random = new Random();

    public boolean playTurn(Map enemyMap) {
        boolean hasShotThere;
        boolean combo = true;
        while(combo) {
            combo = false;
            do {
                hasShotThere = true;
                int coordinateX = random.nextInt(10) + 1;
                int coordinateY = random.nextInt(10) + 1;
                if (hitMap.map[coordinateX][coordinateY] == '?') {
                    hasShotThere = false;
                    if (enemyMap.map[coordinateX][coordinateY] != '?') {
                        hitMap.map[coordinateX][coordinateY] = 'x';
                        enemyMap.map[coordinateX][coordinateY] = 'x';
                        combo = true;
                    } else {
                        hitMap.map[coordinateX][coordinateY] = 'p';
                    }
                }

            } while (hasShotThere);
        }
        return false;
    }

}
