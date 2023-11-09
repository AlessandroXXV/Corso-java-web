package Giocattolaio;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class dbManager 
{
    // Connection conn;
    /* public dbManager() throws SQLException, ClassNotFoundException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost::3306", "root", "root");
    }*/
    


    //JDBC: DRIVERS & CONNECTION
    //Un esempio di sintassi con anche chiamata manuale del Driver:
    String DB_URL = "jdbc:mysql://localhost:3306";
    String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    String DB_USERNAME = "root";
    String DB_PASSWORD = "root";

    Connection conn;
    dbManager()
    {
       try 
        {
            // Register the JDBC driver
            Class.forName(DB_DRIVER);
            // Open the connection
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            if (conn!= null)
            {
                System.out.println("Successfully connected.");
            }
            else 
            {
                System.out.println("Failed to connect.");
            } 
        }catch (Exception e)
        {
            e.printStackTrace();
        }finally
        {
            try
            {
                if (conn != null && !conn.isClosed())
                {
                    conn.close();
                }
            }catch (SQLException sqle)
            {
                sqle.printStackTrace();
            }
        }
    }
}
