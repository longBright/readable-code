package cleancode.minesweeper.tobe.minesweeper.board.cell;

import java.util.Objects;

public class CellSnapShot {

    private final CellSnapshotStatus status;
    private final int nearbyLandMineCount;

    public CellSnapShot(CellSnapshotStatus status, int nearbyLandMineCount) {
        this.status = status;
        this.nearbyLandMineCount = nearbyLandMineCount;
    }

    public static CellSnapShot of(CellSnapshotStatus status, int nearbyLandMineCount) {
        return new CellSnapShot(status, nearbyLandMineCount);
    }

    public static CellSnapShot ofEmpty() {
        return of(CellSnapshotStatus.EMPTY, 0);
    }

    public static CellSnapShot ofFlag() {
        return of(CellSnapshotStatus.FLAG, 0);
    }

    public static CellSnapShot ofLandMine() {
        return of(CellSnapshotStatus.LANDMINE, 0);
    }

    public static CellSnapShot ofNumber(int nearbyLandMineCount) {
        return of(CellSnapshotStatus.NUMBER, nearbyLandMineCount);
    }

    public static CellSnapShot ofUnchecked() {
        return of(CellSnapshotStatus.UNCHECEKD, 0);
    }

    public boolean isSameStatus(CellSnapshotStatus cellSnapshotStatus) {
        return this.status == cellSnapshotStatus;
    }

    public CellSnapshotStatus getStatus() {
        return status;
    }

    public int getNearbyLandMineCount() {
        return nearbyLandMineCount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CellSnapShot snapShot = (CellSnapShot) o;
        return nearbyLandMineCount == snapShot.nearbyLandMineCount && status == snapShot.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, nearbyLandMineCount);
    }
}
