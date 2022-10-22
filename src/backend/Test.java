/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author codeli4m
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    
    static final String DB_URL =
    "jdbc:mysql://localhost:3306/inventario_farmacia";
    static final String DB_DRV = "com.mysql.jdbc.Driver";
    static final String DB_USER = "root";
    static final String DB_PASSWD = "newpasswordmysql";

   public static void main(String[] args){
       
      System.out.println("Test corriendo desde backend paquete");

      Connection connection = null;
      Statement statement = null;
      ResultSet resultSet = null;

      try{
         connection=DriverManager.getConnection
            (DB_URL,DB_USER,DB_PASSWD);
         statement=connection.createStatement();
         resultSet=statement.executeQuery
            ("SELECT * FROM Usuarios");
         while(resultSet.next()){
            System.out.printf("%d\t%s\t%s\t%s\t%s\n",
            resultSet.getInt(1),
            resultSet.getString(2),
            resultSet.getString(3),
            resultSet.getString(4),
            resultSet.getString(5));    
         }

      }catch(SQLException ex){
      }finally{
         try {
            resultSet.close();
            statement.close();
            connection.close();
         } catch (SQLException ex) {
         }
      }
   }
//    <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
//<dependency>
//    <groupId>mysql</groupId>
//    <artifactId>mysql-connector-java</artifactId>
//    <version>8.0.30</version>
//</dependency>

}
