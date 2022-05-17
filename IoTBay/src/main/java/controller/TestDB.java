package controller;


import java.sql.*;

import java.util.*;

import java.util.logging.*;
import model.dao.DBConnector;
import model.dao.DBManager;

public class TestDB {

    private static Scanner in = new Scanner(System.in);


    public static void main(String[] args) throws SQLException {
        try {
            DBConnector connector = new DBConnector();
            Connection conn = connector.openConnection();
            DBManager db = new DBManager(conn);
            System.out.println("Start");
             System.out.println("User name: ");

            String name = in.nextLine();

            System.out.println("User address: ");

            String address = in.nextLine();

            System.out.println("User phone: ");

            String phone = in.nextLine();

            System.out.println("User dob: ");

            String dob = in.nextLine();

            System.out.println("User email: ");

            String email = in.nextLine();
            System.out.println("User password: ");

            String password = in.nextLine();
//NAME, ADDRESS, PHONE, DOB, EMAIL, PASSWORD"

            db.addUser(name, address, phone, dob, email, password);
            System.out.println("User is added to the database.");

            connector.closeConnection();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
        
    }
    
    

    private void runQueries() throws SQLException {
//        testAdd();
    }

//    private void testAdd() {
//        try {
//
//            System.out.print("User name: ");
//
//            String name = in.nextLine();
//
//            System.out.print("User address: ");
//
//            String address = in.nextLine();
//
//            System.out.print("User phone: ");
//
//            String phone = in.nextLine();
//
//            System.out.print("User dob: ");
//
//            String dob = in.nextLine();
//
//            System.out.print("User email: ");
//
//            String email = in.nextLine();
//            System.out.print("User password: ");
//
//            String password = in.nextLine();
////NAME, ADDRESS, PHONE, DOB, EMAIL, PASSWORD"
//
//            db.addUser(name, address, phone, dob, email, password);
//            System.out.println("User is added to the database.");
//
//            connector.closeConnection();
//
//        } catch (SQLException ex) {
//
//            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
