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
 * |　@create 2017/8/10 9:04
 * |  @管理员实体类
 * +---------------------------------Oooo---------------------------------------+
 */
public class ManagerInfo {
    private int mid;
    private String pwd;
    private String mname;
    private OperationInfo operationinfo;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public Generalledger getGeneralledger() {
        return generalledger;
    }

    public void setGeneralledger(Generalledger generalledger) {
        this.generalledger = generalledger;
    }

    public OperationInfo getOperationinfo() {
        return operationinfo;
    }

    public void setOperationinfo(OperationInfo operationinfo) {
        this.operationinfo = operationinfo;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    private Generalledger generalledger;

    @Override
    public String toString() {
        return "ManagerInfo{" +
                "mid=" + mid +
                ", pwd='" + pwd + '\'' +
                ", mname='" + mname + '\'' +
                ", operationinfo=" + operationinfo +
                ", generalledger=" + generalledger +
                '}';
    }
}
