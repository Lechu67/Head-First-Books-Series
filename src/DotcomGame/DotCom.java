package DotcomGame;

import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locations;
    private int hitCount = 0;
    private String name;

    public String checkYourself(String userIn){

        String result = "miss";

        int index = locations.indexOf(userIn);

        if (index >=0) {
            locations.remove(index);
            if(locations.isEmpty())
                result = "kill";
            else
                result = "hit";
        }
        System.out.println(result);
        return result;
    }
    public void setLocationCells(ArrayList<String> locations){
        this.locations=locations;
    }

    public int getHitCount() {
        return hitCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
