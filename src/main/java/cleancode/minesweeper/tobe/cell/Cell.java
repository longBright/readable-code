package cleancode.minesweeper.tobe.cell;

public interface Cell {

    boolean isChecked();

    boolean isOpened();

    boolean isLandMine();

    boolean hasLandMineCount();

    CellSnapShot getSnapShot();

    void flag();

    void open();
}
