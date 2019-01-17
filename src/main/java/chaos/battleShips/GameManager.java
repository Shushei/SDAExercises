package chaos.battleShips;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GameManager {
    Scanner scanner = new Scanner(System.in);

    public void gameMenu() {
        String option;
        System.out.println("vs CPU");
        System.out.println("wczytaj z pliku");
        System.out.println("EXIT");
        System.out.println("Wybierz opcję menu: ");
        if ((option = scanner.nextLine()).equals("vs CPU")) {
            Player playerOne = new Player();
            ComputerPlayer playerTwo = new ComputerPlayer();
            gameStart(playerOne,playerTwo);
        } else if (option.equals("wczytaj z pliku")) {
            AbstractPlayer[] players = readFromFile(scanner.nextLine());
            gameStart(players[0],players[1]);
        }
    }

    public void gameStart(AbstractPlayer playerOne, AbstractPlayer playerTwo) {
        boolean playerOneWon = false;
        boolean playerTwoWon = false;
        while (!playerOneWon && !playerTwoWon) {
            System.out.println("Twoja Mapa trafień");
            playerOne.hitMap.printMap();
            System.out.println("Mapa trafień przeciwnika");
            playerTwo.hitMap.printMap();
            if (playerOne.playTurn(playerTwo.playerMap)) {
                saveToFile(playerOne, playerTwo);
                return;
            }
            playerOneWon = playerOne.hasWon(playerTwo.playerMap);


            playerTwo.playTurn(playerTwo.playerMap);
            playerTwoWon = playerTwo.hasWon(playerOne.playerMap);

        }
        if (playerOneWon) {
            System.out.println("Wygrał gracz");
        } else {
            System.out.println("Wygrał Komputer");
        }
    }

        private void saveToFile (AbstractPlayer playerOne, AbstractPlayer playerTwo){
            System.out.println("Podaj ściężkę do pliku");
            String filePath = "src/main/resources/SaveFiles/" + scanner.nextLine();
            File file = new File(filePath);
            String saveProgress = generateSaveString(playerOne, playerTwo);

            try {
                PrintWriter printToFile = new PrintWriter(filePath);
                printToFile.println(saveProgress);
                printToFile.close();
            } catch (FileNotFoundException error) {
                System.out.print("Nie widzę pliku");
            }

        }
        private String generateSaveString (AbstractPlayer playerOne, AbstractPlayer playerTwo){
            String toReturn = "10";
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 11; j++) {
                    toReturn += playerOne.playerMap.map[i][j];
                    toReturn += playerOne.hitMap.map[i][j];
                    toReturn += playerTwo.playerMap.map[i][j];
                    toReturn += playerTwo.hitMap.map[i][j];
                }
            }
            return toReturn;
        }
        private AbstractPlayer[] readFromFile (String fileName){
            String filePath = "src/main/resources/SaveFiles/";
            File file = new File(filePath + fileName);
            boolean done = false;
            AbstractPlayer[] players = new AbstractPlayer[2];
            do {
                try {
                    Scanner read = new Scanner(file);
                    String loadedText = read.nextLine();

                    Player playerOne = new Player();
                    AbstractPlayer playerTwo;
                    if (loadedText.charAt(2) == '0') {
                        playerTwo = new ComputerPlayer();
                    } else {
                        playerTwo = new Player();
                    }
                    String mapOne = "";
                    String mapTwo = "";
                    String mapThree = "";
                    String mapFour = "";
                    for (int i = 0; i < 121; i++) {
                        mapOne += loadedText.charAt(i*4 + 2);
                    }
                    for (int i = 0; i < 121; i++) {
                        mapTwo += loadedText.charAt(i*4 + 3);
                    }for (int i = 0; i < 121; i++) {
                        mapThree += loadedText.charAt(i*4 + 4);
                    }for (int i = 0; i < 121; i++) {
                        mapFour += loadedText.charAt(i*4 + 5);
                    }
                    for(int i = 0;i<11;i++){
                        for(int j = 0;j<11;j++){
                            playerOne.playerMap.map[i][j] = mapOne.charAt(11*i+j);
                            playerOne.hitMap.map[i][j] = mapTwo.charAt(11*i+j);
                            playerTwo.playerMap.map[i][j] = mapThree.charAt(11*i+j);
                            playerTwo.hitMap.map[i][j] = mapFour.charAt(11*i+j);
                        }
                    }
                    done = true;
                    players[0] = playerOne;
                    players[1] = playerTwo;

                } catch (FileNotFoundException error) {
                    System.out.print("Nie znaleziono pliku");
                }
            }while(!done);
            return players;
        }
    }
