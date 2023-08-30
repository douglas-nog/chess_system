package br.com.dognog.chess;

import br.com.dognog.boardgame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColmuns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColmuns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
}
