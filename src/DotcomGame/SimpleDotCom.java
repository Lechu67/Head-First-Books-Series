package DotcomGame;

public class SimpleDotCom {

    private int[] locations;
    private int hitCount = 0;

    public String checkYourself(String userIn){

        int guess = Integer.parseInt(userIn);

        String result = "miss";

        for(int cell : locations){
            if(guess == cell){
                result = "hit";
                hitCount++;
            }
        }
        if(locations.length == hitCount)
            result="kill";

        System.out.println(result);
        return result;
    }
    public void setLocationCells(int[] a){
        this.locations=a;
    }

    public int getHitCount() {
        return hitCount;
    }
}
