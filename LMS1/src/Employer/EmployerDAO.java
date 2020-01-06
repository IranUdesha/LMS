
package Employer;

import Analyze.Result;
import Control.DBConnManager;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

public class EmployerDAO {
    private DBConnManager dBConnManager = null;  

    public EmployerDAO() {
        dBConnManager = new DBConnManager();
    }
    
    public Result getAllCollectors()
    {
        Connection dbConn = null;
        ResultSet rs;
        Result result = new Result();
        
        try{
            dbConn = dBConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query ="SELECT nic,name FROM tblEmployee WHERE type = 1";
            rs = stmt.executeQuery(query);   
            result.setTableMode(DbUtils.resultSetToTableModel(rs)); 
        }
        catch(SQLException sQLException) {
            System.out.println(sQLException + "\nSelect query failed");        
        }
        finally
        {
            dBConnManager.connectionClose(dbConn);
        }
        return result;
    }
    
    public Result getAllCreditCustomers()
    {
        Connection dbConn = null;
        ResultSet rs;
        Result result = new Result();
        
        try{
            dbConn = dBConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query ="SELECT nic,name FROM tblCreditCustomer";
            rs = stmt.executeQuery(query);   
            result.setTableMode(DbUtils.resultSetToTableModel(rs)); 
        }
        catch(SQLException sQLException) {
            System.out.println(sQLException + "\nSelect query failed");        
        }
        finally
        {
            dBConnManager.connectionClose(dbConn);
        }
        return result;
    }
} //
