package org.example.models;

import org.example.strategies.bot.BotPlayingStrategy;

public class Bot extends Player{
    BotDifficultyLevel botDifficultyLevel;
    BotPlayingStrategy botPlayingStrategy;

    public Bot(String name, char symbol, int id, PlayerType playerType, BotDifficultyLevel botDifficultyLevel, BotPlayingStrategy botPlayingStrategy) {
        super(name, symbol, id, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = botPlayingStrategy;
    }
}
