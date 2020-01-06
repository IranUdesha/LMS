
package Control;

import Loan.AddLoan;
import Loan.AddPayment;
import Loan.Loan;
import Loan.LoanDAO;
import Management.Holiday;
import java.sql.Date;

public class LMS {     
    
    public static void main(String[] args) {
        //DBConnManager con = new DBConnManager();
        //con.connect();
        //Login lms = new Login();
        //lms.show();
        
        
        
        //Dashboard dash = new Dashboard();
        //dash.setVisible(true);
        //AddLoan cls = new AddLoan();
        //cls.setVisible(true);
        //AddPayment cls = new AddPayment();
        //cls.setVisible(true);
        LoanDAO test = new LoanDAO();
        test.test();        
    }
    
}
