
package Account;

import java.sql.Date;


public class Transaction {
    private Date instant;
    private float value;
    private int type;

    public Transaction(Date instant, float value, int type) {
        this.instant = instant;
        this.value = value;
        this.type = type;
    }

    public Date getInstant() {
        return instant;
    }

    public void setInstant(Date instant) {
        this.instant = instant;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
