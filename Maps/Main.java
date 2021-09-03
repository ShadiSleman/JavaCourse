package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer,Location> locations = new HashMap<Integer,Location>();
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        locations.put(0 , new Location ( 0 ,"Your are sitting in front of a computer learning Java"));
        locations.put(1 , new Location ( 1 ,"Your are standing at the end of a road before small brick building"));
        locations.put(2 , new Location ( 2 ,"Your are at the top of a hill"));
        locations.put(3 , new Location ( 3 ,"Your are inside a building , a well house for small spri..."));
        locations.put(4 , new Location ( 4 ,"Your are in a valley beside a stream"));
        locations.put(5 , new Location ( 5 ,"Your are in the forest "));

        int loc =1;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }

            loc = scanner.nextInt();
            if(!locations.containsKey(loc)){
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
