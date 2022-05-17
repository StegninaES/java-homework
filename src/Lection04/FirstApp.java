package Lection04;

import java.util.Random;
import java.util.Scanner;

public class FirstApp {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static char player = '@';
    public static int playerHP = 100;
    public static int playerStr = 15;
    public static int playerCoins = 0;
    public static int playerScore = 0;
    public static int playerExp = 0;
    public static int playerX;
    public static int playerY;


    public static final int playerMoveUp = 8;
    public static final int playerMoveDown = 2;
    public static final int playerMoveLeft = 4;
    public static final int playerMoveRight = 6;

    public static int mapHeight;
    public static int mapWidth;
    public static char[][] hiddenMap;
    public static char[][] fakeMap;
    public static int mapSizeMin = 3;
    public static int mapSizeMax = 9;
    public static char emptyCell = '_';


    public static char coin = '$';
    public static int coinsCount;

    public static char enemy = 'E';
    public static int enemyStr;
    public static int enemyExp;
    public static int enemyHp;


    public static int enemyValueMin = 20;
    public static int enemyValueMax = 40;
    public static int enemiesCount = 40;

    public static int gameLevel = 0;

    public static void main(String[] args) {
        while (isPlayerAlive()) {
            ++gameLevel;
            System.out.println("Start game level " + gameLevel);
            levelCycle();
        }
        System.out.println("Game over. Player score " + playerScore);
    }

    private static void levelCycle() {
        createMap();
        createFakeMap();
        createPlayer();
        spawnEnemies();
        spawnCoins();
        while (true) {
            printMap();
            playerMoveAction();
            if (!isPlayerAlive()) {
                System.out.println("Player dead. Game over");
                break;
            }
            if (!isEnemyExist()) {
                System.out.println("Player win. Score " + playerScore + ". Level Finish");
                break;
            }
        }
    }

    public static void createMap() {
        mapWidth = randomValue(mapSizeMin, mapSizeMax);
        mapHeight = randomValue(mapSizeMin, mapSizeMax);
        hiddenMap = new char[mapHeight][mapWidth];

        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                hiddenMap[y][x] = emptyCell;

            }

        }
        System.out.println("Map  " + mapWidth + "x" + mapHeight + " has been created.");


    }

    public static void createFakeMap() {

        fakeMap = new char[mapHeight][mapWidth];

        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                fakeMap[y][x] = emptyCell;
            }
        }
        System.out.println("Fake Map  " + mapWidth + "x" + mapHeight + " has been created.");
    }

    public static void createPlayer() {
        playerX = randomValue(0, mapWidth - 1);
        playerY = randomValue(0, mapHeight - 1);
        hiddenMap[playerY][playerX] = player;
        fakeMap[playerY][playerX] = player;

        System.out.println("Player has been created in [" + (playerX + 1) + ":" + (playerY + 1) + "]");
        System.out.println("Player HP " + playerHP);
    }

    public static void spawnEnemies() {
        enemiesCount = (mapWidth + mapHeight) / 2;
        int enemyPosX;
        int enemyPosY;

        enemyHp = randomValue(enemyValueMin, enemyValueMax);
        enemyStr = randomValue(enemyValueMin, enemyValueMax);


        for (int i = 1; i <= enemiesCount; i++) {

            do {
                enemyPosX = random.nextInt(mapWidth);
                enemyPosY = random.nextInt(mapHeight);
            } while (!isEmptyCell(enemyPosX, enemyPosY));


            hiddenMap[enemyPosY][enemyPosX] = enemy;


        }
        System.out.println("Enemies has been created. count is " + enemiesCount);
    }

    public static void spawnCoins() {
        coinsCount = (mapWidth + mapHeight) / 4;
        int coinPosX;
        int coinPosY;

        for (int i = 1; i <= coinsCount; i++) {

            do {
                coinPosX = random.nextInt(mapWidth);
                coinPosY = random.nextInt(mapHeight);
            } while (!isEmptyCell(coinPosX, coinPosY));


            hiddenMap[coinPosY][coinPosX] = coin;


        }
        System.out.println("Coins has been created. count is " + coinsCount);
    }

    public static void playerMoveAction() {
        int playerlastX = playerX;
        int playerlastY = playerY;

        int playerDestination;
        do {
            System.out.print("Enter your destination: UP( " + playerMoveUp +
                    ")| DOWN( " + playerMoveDown +
                    ")| LEFT( " + playerMoveLeft +
                    ")| RIGHT " + playerMoveRight + ")>");

            playerDestination = scanner.nextInt();


            switch (playerDestination) {
                case playerMoveUp:
                    playerY -= 1;
                    break;
                case playerMoveDown:
                    playerY += 1;
                    break;
                case playerMoveLeft:
                    playerX -= 1;
                    break;
                case playerMoveRight:
                    playerX += 1;
                    break;


            }

        } while (!isValidPlayerMoveNextCell(playerX, playerY, playerlastX, playerlastY));

        playerNextCellCheck();

        hiddenMap[playerlastY][playerlastX] = emptyCell;
        hiddenMap[playerY][playerX] = player;
        fakeMap[playerlastY][playerlastX] = emptyCell;
        fakeMap[playerY][playerX] = player;


    }

    private static void playerNextCellCheck() {
        if (hiddenMap[playerY][playerX] == enemy) {
            playerHP -= enemyStr;
            playerScore++;
            enemiesCount--;
            System.out.println("Player has been attack on " + enemyStr + ". Player HP now is " + playerHP);
            System.out.println("Enemies count = " + enemiesCount);
        }
    }

    public static void printMap() {

        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                System.out.print(fakeMap[y][x] + "|");
            }
            System.out.println();
        }
    }

    public static int randomValue(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    public static boolean isEmptyCell(int x, int y) {
        return hiddenMap[y][x] == emptyCell;

    }

    public static boolean isPlayerAlive() {
        return playerHP > 0;
    }

    public static boolean isValidCell(int x, int y) {
        return x >= 0 && x < mapWidth && y >= 0 && y < mapHeight;
    }

    public static boolean isValidPlayerMoveNextCell(int nextCellX, int nextCellY, int lastCellX, int lastCellY) {
        if (isValidCell(nextCellX, nextCellY)) {
            System.out.println("Player move to " + (nextCellX + 1) + ":" + (nextCellY + 1));
            return true;
        } else {
            System.out.println("Invalid move");
            playerX = lastCellX;
            playerY = lastCellY;
            return false;
        }

    }

    public static boolean isEnemyExist() {
        return enemiesCount > 0;
    }


}




