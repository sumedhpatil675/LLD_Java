package org.example.models;

import java.util.Scanner;

public class Player {

    private String name;
    private char symbol;
    private int id;
    private PlayerType playerType;
    private  Scanner scanner;

    public Player(String name, char symbol, int id, PlayerType playerType, Scanner sc) {
        this.name = name;
        this.symbol = symbol;
        this.id = id;
        this.playerType = playerType;
        this.scanner = sc;
    }

    private static boolean cellAvailable(Board board)
    {
        for(int i=0;i<board.getBoard().size();i++)
        {
            for(int j=0;j<board.getBoard().size();j++)
            {
                if(board.getBoard().get(i).get(j).getCellStatus().equals(CellStatus.EMPTY))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Move makeMove(Board board)
    {
        if(!cellAvailable(board))
        {
            return null;
        }
        System.out.println("Enter the row and column where you want to play move.");

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        Cell cell = new Cell(board.getBoard().get(row).get(col));

        System.out.printf("The player %s is making move at cell: %d, %d\n",this.name,cell.getRow(),cell.getCol());

        if(cell.getCellStatus().equals(CellStatus.OCCUPIED))
        {
            throw new IllegalArgumentException("The cell is occupied");
        }
        cell.setPlayer(this);
        cell.setCellStatus(CellStatus.OCCUPIED);
        return new Move(cell);
    }
}
