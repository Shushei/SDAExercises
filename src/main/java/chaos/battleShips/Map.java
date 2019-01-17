package chaos.battleShips;

import java.util.Random;

public class Map {
    Random random = new Random();
    char[][] map = new char[11][11];

    public Map() {
        fillMap();
        shipSet(5, 1);
        shipSet(4, 1);
        shipSet(3, 2);
        shipSet(2, 3);
        shipSet(1, 4);
    }

    public Map(boolean isEmpty) {
        fillMap();
    }


    public void shipSet(int size, int numberOfShips) {
        int coordinateX;
        int coordinateY;
        for (int i = 0; i < numberOfShips; i++) {
            boolean shipSet = false;
            do {
                coordinateX = random.nextInt(11 - size) + 1;
                coordinateY = random.nextInt(11 - size) + 1;
//          if true then ship will be placed horizontal
//          else it will be places vertical
                if (random.nextBoolean()) {
                    if (checkHorizontal(coordinateX, coordinateY, size)) {
                        for (int j = coordinateY; j < coordinateY + size; j++) {
                            map[coordinateX][j] = (char) (size + '0');
                        }
                        shipSet = true;
                    }
                } else {
                    if (checkVertical(coordinateX, coordinateY, size)) {
                        for (int j = coordinateX; j < coordinateX + size; j++) {
                            map[j][coordinateY] = (char) (size + '0');
                        }
                        shipSet = true;
                    }

                }
            } while (!shipSet);
        }
    }

    public void fillMap() {
        char horizontal = '1';
        char vertical = 'A';
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0 && j != 0) {
                    map[i][j] = horizontal;
                    horizontal++;
                } else if (i != 0 && j == 0) {
                    map[i][j] = vertical;
                    vertical++;
                } else {
                    map[i][j] = '?';
                }
            }
        }
    }

    public void printMap() {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (map[i][j] == 'x') {
                    System.out.print("\033[31m" + map[i][j] + "\033[0m" + "  ");
                } else if (map[i][j] == 'p') {
                    System.out.print("\033[33m" + map[i][j] + "\033[0m" + "  ");
                } else if (i ==0 && j == 0){
                    System.out.print("   ");
                }else if (i == 0) {
                    System.out.print("\033[1m" + map[i][j] + "\033[0m" + "  ");
                } else if (j==0) {
                    System.out.print("\033[1m" + map[i][j] + "\033[0m" + "  ");
                } else {System.out.print(map[i][j]+"  "); }
            }
            System.out.println();
        }
    }

    private boolean checkHorizontal(int coordinateX, int coordinateY, int size) {

        for (int k = (coordinateX == 1 ? coordinateX : coordinateX - 1); k <= (coordinateX == 10 ? coordinateX : coordinateX + 1); k++) {
            for (int j = coordinateY == 1 ? coordinateY : coordinateY - 1; j < (coordinateY == 11 - size ? coordinateY + size : coordinateY + size + 1); j++) {
                if (map[k][j] != '?') {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkVertical(int coordinateX, int coordinateY, int size) {
        for (int k = (coordinateY == 1 ? coordinateY : coordinateY - 1); k <= (coordinateY == 10 ? coordinateY : coordinateY + 1); k++) {
            for (int j = coordinateX == 1 ? coordinateX : coordinateX - 1; j < (coordinateX == 11 - size ? coordinateX + size : coordinateX + size + 1); j++) {
                if (map[j][k] != '?') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkSunk(int coordinateX, int coordinateY) {
        int tempX = coordinateX;
        int tempY = coordinateY;
        while (tempX >= 2 && map[tempX][coordinateY] == 'x') {
            tempX--;
            if (map[tempX][coordinateY] == '1' || map[tempX][coordinateY] == '2' || map[tempX][coordinateY] == '3' || map[tempX][coordinateY] == '4' || map[tempX][coordinateY] == '5') {
                return false;
            } else if (map[coordinateX][tempY] == '?') {
                break;
            }
        }
        tempX = coordinateX;
        while (tempX < 10 && map[tempX][coordinateY] == 'x') {
            tempX++;
            if (map[tempX][coordinateY] == '1' || map[tempX][coordinateY] == '2' || map[tempX][coordinateY] == '3' || map[tempX][coordinateY] == '4' || map[tempX][coordinateY] == '5') {
                return false;
            } else if (map[tempX][coordinateY] == '?') {
                break;
            }
        }
        while (tempY >= 2 && map[coordinateX][tempY] == 'x') {
            tempY--;
            if (map[coordinateX][tempY] == '1' || map[coordinateX][tempY] == '2' || map[coordinateX][tempY] == '3' || map[coordinateX][tempY] == '4' || map[coordinateX][tempY] == '5') {
                return false;
            } else if (map[coordinateX][tempY] == '?') {
                break;
            }
        }
        tempY = coordinateY;
        while (tempY < 10 && map[coordinateX][tempY] == 'x') {
            tempY++;
            if (map[coordinateX][tempY] == '1' || map[coordinateX][tempY] == '2' || map[coordinateX][tempY] == '3' || map[coordinateX][tempY] == '4' || map[coordinateX][tempY] == '5') {
                return false;
            } else if (map[coordinateX][tempY] == '?') {
                break;
            }
        }
        return true;
    }


    public void sinkShip(int coordinateX, int coordinateY) {
        int tempX = coordinateX;
        int tempY = coordinateY;
        if ((coordinateX < 10 && map[coordinateX + 1][coordinateY] == 'x') || (map[coordinateX - 1][coordinateY] == 'x' && coordinateX > 1)) {
            if (coordinateY < 10) {
                map[coordinateX][coordinateY + 1] = 'p';
            }
            if (coordinateY > 1) {
                map[coordinateX][coordinateY - 1] = 'p';
            }
            while (tempX >= 2 && map[tempX][coordinateY] == 'x') {
                tempX--;
                if (map[tempX][coordinateY] == '?') {
                    map[tempX][coordinateY] = 'p';
                }
                if (coordinateY < 10) {
                    map[tempX][coordinateY + 1] = 'p';
                }
                if (coordinateY > 1) {
                    map[tempX][coordinateY - 1] = 'p';
                }

            }
            tempX = coordinateX;
            while (tempX < 10 && map[tempX][coordinateY] == 'x') {
                tempX++;
                if (map[tempX][coordinateY] == '?') {
                    map[tempX][coordinateY] = 'p';
                }
                if (coordinateY < 10) {
                    map[tempX][coordinateY + 1] = 'p';
                }
                if (coordinateY > 1) {
                    map[tempX][coordinateY - 1] = 'p';
                }

            }
        } else {
            if (coordinateX < 10) {
                map[coordinateX + 1][coordinateY] = 'p';
            }
            if (coordinateX > 1) {
                map[coordinateX - 1][coordinateY] = 'p';
            }
            while (tempY >= 2 && map[coordinateX][tempY] == 'x') {
                tempY--;
                if (map[coordinateX][tempY] == '?') {
                    map[coordinateX][tempY] = 'p';
                }
                if (coordinateX < 10) {
                    map[coordinateX + 1][tempY] = 'p';
                }
                if (coordinateX > 1) {
                    map[coordinateX - 1][tempY] = 'p';
                }
            }
            tempY = coordinateY;
            while (tempY < 10 && map[coordinateX][tempY] == 'x') {
                tempY++;
                if (map[coordinateX][tempY] == '?') {
                    map[coordinateX][tempY] = 'p';
                }
                if (coordinateX < 10) {
                    map[coordinateX + 1][tempY] = 'p';
                }
                if (coordinateX > 1) {
                    map[coordinateX - 1][tempY] = 'p';
                }

            }
        }
        System.out.println("Trafiony Zatopiony!!");
    }

    public void updateHitMap(Map enemyMap) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                if (enemyMap.map[i][j] == 'p') {
                    map[i][j] = 'p';
                }
            }
        }
    }
}
