package br.com.dognog.application;

import br.com.dognog.chess.ChessException;
import br.com.dognog.chess.ChessMatch;
import br.com.dognog.chess.ChessPiece;
import br.com.dognog.chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMacth = new ChessMatch();

        while (true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMacth.getPieces());
                System.out.println();
                System.out.println("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                boolean[][] possibleMoves = chessMacth.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMacth.getPieces(), possibleMoves);

                System.out.println();
                System.out.println("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMacth.performChessMove(source, target);
            } catch (ChessException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}