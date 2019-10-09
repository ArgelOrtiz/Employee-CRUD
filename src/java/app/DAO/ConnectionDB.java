package app.DAO;

import java.sql.SQLException;

public interface ConnectionDB {
    public void openConnection() throws SQLException;
    public void closeConnection()throws SQLException;    
}
