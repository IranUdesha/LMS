
package Loan;

import java.sql.Date;

public class Payment {
    private Date date;
    private float value;
    private Date time;

    public Payment(Date date, float value, Date time) {
        this.date = date;
        this.value = value;
        this.time = time;
    }

    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
    
}
