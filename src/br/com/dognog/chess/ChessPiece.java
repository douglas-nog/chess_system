package br.com.dognog.chess;

import br.com.dognog.boardgame.Board;
import br.com.dognog.boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
