package Collections.ArrayList;

import java.util.ArrayList;

public class GroceryList {

    //List - resize the array , no need to initiate the size
    // It's an ordered collection
    //we specify the number to access a particular element.
    //duplicate inserts is possible here

    //add(item)
    //set(position,newItem) ( in case you have the position ) if not then you indexOf(oldItem) to return position
    //remove(position)
    //indexOf(searchItem);
    //addAll - to copy arrayList

    //we can't create arraylist of int
    //    private ArrayList<int> groceryList = new ArrayList<int>();
    //because it's primitive .
    //so the solution is to create new IntClass class with 1 field int ;
    //private int myValue ;


    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {

        groceryList.add(item);

    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + "items in your grocer");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));

        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }


    private void removeGroceryItem(int position) {
        groceryList.remove(position);

    }

    private int findItem(String searchItem) {

        return groceryList.indexOf(searchItem);
    }

    //Getter
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public boolean onFile(String searchItem) {
        int possition = findItem(searchItem);
        if (possition >= 0) {
            return true;
        }
        return false;
    }
}
