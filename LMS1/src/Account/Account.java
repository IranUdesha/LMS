
package Account;

import java.sql.Date;
import java.util.List;

public class Account {
    private String accountNo;
    private Date openedDate;
    private float interestRate;
    private String customerNIC;
    private List<Transaction> transactions;

    public Account(String accountNo, Date openedDate, float interestRate, String customerNIC) {
        this.accountNo = accountNo;
        this.openedDate = openedDate;
        this.interestRate = interestRate;
        this.customerNIC = customerNIC;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Date getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(Date openedDate) {
        this.openedDate = openedDate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public String getCustomerNIC() {
        return customerNIC;
    }

    public void setCustomerNIC(String customerNIC) {
        this.customerNIC = customerNIC;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    
}
