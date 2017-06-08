/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fakebook;

/**
 *
 * @author irwan
 */
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Database {
    
    private ResultSet rs = null;

    public Database() {
    }
    public ResultSet getData(String SQLString){
        try{
        String url = "jdbc:oracle:thin:@localhost:1521:kitkat";
        String username = "c##tubes";
        String password = "tubes";

        Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement statement = conn.createStatement();
        statement = conn.createStatement();
        rs=statement.executeQuery(SQLString);
//        statement.close();
//        conn.close();
        }catch(Exception e){
        };
        return rs;
    }
    public void query(String SQLString){
        try{
        String url = "jdbc:oracle:thin:@localhost:1521:kitkat";
        String username = "c##tubes";
        String password = "tubes";

        Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement statement = conn.createStatement();
        statement = conn.createStatement();
        String sql = SQLString;
        statement.executeUpdate(sql);
        statement.close();
        conn.close();
        }catch(Exception e){  
        };
    }
}
