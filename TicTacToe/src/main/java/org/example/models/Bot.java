package org.example.models;

import org.example.strategies.bot.BotPlayingStrategy;
import org.example.strategies.bot.BotPlayingStrategyFactory;

import java.util.Scanner;

public class Bot extends Player{
    BotDifficultyLevel botDifficultyLevel;
    BotPlayingStrategy botPlayingStrategy;

    public Bot(String name, char symbol,
               int id, PlayerType playerType,
               BotDifficultyLevel botDifficultyLevel,
                Scanner sc) {
        super(name, symbol, id, PlayerType.BOT,sc);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botDifficultyLevel);
    }
    public Move makeMove(Board board)
    {
        Move move = botPlayingStrategy.suggestMove(board);
        if(move==null)
        {
            return null;
        }
        System.out.printf("the bot is making move %d %d. \n",move.getCell().getRow(),move.getCell().getCol());
        move.getCell().setPlayer(this);
        move.getCell().setCellStatus(CellStatus.OCCUPIED);
        return move;
    }
}
