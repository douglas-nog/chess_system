package br.com.dognog.chess;

import br.com.dognog.boardgame.BoardException;

public class ChessException extends BoardException {

    public ChessException(String message) {
        super(message);
    }
}
