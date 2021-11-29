package ticTacToe;

import java.util.Random;
import java.util.Scanner;

public class ticTacToe {
    public static boolean isInteger(String x) {
        try {
            Integer.parseInt(x);
        } catch (NumberFormatException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

    public static void printBoard(char[][] boardArray) {
        for (int i = 0; i < boardArray.length; i++) {
            System.out.println();
            for (int x = 0; x < boardArray[i].length; x++) {
                System.out.print(boardArray[i][x] + " ");
            }
        }
        System.out.println();
    }

    public static boolean playerWin(char[][] ticTacToeSampleBoard) {
        if (
            /* First row X */
            ((ticTacToeSampleBoard[0][0] == 'X') && (ticTacToeSampleBoard[0][1] == 'X') && (ticTacToeSampleBoard[0][2] == 'X'))

            /* Second row X */
            || ((ticTacToeSampleBoard[1][0] == 'X') && (ticTacToeSampleBoard[1][1] == 'X') && (ticTacToeSampleBoard[1][2] == 'X'))

            /* Third row X */
            || ((ticTacToeSampleBoard[2][0] == 'X') && (ticTacToeSampleBoard[2][1] == 'X') && (ticTacToeSampleBoard[2][2] == 'X'))

            /* First column X */
            || ((ticTacToeSampleBoard[0][0] == 'X') && (ticTacToeSampleBoard[1][0] == 'X') && (ticTacToeSampleBoard[2][0] == 'X'))

            /* Second column X */
            || ((ticTacToeSampleBoard[0][1] == 'X') && (ticTacToeSampleBoard[1][1] == 'X') && (ticTacToeSampleBoard[2][1] == 'X'))

            /* Third column X */
            || ((ticTacToeSampleBoard[0][2] == 'X') && (ticTacToeSampleBoard[1][2] == 'X') && (ticTacToeSampleBoard[2][2] == 'X'))

            /* Top right to bottom left diagonal X */
            || ((ticTacToeSampleBoard[0][2] == 'X') && (ticTacToeSampleBoard[1][1] == 'X') && (ticTacToeSampleBoard[2][0] == 'X'))

            /* Top left to bottom right diagonal X */
            || ((ticTacToeSampleBoard[0][0] == 'X') && (ticTacToeSampleBoard[1][1] == 'X') && (ticTacToeSampleBoard[2][2] == 'X'))
        ) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean computerWin(char[][] ticTacToeSampleBoard) {
        if (
            /* First row O */
            ((ticTacToeSampleBoard[0][0] == 'O') && (ticTacToeSampleBoard[0][1] == 'O') && (ticTacToeSampleBoard[0][2] == 'O'))
            // 
            /* Second row O */
            || ((ticTacToeSampleBoard[1][0] == 'O') && (ticTacToeSampleBoard[1][1] == 'O') && (ticTacToeSampleBoard[1][2] == 'O'))
            // 
            /* Third row O */
            || ((ticTacToeSampleBoard[2][0] == 'O') && (ticTacToeSampleBoard[2][1] == 'O') && (ticTacToeSampleBoard[2][2] == 'O'))
            // 
            /* First column O */
            || ((ticTacToeSampleBoard[0][0] == 'O') && (ticTacToeSampleBoard[1][0] == 'O') && (ticTacToeSampleBoard[2][0] == 'O'))
            // 
            /* Second column O */
            || ((ticTacToeSampleBoard[0][1] == 'O') && (ticTacToeSampleBoard[1][1] == 'O') && (ticTacToeSampleBoard[2][1] == 'O'))
            // 
            /* Third column O */
            || ((ticTacToeSampleBoard[0][2] == 'O') && (ticTacToeSampleBoard[1][2] == 'O') && (ticTacToeSampleBoard[2][2] == 'O'))
            // 
            /* Top right to bottom left diagonal O */
            || ((ticTacToeSampleBoard[0][2] == 'O') && (ticTacToeSampleBoard[1][1] == 'O') && (ticTacToeSampleBoard[2][0] == 'O'))
            // 
            /* Top left to bottom right diagonal O*/
            || ((ticTacToeSampleBoard[0][0] == 'O') && (ticTacToeSampleBoard[1][1] == 'O') && (ticTacToeSampleBoard[2][2] == 'O'))
        ) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        char[][] ticTacToeSampleBoard = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};
        Random rand = new Random();

        int CompXPos = rand.nextInt(3);
        int CompYPos = rand.nextInt(3);
        int userXPos;
        int userYPos;

        Scanner userXPosScanner = new Scanner(System.in);
        Scanner userYPosScanner = new Scanner(System.in);

        while (
            /* First row X and O */
            ((ticTacToeSampleBoard[0][0] != 'X') && (ticTacToeSampleBoard[0][1] != 'X') && (ticTacToeSampleBoard[0][2] != 'X'))
            || ((ticTacToeSampleBoard[0][0] != 'O') && (ticTacToeSampleBoard[0][1] != 'O') && (ticTacToeSampleBoard[0][2] != 'O'))

            /* Second row X and O*/
            || ((ticTacToeSampleBoard[1][0] != 'X') && (ticTacToeSampleBoard[1][1] != 'X') && (ticTacToeSampleBoard[1][2] != 'X'))
            || ((ticTacToeSampleBoard[1][0] != 'O') && (ticTacToeSampleBoard[1][1] != 'O') && (ticTacToeSampleBoard[1][2] != 'O'))

            /* Third row X and O */
            || ((ticTacToeSampleBoard[2][0] != 'X') && (ticTacToeSampleBoard[2][1] != 'X') && (ticTacToeSampleBoard[2][2] != 'X'))
            || ((ticTacToeSampleBoard[2][0] != 'O') && (ticTacToeSampleBoard[2][1] != 'O') && (ticTacToeSampleBoard[2][2] != 'O'))

            /* First column X and O */
            || ((ticTacToeSampleBoard[0][0] != 'X') && (ticTacToeSampleBoard[1][0] != 'X') && (ticTacToeSampleBoard[2][0] != 'X'))
            || ((ticTacToeSampleBoard[0][0] != 'O') && (ticTacToeSampleBoard[1][0] != 'O') && (ticTacToeSampleBoard[2][0] != 'O'))

            /* Second column X and O */
            || ((ticTacToeSampleBoard[0][1] != 'X') && (ticTacToeSampleBoard[1][1] != 'X') && (ticTacToeSampleBoard[2][1] != 'X'))
            || ((ticTacToeSampleBoard[0][1] != 'O') && (ticTacToeSampleBoard[1][1] != 'O') && (ticTacToeSampleBoard[2][1] != 'O'))

            /* Third column X and O */
            || ((ticTacToeSampleBoard[0][2] != 'X') && (ticTacToeSampleBoard[1][2] != 'X') && (ticTacToeSampleBoard[2][2] != 'X'))
            || ((ticTacToeSampleBoard[0][2] != 'O') && (ticTacToeSampleBoard[1][2] != 'O') && (ticTacToeSampleBoard[2][2] != 'O'))

            /* Top right to bottom left diagonal X and O */
            || ((ticTacToeSampleBoard[0][2] != 'X') && (ticTacToeSampleBoard[1][1] != 'X') && (ticTacToeSampleBoard[2][0] != 'X'))
            || ((ticTacToeSampleBoard[0][2] != 'O') && (ticTacToeSampleBoard[1][1] != 'O') && (ticTacToeSampleBoard[2][0] != 'O'))

            /* Top left to bottom right diagonal X and O */
            || ((ticTacToeSampleBoard[0][0] != 'X') && (ticTacToeSampleBoard[1][1] != 'X') && (ticTacToeSampleBoard[2][2] != 'X'))
            || ((ticTacToeSampleBoard[0][0] != 'O') && (ticTacToeSampleBoard[1][1] != 'O') && (ticTacToeSampleBoard[2][2] != 'O'))
        ) {
            System.out.print("\033[H\033[2J"); System.out.flush();
            printBoard(ticTacToeSampleBoard);
            System.out.println("Which row? (Enter: 1, 2, 3 (This order is from top to bottom))");
            String userInputYPos = userYPosScanner.nextLine();

            if (isInteger(userInputYPos) == false || ((isInteger(userInputYPos) == true) && ((Integer.parseInt(userInputYPos)-1 > 2) || (Integer.parseInt(userInputYPos)-1 < 0)))) {
                System.out.print("\033[H\033[2J"); System.out.flush();
                System.out.println("The value you enetered was either out of bounds or was not an integer, please try again.");
                continue;
            }

            userYPos = Integer.parseInt(userInputYPos) - 1;

            System.out.print("\033[H\033[2J"); System.out.flush();
            printBoard(ticTacToeSampleBoard);
            System.out.println("Which column in that row? (Enter: 1, 2, 3 (This order is from left to right))");
            String userInputXPos = userXPosScanner.nextLine();

            if (isInteger(userInputXPos) == false || ((isInteger(userInputXPos) == true) && ((Integer.parseInt(userInputXPos)-1 > 2) || (Integer.parseInt(userInputXPos)-1 < 0)))) {
                System.out.print("\033[H\033[2J"); System.out.flush();
                System.out.println("The value you enetered was either out of bounds or was not an integer, please try again.");
                continue;
            }

            userXPos = Integer.parseInt(userInputXPos) - 1;

            if (ticTacToeSampleBoard[userYPos][userXPos] != '_') {
                while (ticTacToeSampleBoard[userYPos][userXPos] != '_') {
                    System.out.print("\033[H\033[2J"); System.out.flush();
                    printBoard(ticTacToeSampleBoard);
                    System.out.println("Which row? (Enter: 1, 2, 3 (This order is from top to bottom))");
                    userInputYPos = userYPosScanner.nextLine();

                    if (isInteger(userInputYPos) == false || ((isInteger(userInputYPos) == true) && ((Integer.parseInt(userInputYPos)-1 > 2) || (Integer.parseInt(userInputYPos)-1 < 0)))) {
                        System.out.print("\033[H\033[2J"); System.out.flush();
                        System.out.println("The value you enetered was either out of bounds or was not an integer, please try again.");
                        continue;
                    }

                    userYPos = Integer.parseInt(userInputYPos) - 1;

                    System.out.print("\033[H\033[2J"); System.out.flush();
                    printBoard(ticTacToeSampleBoard);
                    System.out.println("Which column in that row? (Enter: 1, 2, 3 (This order is from left to right))");
                    userInputXPos = userXPosScanner.nextLine();

                    if (isInteger(userInputXPos) == false || ((isInteger(userInputXPos) == true) && ((Integer.parseInt(userInputXPos)-1 > 2) || (Integer.parseInt(userInputXPos)-1 < 0)))) {
                        System.out.print("\033[H\033[2J"); System.out.flush();
                        System.out.println("The value you enetered was either out of bounds or was not an integer, please try again.");
                        continue;
                    }

                    userXPos = Integer.parseInt(userInputXPos) - 1;

                    if (ticTacToeSampleBoard[userYPos][userXPos] == '_') {
                        break;
                    } else {
                        continue;
                    }
                }
            }

            ticTacToeSampleBoard[userYPos][userXPos] = 'X';

            // Computer gameplay

            if (ticTacToeSampleBoard[CompYPos][CompXPos] != '_') {
                while (ticTacToeSampleBoard[CompYPos][CompXPos] != '_') {
                    CompXPos = rand.nextInt(3);
                    CompYPos = rand.nextInt(3);
                }
            }

            ticTacToeSampleBoard[CompYPos][CompXPos] = 'O';

            if (playerWin(ticTacToeSampleBoard) == true || computerWin(ticTacToeSampleBoard) == true) {
                break;
            } else {
                continue;
            }
        }

        if (playerWin(ticTacToeSampleBoard) == true) {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Congratulations! You won! Run the program again to play once more.");
            userXPosScanner.close();
            userYPosScanner.close();
            return;
        }

        if (playerWin(ticTacToeSampleBoard) == false) {
            System.out.print("\033[H\033[2J"); System.out.flush();
            printBoard(ticTacToeSampleBoard);
            System.out.println("You lost to the computer! Run the program again to play once more.");
            userXPosScanner.close();
            userYPosScanner.close();
            return;
        }

        userXPosScanner.close();
        userYPosScanner.close();
    }
}