
package Customer;

public abstract class Customer {
    private String NIC;
    private String name;
    private String address;
    private String mob1;
    private String mob2;
    private String email;

    public Customer(String NIC, String name, String address, String mob1, String mob2, String email) {
        this.NIC = NIC;
        this.name = name;
        this.address = address;
        this.mob1 = mob1;
        this.mob2 = mob2;
        this.email = email;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMob1() {
        return mob1;
    }

    public void setMob1(String mob1) {
        this.mob1 = mob1;
    }

    public String getMob2() {
        return mob2;
    }

    public void setMob2(String mob2) {
        this.mob2 = mob2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
