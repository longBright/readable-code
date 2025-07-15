package cleancode.minesweeper.tobe.minesweeper.board.cell;

public interface Cell {

    boolean isChecked();

    boolean isOpened();

    boolean isLandMine();

    boolean hasLandMineCount();

    CellSnapShot getSnapShot();

    void flag();

    void open();
}
