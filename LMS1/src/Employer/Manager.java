
package Employer;

import Analyze.Result;

public class Manager extends Employer{
    
    public Manager(String NIC, String name, String address, String mob1, String mob2, String password) {
        super(NIC, name, address, mob1, mob2, password);
    } 
    
    public static Result getAllCreditCustomers()
    {
        return new EmployerDAO().getAllCreditCustomers();
    }
    
    public static Result getAllCollectors()
    {
        return new EmployerDAO().getAllCollectors();
    }
}
