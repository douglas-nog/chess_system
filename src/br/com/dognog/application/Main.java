package br.com.dognog.application;

import br.com.dognog.chess.ChessMatch;

public class Main {
    public static void main(String[] args) {

        ChessMatch chessMacth = new ChessMatch();
        UI.printBoard(chessMacth.getPieces());

    }
}