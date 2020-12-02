package racingcar;

import java.util.HashMap;
import java.util.Map;

public class RacingGamePlay {
    static int gameCount = 0;
    static Map<String, String> racingPlayBoard = new HashMap<String, String>();

    public static int runTimes() {
        for (String carName : racingPlayBoard.keySet()) {
            checkMoveCar(carName);
        }
        return ++gameCount;
    }

    public static void checkMoveCar(String carName) {
          if(RacingCarMovement.moveCar()) {
              racingPlayBoard.put(carName, racingPlayBoard.get(carName)+"-");
          }
    }


}
