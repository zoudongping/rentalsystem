package entity;/**
 * Created by 响 on 2017/8/10.
 */

/**
 * 　　  　  　     \\\|///
 * 　　　 　   　  \\ - -//
 * 　　　　　   　(　 @.@　)
 * +-------oOOo-----( v )-----oOOo--------------------------------------------+
 * |　@author Lee　　　　　　                                                                 　|
 * |　@author jxufe                                                   |
 * |　@create 2017/8/10 9:33
 * |  @交易记录实体类
 * +---------------------------------Oooo---------------------------------------+
 */
public class TransInfo {
    private int tid;
    private int transtype;
    private double transmoney;
    private String transdate;
    private String remark;
    private int uid;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getTranstype() {
        return transtype;
    }

    public void setTranstype(int transtype) {
        this.transtype = transtype;
    }

    public double getTransmoney() {
        return transmoney;
    }

    public void setTransmoney(double transmoney) {
        this.transmoney = transmoney;
    }

    public String getTransdate() {
        return transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "TransInfo{" +
                "tid=" + tid +
                ", transtype=" + transtype +
                ", transmoney=" + transmoney +
                ", transdate='" + transdate + '\'' +
                ", remark='" + remark + '\'' +
                ", uid=" + uid +
                '}';
    }
}
