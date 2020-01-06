
package Management;

import Analyze.Result;
import java.sql.Date;

public class Holiday {
    private Date date;
    private String reason;

    public Holiday(Date date, String reason) {
        this.date = date;
        this.reason = reason;
    }

    public Holiday() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
    public boolean isHoliday(Date date)
    {
        ManagementDAO mdao = new ManagementDAO();
        Result result = mdao.checkHoliday(date);
        if (Integer.parseInt(result.getTableMode().getValueAt(0, 0).toString())==1)
            return true;
        else
            return false;
    }
    
    public String getExpireDate(Date date,int noOfIns)
    {
        Result result = new ManagementDAO().getExpireDate(date,noOfIns);
        return result.getTableMode().getValueAt(0, 0).toString();
    }
}
