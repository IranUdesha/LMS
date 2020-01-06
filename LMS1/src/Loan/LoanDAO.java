
package Loan;

import Analyze.Result;
import Control.DBConnManager;
import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

public class LoanDAO {
    private DBConnManager dBConnManager = null;

    public LoanDAO() {
        dBConnManager = new DBConnManager();
    }
    
    public boolean addLoan(Loan loan)
    {
        Connection dbConn = null;
        boolean result = false;
        try{
            dbConn = dBConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query ="INSERT INTO tblLoan VALUES ('"+loan.getId()+"','"+loan.getValue()+"',CURRENT_DATE,'"+loan.getNoOfIns()+"','"+loan.getInterestRate()+"','"+loan.getInstallment()+"','"+loan.getCustomerNIC()+"','"+loan.getCollectorNIC()+"','"+loan.getStatus()+"')";
            int val = stmt.executeUpdate(query);
            if(val==1)
                result=true;            
        }
        catch(SQLException sQLException) {
            System.out.println(sQLException + "\nInsert query failed");        
        }
        finally
        {
            dBConnManager.connectionClose((com.mysql.jdbc.Connection) dbConn);
        }
        return result;
    } //
    
    public Result getPaymentAvailableList(Date date)
    {
        Connection dbConn = null;
        ResultSet rs;
        Result result = new Result();
        
        try{
            dbConn = dBConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query ="SELECT id FROM tblPayment WHERE date = CURRENT_DATE";
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
    
    public Result checkPaybleLoanID(String ID,Date date)
    {
        Connection dbConn = null;
        ResultSet rs;
        Result result = new Result();
        
        try{
            dbConn = dBConnManager.connect();
            Statement stmt = dbConn.createStatement();
            //String query ="SELECT COUNT(id) FROM tblLoan WHERE CAST(id AS int) = '" + Integer.parseInt(ID) + "' AND status IN (0,1) AND issued_dat < '" + date + "'";
            String query ="SELECT COUNT(id) FROM tblLoan WHERE CAST(id AS int) = '" + Integer.parseInt(ID) + "' AND status IN (0,1) AND issued_dat < CURRENT_DATE";
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
            
    public Result checkValidLoanID(String ID)
    {
        Connection dbConn = null;
        ResultSet rs;
        Result result = new Result();
        
        try{
            dbConn = dBConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query ="SELECT COUNT(id) FROM tblLoan WHERE CAST(id AS int) = '" + ID + "'";
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
    
    public void test()
    {
        Connection dbConn = null;
        //boolean result = false;
        try{
            dbConn = dBConnManager.connect();
            Statement stmt = dbConn.createStatement();
            //java.util.Date today = new java.util.Date();
            //java.sql.Date day = java.sql.Date.valueOf("2010-10-03");
            String query ="INSERT INTO tblholiday VALUES (DATE_FORMAT('2019-10-04','%Y/%m/%d'),'Hello')";
            int val = stmt.executeUpdate(query);
            //if(val==1)
                //result=true;            
        }
        catch(SQLException sQLException) {
            System.out.println(sQLException + "\nInsert query failed");        
        }
        finally
        {
            dBConnManager.connectionClose((com.mysql.jdbc.Connection) dbConn);
        }
    } //
}
