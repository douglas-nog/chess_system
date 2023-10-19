package br.com.dognog.application;

import br.com.dognog.chess.ChessMatch;
import br.com.dognog.chess.ChessPiece;
import br.com.dognog.chess.ChessPosition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMacth = new ChessMatch();

        while (true) {
            UI.printBoard(chessMacth.getPieces());
            System.out.println();
            System.out.println("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMacth.performChessMove(source, target);
        }
    }
}