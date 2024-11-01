package org.example.UpsolvedPractice.TicTacToe;

public class Board {
    PieceType[][] board;
    int size;
    int remainingSpaces;

    public Board(int size) {
        this.size = size;
        this.board = new PieceType[size][size];
        this.remainingSpaces = size*size;
    }

    public boolean addPiece(int i, int j, Player player) {
        if(board[i][j] != null) return false;
        board[i][j] = player.getPiece();
        remainingSpaces++;
        return true;
    }

    public int getRemainingSpaces() {
        return remainingSpaces;
    }

    public void printBoard() {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print(board[i][j]);
                if (j != size-1) System.out.println(" | ");
            }
            System.out.println();
        }
    }

    public boolean rowsChecked(PieceType playersPiece) {
        boolean rowFilled = true;
        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++) {
                if(playersPiece != board[i][j]) {
                    rowFilled = false;
                    break;
                }
            }
            if(rowFilled) return true;
            rowFilled = true;
        }
        return false;
    }

    public boolean colsChecked(PieceType playersPiece) {
        boolean colFilled = true;
        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++) {
                if(playersPiece != board[j][i]) {
                    colFilled = false;
                    break;
                }
            }
            if(colFilled) return true;
            colFilled = true;
        }
        return false;
    }



}
