package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author codeli4m
 */
public class FarmaciaDb {
    
    static Connection con;
    static final String DB_URL = "jdbc:mysql://localhost:3306/inventario_farmacia";
    static final String DB_DRV = "com.mysql.jdbc.Driver";
    static final String DB_USER = "root";
    static final String DB_PASSWD = "newpasswordmysql";
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        if (con == null){
            try {
                Class.forName(DB_DRV);
                con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);                
         } catch (SQLException ex) {
                System.out.println("An error ocurred connecting database ");
                System.out.println(ex);
         }
        }
        return con;
    }
}