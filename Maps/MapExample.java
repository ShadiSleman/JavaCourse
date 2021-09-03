package Maps;


//Collection - Set and SortedSet/ List / Queue / Deque /
//Map - SortedMap

import com.sun.xml.internal.ws.api.message.Packet;

import java.util.HashMap;
import java.util.Map;

//Map can't contain duplicates , each key map single value
//if you insert same key twice , it will overriden it

//put(key,value)
//get(key)
//remove(key)
//remove(key,value)
//replace(ket,oldValue,newValue)
//keySet
//containsKey(key) ( in Main Class )
public class MapExample {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a complied high level, object-oriented platform independant language ");
        languages.put("Python", "an interpreted , object-oriented , high-level programming language");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));


        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "This is about Java");
        }
        System.out.println(languages.get("Java"));

        System.out.println("=====================================");
        languages.remove("Lisp"); // remove(key)

        if (languages.remove("Algol", "an algorithmiiiiiiic language")) // remove9key,value)
        {
            System.out.println("Algol Removed");
        }else {
            System.out.println("Algol not Removed");
        }


        if(languages.replace("BASIC","Beginners All Purposes Symbolic Instruction Code","a functional programming language with imperative features")){
            System.out.println("BASIC replaced");
        }else{
            System.out.println("BASIC was not replaced");
        }



        //keySet Method - to print all keys and values
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key)); // get(key)
        }


    }

}
