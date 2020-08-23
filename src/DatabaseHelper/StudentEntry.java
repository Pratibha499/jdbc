package DatabaseHelper;

import Data.Student;
import connection.DataBaseconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentEntry{
    public boolean addNewStudentInDatabase(Connection connection,Student student) throws SQLException{
        String Studentname=student.getName();
        int Studentid=student.getId();
        String Studentlocation=student.getLocation();
        PreparedStatement p=connection.prepareStatement("INSERT INTO student(studentname,studentid,studentlocation)values (?,?,?);");
               p.setString(1,Studentname);
               p.setInt(2,Studentid);
               p.setString(3,Studentlocation);
               int n=p.executeUpdate();
               return n>=1;
    }
}

