package org.example.controllers;

import org.example.models.Game;
import org.example.models.GameState;
import org.example.models.Player;
import org.example.services.BoardService;
import org.example.services.GameService;
import org.example.strategies.winningStrategy.ColWinningStrategy;
import org.example.strategies.winningStrategy.RowWinningStrategy;

import java.util.List;

public class GameController {

        public static Game createGame(int dimension, List<Player> playerList)
        {
            return Game.getBuilder()
                    .setPlayers(playerList)
                    .addWinningStrategy(new ColWinningStrategy())
                    .addWinningStrategy(new RowWinningStrategy())
                    .setDimension(dimension)
                    .build();
        }

        public void undo()
        {

        }
        public void displayBoard(Game game)
        {
            BoardService.display(game.getBoard());
        }

        public GameState getGameStatus(Game game)
        {
            return game.getGameState();
        }

        public void executeNextMove(Game game)
        {
            GameService gameService = new GameService(game);
            gameService.executeNextMove();
        }
        public String getWinner(Game game)
        {
            return game.getWinner().getName();
        }

}
