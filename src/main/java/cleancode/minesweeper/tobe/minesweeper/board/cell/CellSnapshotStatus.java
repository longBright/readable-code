package cleancode.minesweeper.tobe.minesweeper.board.cell;

public enum CellSnapshotStatus {

    EMPTY("빈 셀"),
    FLAG("깃발"),
    LANDMINE("지뢰"),
    NUMBER("숫자"),
    UNCHECEKD("확인 전");

    private final String description;

    CellSnapshotStatus(String description) {
        this.description = description;
    }
}
