package org.example.strategies.winningStrategy;

import org.example.models.*;

public class ColWinningStrategy implements WinningStrategy {


    @Override
    public boolean checkWinner(Board board, Move move) {
        int columnToCheck = move.getCell().getCol();
        Player player = move.getCell().getPlayer();

        for(int i=0;i<board.getBoard().size();i++)
        {
            Cell cell = board.getBoard().get(i).get(columnToCheck);
            if(cell.getCellStatus().equals(CellStatus.EMPTY) || !cell.getPlayer().equals(player))
            {
                return false;
            }
        }
        return true;
    }
}
