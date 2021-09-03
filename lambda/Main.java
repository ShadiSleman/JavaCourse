package lambda;

import java.util.*;

public class Main {

    //every lambda expression got three parts
    //1-argument list
    //2-an arrow token
    //3-body

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Printing from the Runnable");
            System.out.println("Line 2");
            System.out.format("Line is line %d\n", 3);
        }).start();
        //here we have empty argument list
        //body is the code that we want to run

        Employee john = new Employee("John Doe" , 30);
        Employee tim = new Employee("Tim Buchalka" , 21);
        Employee jack = new Employee("Jack Hill",40);
        Employee snow = new Employee("Snow White",22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

        //Using sort without lambda
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });


        //using sort with lambda
        //1-argument list - (Employee employee1 ,Employee employee2)
        //2-an arrow token - -> employee1.getName().compareTo(employee2.getName()
        //3-body - code in the next line

    Collections.sort(employees,(Employee employee1 ,Employee employee2)->
            employee1.getName().compareTo(employee2.getName()));



        //loop
        for(Employee employee : employees){
            System.out.println(employee.getName());
        }

    }
}

class Employee {
    private String name ;
    private int age ;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
