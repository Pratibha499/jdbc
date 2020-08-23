package main;

import Data.Student;
import DatabaseHelper.StudentEntry;
import connection.DataBaseconnection;

import java.sql.SQLException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws SQLException {
        DataBaseconnection dataBaseconnection=new DataBaseconnection();
        dataBaseconnection.attemptConnection();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student name");
        String studentname=sc.nextLine();
        System.out.println("enter student id");
        int studentid=Integer.parseInt(sc.nextLine());
        System.out.println("enter student location");
        String studentlocation=sc.nextLine();
        Student student=new Student(studentname,studentid,studentlocation);
        StudentEntry studentEntry=new StudentEntry();


    }
}
