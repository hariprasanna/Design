package org.example.UpsolvedPractice.TicTacToe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Game {
    private Board board;
    private Deque<Player> players;
    int ticTacToesSize = 3;

    public Game() {
        this.board = new Board(ticTacToesSize);
        this.players = new ArrayDeque<>();
    }

    public void startGame() {
        Player player1 = new Player(PieceType.X);
        Player player2 = new Player(PieceType.O);
        players.add(player1);
        players.add(player2);
        boolean winner = false;
        while(winner) {
            board.printBoard();
            if(board.getRemainingSpaces() == 0) {
                break;
            }
            Player player = players.removeFirst();
            fetchValidTurnInput(player);
            if(isWinner(player, ticTacToesSize)) {
                winner = true;
                System.out.println("You are the winner!");
            }
            players.addLast(player);
        }
        if(!winner) {
            System.out.println("It's a tie");
        }
    }

    public void fetchValidTurnInput(Player player) {
        boolean validPiece = false;
        while(!validPiece) {
            System.out.println("Player " + player + ". Enter the index you want to place the piece at: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String[] values = input.split(", ");
            int x = Integer.valueOf(values[0]);
            int y = Integer.valueOf(values[1]);
            if(board.addPiece(x, y, player)) {
                validPiece = true;
            } else {
                System.out.println("The place is already filled");
            }
        }
    }

    public boolean isWinner(Player player, int size) {
        PieceType playersPiece = player.getPiece();
        return board.rowsChecked(playersPiece) || board.colsChecked(playersPiece); //add diagonal checks also
    }

}
