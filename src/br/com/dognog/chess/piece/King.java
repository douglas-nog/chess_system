package br.com.dognog.chess.piece;

import br.com.dognog.boardgame.Board;
import br.com.dognog.chess.ChessPiece;
import br.com.dognog.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
