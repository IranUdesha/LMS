
package Customer;

import Control.DBConnManager;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDAO {
    
    private DBConnManager dBConnManager = null;

    public CustomerDAO() {
        dBConnManager = new DBConnManager();
    }
    
    public boolean addCreditCustomer(CreditCustomer customer)
    {
        Connection dbConn = null;
        boolean result = false;
        try{
            dbConn = dBConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query ="INSERT INTO tblCreditCustomer VALUES ('"+customer.getNIC()+"','"+customer.getName()+"','"+customer.getAddress()+"','"+customer.getMob1()+"','"+customer.getMob2()+"','"+customer.getEmail()+"')";
            int val = stmt.executeUpdate(query);
            if(val==1)
                result=true;
            
        }
        catch(SQLException sQLException) {
            System.out.println(sQLException + "\nInser query failed");
        
        }
        finally
        {
            dBConnManager.connectionClose(dbConn);
        }
        return result;
    }
}
