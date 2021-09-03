import java.util.Scanner;

public class UsingScanner {

    public static void main(String[] args) {

        //scanner instance
        java.util.Scanner scanner = new java.util.Scanner(System.in);//System.in = typing input in the console

        System.out.println("Enter year of birth:");

        boolean hasNextInt = scanner.hasNextInt(); // return true if the input is Int
        if (hasNextInt) { //
            int yearOfBirth = scanner.nextInt();

            scanner.nextLine(); //handle next line character ("Enter" key)

            System.out.println("Enter Your name : ");
            String name = scanner.nextLine();//to read a line of input in console
            int age = 2021 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }

        } else
            System.out.println("Unable to parse year of birth");


        scanner.close();
    }
}
