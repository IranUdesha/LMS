
package Management;

import Analyze.Result;
import Control.DBConnManager;
import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

public class ManagementDAO {
    private DBConnManager dBConnManager = null;

    public ManagementDAO() {
        dBConnManager = new DBConnManager();
    }
    
    public Result checkHoliday(Date date)
    {
        Connection dbConn = null;
        ResultSet rs;
        Result result = new Result();
        
        try{
            dbConn = dBConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query ="SELECT COUNT(*) WHERE '" + date + "' IN (SELECT date FROM tblHoliday)";
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
    
    public Result getExpireDate(Date date,int noOfIns)
    {
        Connection dbConn = null;
        ResultSet rs;
        Result result = new Result();
        
        try{
            dbConn = dBConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query ="SELECT getExpDate(CURRENT_DATE,1)";
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

    private boolean typeof(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
