package DotcomGame;

import java.util.ArrayList;

public class SimpleDotComGame {

    public static void main(String[] args) {

        int numOfGuesses = 0;
        int randomNum = (int)Math.random() *5;
        ArrayList<String> locations = new ArrayList<String>();
        for(int i = randomNum; i < randomNum+3;i++)
            locations.add(i, String.valueOf(i));

        DotCom simpleDotCom = new DotCom();
        simpleDotCom.setLocationCells(locations);
        boolean running= true;
        while (running) {
            if(simpleDotCom.checkYourself(new SimpleDotGameHelper().getUserInput("Enter a number")).equals("kill")){
                running=false;
            }
            numOfGuesses++;

        }
        System.out.println("You needed: "+numOfGuesses);


    }
}
