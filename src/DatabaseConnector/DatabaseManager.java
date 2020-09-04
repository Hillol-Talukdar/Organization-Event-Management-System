package DatabaseConnector;

/**
 *
 * @author Hillol Talukdar
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {

    //default contructor must be private for singleTone
    private static DatabaseManager mInstance;
    public Connection connection; //Connection is from java.sql class

    public DatabaseManager() {

    }

    public static DatabaseManager getInstance() {
        if (mInstance == null) 
        {
            mInstance = new DatabaseManager();

            try 
            {
                mInstance.connection = DriverManager.getConnection(
                        Config.connectionUrl + Config.defaultDatabaseName,
                        Config.dbUser,
                        Config.dbPassword);

            } 
            catch (SQLException e) 
            {
                e.printStackTrace();
            }
        }
        return mInstance;
    }

    public boolean checkConnection() // for checking database is connected or not
    {
        return this.connection != null;
    }

    //For query using sql
    //ResultSet
    public ResultSet getResult(String query) throws SQLException
    {
        if (this.connection == null) 
        {
            return null;
        }
        Statement statement = this.connection.createStatement();
        return statement.executeQuery(query);
    }

    public PreparedStatement getPreparedStatement(String querry) throws SQLException
    {
        if (this.connection == null) 
        {
            return null;
        }

        return this.connection.prepareStatement(querry);
    }
}
