package GenericsClass;
//in this code we describe the problem why we need generic class , we need to pass integer and string and it's not possible
import java.util.ArrayList;

public class DescribeTheProblemMain {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList();//<Integer>
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("tim");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }


    private static void printDoubled(ArrayList<Integer> n) {//<Integer>
        for (Object i : n) {
            System.out.println((Integer) i * 2);
        }
    }

}
