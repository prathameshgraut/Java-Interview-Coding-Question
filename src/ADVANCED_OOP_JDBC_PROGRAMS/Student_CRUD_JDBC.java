package ADVANCED_OOP_JDBC_PROGRAMS;

import java.sql.*;
import java.util.Scanner;

public class Student_CRUD_JDBC {

    static Connection con;

    // Connection Method
    static void getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ConnectionDB","root","Example@2024");
    }

    // INSERT
    static void insertStudent() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter City: ");
        String city = sc.next();

        String sql = "INSERT INTO student VALUES(?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, city);

        ps.executeUpdate();
        System.out.println("Record Inserted Successfully");
    }

    // SELECT
    static void displayStudent() throws Exception {
        String sql = "SELECT * FROM student";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " +rs.getString(2) + " " +rs.getString(3));
        }
    }

    // UPDATE
    static void updateStudent() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID to Update: ");
        int id = sc.nextInt();

        System.out.print("Enter New City: ");
        String city = sc.next();

        String sql = "UPDATE student SET city=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, city);
        ps.setInt(2, id);

        ps.executeUpdate();
        System.out.println("Record Updated Successfully");
    }

    // DELETE
    static void deleteStudent() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID to Delete: ");
        int id = sc.nextInt();

        String sql = "DELETE FROM student WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);

        ps.executeUpdate();
        System.out.println("Record Deleted Successfully");
    }

    // MAIN
    public static void main(String[] args) throws Exception {

        getConnection();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Insert\n2.Display\n3.Update\n4.Delete\n5.Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: 
                	insertStudent(); 
                	break;
                case 2: 
                	displayStudent(); 
                	break;
                case 3: 
                	updateStudent(); 
                	break;
                case 4: 
                	deleteStudent(); 
                	break;
                case 5:
                    con.close();
                    System.out.println("Connection Closed");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
