package chaos.battleShips;

import java.util.Scanner;

public class Player extends AbstractPlayer {

    Scanner scanner = new Scanner(System.in);

    public boolean playTurn(Map enemyMap) {
        boolean hasShotThere = false;
        boolean combo = true;
        String coordinates;
        int coordinateX;
        int coordinateY;
        while(combo) {
            combo = false;
            do {
                hasShotThere = true;
                System.out.println("Podaj koordynaty (A-J)(1-10) albo \"save\" żeby zapisać");
                if((coordinates = scanner.nextLine()).equals("save")){
                    return true;
                }
                coordinateX = coordinates.charAt(0) - 'A' + 1;
                coordinateY = coordinates.charAt(1) - '1' + 1;
                if (hitMap.map[coordinateX][coordinateY] == '?') {
                    hasShotThere = false;
                    if (enemyMap.map[coordinateX][coordinateY] != '?') {
                        hitMap.map[coordinateX][coordinateY] = 'x';
                        enemyMap.map[coordinateX][coordinateY] = 'x';
                        combo = true;
                        if(enemyMap.checkSunk(coordinateX,coordinateY)){
                            enemyMap.sinkShip(coordinateX,coordinateY);
                        }
                        hitMap.updateHitMap(enemyMap);
                        hitMap.printMap();
                        System.out.println("Super Trafiłeś, strzelaj dalej!");
                    } else {
                        hitMap.map[coordinateX][coordinateY] = 'p';
                        System.out.println("Pudło");
                    }
                }

            } while (hasShotThere);
        }
        return false;
    }
}
