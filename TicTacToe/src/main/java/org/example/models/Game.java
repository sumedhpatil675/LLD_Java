package org.example.models;

import org.example.strategies.winningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {

    Board board;
    List<Player> players;

    List<Move> moves;

    int nextPlayerTurnIndex;

    GameState gameState;

    Player winner;

    List<WinningStrategy> winningStrategies;

    private Game(int dimension,List<Player> players,List<WinningStrategy> winningStrategies)
    {
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.board = new Board(dimension);
        this.moves = new ArrayList<>();
        this.nextPlayerTurnIndex = 0;
        this.gameState = GameState.IN_PROGRESS;
    }

    public static Builder getBuilder()
    {
        return new Builder();
    }

    public static class Builder
    {
        List<Player> players;
        List<WinningStrategy> winningStrategies;
        int dimension;

        private  Builder()
        {
            this.players = new ArrayList<>();
            this.winningStrategies = new ArrayList<>();
            this.dimension = 0;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }
        public Builder addPlayer(Player player)
        {
            this.players.add(player);
            return this;
        }
        public Builder addWinningStrategy(WinningStrategy winningStrategy)
        {
            this.winningStrategies.add(winningStrategy);
            return this;
        }
        public Game build()
        {
            return new Game(dimension,players,winningStrategies);
        }

    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public int getNextPlayerTurnIndex() {
        return nextPlayerTurnIndex;
    }

    public void setNextPlayerTurnIndex(int nextPlayerTurnIndex) {
        this.nextPlayerTurnIndex = nextPlayerTurnIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public void addMove(Move move)
    {
        moves.add(move);
    }
    public Player getCurrentPlayer()
    {
        return players.get(nextPlayerTurnIndex);
    }

    public void nextPlayerTurn()
    {
        nextPlayerTurnIndex = (nextPlayerTurnIndex+1)%players.size();
    }

    public void updateBoard(Move move)
    {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        this.board.getBoard().get(row).set(col,move.getCell());
    }

}
