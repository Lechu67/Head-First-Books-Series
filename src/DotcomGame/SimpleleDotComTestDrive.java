package DotcomGame;

public class SimpleleDotComTestDrive {


        public static void main (String[] args) {
            SimpleDotCom dot = new SimpleDotCom();
            int[] locations = {2, 3, 4};
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