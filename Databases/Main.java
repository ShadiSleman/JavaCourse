package Databases;

import Composition.Resolution;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Projects\\JavaCourse\\src\\Databases\\testjava.db");
//            conn.setAutoCommit(false);// will not auto commit the statements
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
                    "(name TEXT,phone INTEGER,email TEXT)");

//            statement.execute("INSERT INTO contacts (name,phone,email)"+
//                    "VALUES('Joe',45632,'joe@anywhere.com')");
//
//            statement.execute("INSERT INTO contacts (name,phone,email)"+
//                    "VALUES('Jane',4829484,'jane@anywhere.com')");
//
//            statement.execute("INSERT INTO contacts (name,phone,email)"+
//                    "VALUES('Fido',9038,'dog@anywhere.com')");


//            statement.execute("UPDATE contacts SET phone=5566789 where name='Jane'");

//Using ResultSet
//will return in console :
//            Tim 322342 tim@email.com
//            Joe 45632 joe@anywhere.com
//            Jane 5566789 jane@anywhere.com
//            Fido 9038 dog@anywhere.com

//statement.executeQuery also return same result

            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while(results.next()){
                System.out.println(results.getString("name")+" " +
                        results.getInt("phone")+" "+
                        results.getString("email"));
            }

            results.close();

            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong " + e.getMessage());
        }

    }

}
