package entity;

/**
 * Created by 李晨曦 2017年08月09日
 */
public class Paymenttype {
    private int pid;
    private String pname;

    @Override
    public String toString() {
        return "Paymenttype{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                '}';
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
