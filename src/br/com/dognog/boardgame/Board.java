package br.com.dognog.boardgame;

public class Board {

    private int rows;
    private int colmuns;
    private Piece[][] pieces;

    public Board(int rows, int colmuns) {
        this.rows = rows;
        this.colmuns = colmuns;
        pieces = new Piece[rows][colmuns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColmuns() {
        return colmuns;
    }

    public void setColmuns(int colmuns) {
        this.colmuns = colmuns;
    }

    public Piece piece(int row, int colmun) {
        return pieces[row][colmun];
    }

    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }
}
