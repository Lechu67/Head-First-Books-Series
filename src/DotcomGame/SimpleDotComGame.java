package DotcomGame;

import java.util.Scanner;

public class SimpleDotComGame {

    public static void main(String[] args) {

        int numOfGuesses = 0;
        int randomNum = (int)Math.random() *5;
        int [] locations = {randomNum,randomNum+1,randomNum+2};

        SimpleDotCom simpleDotCom = new SimpleDotCom();
        simpleDotCom.setLocationCells(locations);
        Scanner scanner = new Scanner(System.in);
        while (simpleDotCom.getHitCount()<3) {
            System.out.println("Enter a number");
            simpleDotCom.checkYourself(scanner.next());
            numOfGuesses++;
        }
        System.out.println("You needed: "+numOfGuesses);


    }
}
