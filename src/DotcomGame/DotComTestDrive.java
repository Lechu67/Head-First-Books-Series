package DotcomGame;

public class DotComTestDrive {

    public static void main(String[] args) {

        DotComGame dotComGame = new DotComGame();
        String result = "failed";
        dotComGame.setupGame();
        if(!dotComGame.getDotComs().isEmpty())
            result = "pass";
        System.out.println(result);

        result = "failed";
        int fakeNumberOfGuesses = 20;
        String testResult = dotComGame.finishGame();
        if(testResult.equals("You suck"))
            result="passed";
        System.out.println(testResult + " " + result);

    }
}
