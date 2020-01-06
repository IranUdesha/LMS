
package Loan;

import Analyze.Result;
import java.sql.Date;
import java.util.List;

public class Loan {
    private String id;
    private float value;
    private Date issuedDate;
    private float interestRate;
    private int noOfIns;
    private float installment;
    private String customerNIC;
    private String collectorNIC;
    private int status;
    private List<Payment> payments;

    public Loan(String id, float value, Date issuedDate, float interestRate, int noOfIns, float installment, String customerNIC, String collectorNIC, int status) {
        this.id = id;
        this.value = value;
        this.issuedDate = issuedDate;
        this.interestRate = interestRate;
        this.noOfIns = noOfIns;
        this.installment = installment;
        this.customerNIC = customerNIC;
        this.collectorNIC = collectorNIC;
        this.status = status;
    }

    public Loan() {        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public int getNoOfIns() {
        return noOfIns;
    }

    public void setNoOfIns(int noOfIns) {
        this.noOfIns = noOfIns;
    }

    public float getInstallment() {
        return installment;
    }

    public void setInstallment(float installment) {
        this.installment = installment;
    }

    public String getCustomerNIC() {
        return customerNIC;
    }

    public void setCustomerNIC(String customerNIC) {
        this.customerNIC = customerNIC;
    }

    public String getCollectorNIC() {
        return collectorNIC;
    }

    public void setCollectorNIC(String collectorNIC) {
        this.collectorNIC = collectorNIC;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    } 
    
    public boolean isValid(String id,Date date)
    {
        LoanDAO ldao = new LoanDAO();
        Result result = ldao.checkPaybleLoanID(id,date);
        if (Integer.parseInt(result.getTableMode().getValueAt(0, 0).toString())==1)
            return false;
        else
            return true;
    }
    
    public static boolean isValid(String id)
    {
        LoanDAO ldao = new LoanDAO();
        Result result = ldao.checkValidLoanID(id);
        if (Integer.parseInt(result.getTableMode().getValueAt(0, 0).toString())==1)
            return true;
        else
            return false;
    }   
}
