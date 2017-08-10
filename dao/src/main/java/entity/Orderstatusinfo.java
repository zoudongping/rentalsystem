package entity;

/**
 * Created by 李晨曦 2017年08月09日
 */
public class Orderstatusinfo {
    private int sid;
    private String sname;

    @Override
    public String toString() {
        return "Orderstatusinfo{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
