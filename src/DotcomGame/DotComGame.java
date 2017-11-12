package DotcomGame;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;

public class DotComGame {

    private SimpleDotGameHelper helper = new SimpleDotGameHelper();
    private int numberOfHits = 0;
    private ArrayList<DotCom> dotComs;

    //a setUpGameO method to create and initialize the DotCom objects with names
    //and locations. Display brief instructions to the user.
    public void setupGame(){

        dotComs = new ArrayList<>();
        DotCom dotCom1 = new DotCom();
        dotCom1.setName("Pets");
        DotCom dotCom2 = new DotCom();
        dotCom2.setName("eToys");
        DotCom dotCom3 = new DotCom();
        dotCom3.setName("Go2");
        dotComs.add(dotCom1);
        dotComs.add(dotCom2);
        dotComs.add(dotCom3);
        System.out.println("Try to sink all dot coms in the fewest number of guesses");
        for(DotCom dotCom : dotComs){
            ArrayList<String> locations = helper.placeDotCom(3);
            dotCom.setLocationCells(locations);
        }
        System.out.println("Game is ready");
    }
    //method that asks the player for guesses and calls the
    //checkUserGuessO method until all the DotCom objects are removed from play.
    public void playGame(){
        while(!dotComs.isEmpty()){
            checkUserGeuss(helper.getUserInput("Enter a guess"));
        }
        finishGame();
    }
    //method that loops through all remaining DotCom objects and
    //calls each DotCom object's checkYourselfOmethod.
    public void checkUserGeuss(String userGuess){
        numberOfHits++;
        String result = "miss";
        for(DotCom dotCom : dotComs){
            result = dotCom.checkYourself(userGuess);
            if(result.equals("kill")) {
                dotComs.remove(dotCom);
                System.out.println("you just killed " + dotCom.getName());
                break;
            }
        }
        System.out.println(result);
    }
    //method that prints a message about the user's performance, based
    //on how many guesses it took to sink all of the DotCom objects.
    public String finishGame(){
        if(numberOfHits <=15)
            return "You are awesome";
        else
            return "You suck";
    }

    public ArrayList<DotCom> getDotComs() {
        return dotComs;
    }

    public static void main(String[] args) {
        DotComGame dotComGame = new DotComGame();
        dotComGame.setupGame();
        dotComGame.playGame();
    }
}

