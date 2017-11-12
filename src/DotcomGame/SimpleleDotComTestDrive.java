package DotcomGame;

import java.util.ArrayList;

public class SimpleleDotComTestDrive {


        public static void main (String[] args) {
            DotCom dot = new DotCom();
            ArrayList<String> locations = new ArrayList<String>();
            for(int i = 0; i <=3;i++)
                locations.add(i, String.valueOf(i));
            dot.setLocationCells(locations);
            String userGuess = "2";
            String result = dot.checkYourself(userGuess);

            String testResult = "failed";
            if (result == "hit")
                testResult = "passed";
            System.out.println(testResult);

            String fakeUserGuess = "5";
            result = dot.checkYourself(fakeUserGuess);
            if (result == "miss")
                testResult = "passed";
            System.out.println(testResult);
        }
}