package entity;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月10日 - 9:24
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TransInfo {
    private int tid;
    private int transtype;
    private double transmoney;
    private String transdate;
    private String remark;
    private int uid;
    private UserInfo userInfo;
    private TransTypeInfo transTypeInfo;

    @Override
    public String toString() {
        return "TransInfo{" +
                "remark='" + remark + '\'' +
                ", tid=" + tid +
                ", transtype=" + transtype +
                ", transmoney=" + transmoney +
                ", transdate='" + transdate + '\'' +
                ", uid=" + uid +
                ", userInfo=" + userInfo +
                ", transTypeInfo=" + transTypeInfo +
                '}';
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTransdate() {
        return transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    public double getTransmoney() {
        return transmoney;
    }

    public void setTransmoney(double transmoney) {
        this.transmoney = transmoney;
    }

    public int getTranstype() {
        return transtype;
    }

    public void setTranstype(int transtype) {
        this.transtype = transtype;
    }

    public TransTypeInfo getTransTypeInfo() {
        return transTypeInfo;
    }

    public void setTransTypeInfo(TransTypeInfo transTypeInfo) {
        this.transTypeInfo = transTypeInfo;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}