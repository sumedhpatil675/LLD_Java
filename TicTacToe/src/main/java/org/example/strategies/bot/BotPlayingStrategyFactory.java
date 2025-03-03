package org.example.strategies.bot;

import org.example.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {


    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel)
    {
        return new EasyBotPlayingStrategy();
    }

}
