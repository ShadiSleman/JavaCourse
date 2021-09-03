package ExceptionPrograms;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

//Multi Catch

public class MultiCatchMain {
    public static void main(String[] args) {
        int result = divide ();
        System.out.println(result);
    }

    private static int divide (){
        int x,y;
        try{
           x = getInt ();
           y= getInt();
            System.out.println("x is "+x + ", y is "+y);
            return x/y;
        }catch (NoSuchElementException e){
            throw new ArithmeticException("no suitable input");
        }catch (ArithmeticException e) {
            throw new ArithmeticException("attempt to divide by zero");
        }
    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        while(true){
            try{
                return s.nextInt();
            }catch (InputMismatchException e){
                s.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9");
            }
        }
    }


}

