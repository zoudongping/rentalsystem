package entity;

/**
 * Created by 李晨曦 2017年08月09日
 */
public class Rentaltypeinfo {
    private int tid;
    private String tname;

    @Override
    public String toString() {
        return "Rentaltypeinfo{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
