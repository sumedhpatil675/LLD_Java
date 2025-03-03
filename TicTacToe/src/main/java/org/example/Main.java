package org.example;

import org.example.controllers.GameController;
import org.example.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        GameController gameController = new GameController();

        System.out.println("Let's begin TicTacToe");

        System.out.println("What dimension of the board you want");
        int dimension = scanner.nextInt();

        System.out.println("How many total players ?");
        int numberOfPlayers = scanner.nextInt();

        System.out.println("Is there a bot y/n");
        String isBot = scanner.next();
        int nonBotPlayers = numberOfPlayers;
        if(isBot.equals("y"))
        {
            nonBotPlayers -=1;
        }
        List<Player> playerList = new ArrayList<>();

        // Adding players
        for(int i=0;i<nonBotPlayers;i++)
        {
            System.out.println("Enter the name of the player"+i);
            String playerName = scanner.next();

            System.out.println("Enter the symbol for the bot");
            String symbol = scanner.next();

            playerList.add(new Player(playerName,symbol.charAt(0),i,PlayerType.HUMAN,scanner));
        }

        if(isBot.equals("y"))
        {
            System.out.println("Enter the nae of the bot");
            String botName = scanner.next();

            System.out.println("Enter the symbol for the bot");
            String symbol = scanner.next();

            playerList.add(new Bot(botName,symbol.charAt(0),3,PlayerType.BOT,BotDifficultyLevel.EASY,scanner));
        }
        Game game = gameController.createGame(dimension,playerList);

        while(gameController.getGameStatus(game).equals(GameState.IN_PROGRESS))
        {
            System.out.println("This is the current board");
            gameController.displayBoard(game);
            gameController.executeNextMove(game);
        }
        System.out.println("Result of the game: ");
        if(gameController.getGameStatus(game).equals(GameState.DRAW))
        {
            System.out.println("DRAW");
        }else
        {
            System.out.println("The winner is: "+gameController.getWinner(game));
        }

    }
}