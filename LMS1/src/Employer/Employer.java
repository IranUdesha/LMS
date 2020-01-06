
package Employer;

public class Employer {
    private String NIC;
    private String name;
    private String address;
    private String mob1;
    private String mob2;
    private String password;

    public Employer(String NIC, String password) {
        this.NIC = NIC;
        this.password = password;
    }

    public Employer(String NIC, String name, String address, String mob1, String mob2, String password) {
        this.NIC = NIC;
        this.name = name;
        this.address = address;
        this.mob1 = mob1;
        this.mob2 = mob2;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
