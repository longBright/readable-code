package cleancode.minesweeper.tobe.io.sign;

import cleancode.minesweeper.tobe.cell.CellSnapShot;
import java.util.List;

public class CellSignFinder {

    private static final List<CellSignProvidable> cellSignProviders = List.of(
            new EmptyCellSignProvider(),
            new FlagCellSignProvider(),
            new LandMineCellSignProvider(),
            new NumberCellSignProvider(),
            new UnCheckedCellSignProvider()
    );

    public String findCellSignFrom(CellSnapShot snapShot) {
        return cellSignProviders.stream()
                .filter(provider -> provider.supports(snapShot))
                .findFirst()
                .map(provider -> provider.provide(snapShot))
                .orElseThrow(() -> new IllegalStateException("확인할 수 없는 셀 입니다."));
    }
}
