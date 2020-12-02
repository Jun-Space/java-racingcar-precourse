package racingcar;

import java.util.ArrayList;
import java.util.Map;

public class RacingGameEmulator {
    private final int TIMES;

    public static boolean gameOn;
    public static ArrayList<String> winners;
    static Map<String, String> racingPlayResult;

    public RacingGameEmulator(int TIMES) {
        this.TIMES = TIMES;
    }

    public void playGame() {
        while(RacingGamePlay.runTimes() != TIMES) {
            continue;
        }
    }

}
