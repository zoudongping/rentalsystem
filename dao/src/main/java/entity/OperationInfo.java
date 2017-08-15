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
 * |  @操作记录实体类
 * +---------------------------------Oooo---------------------------------------+
 */
public class OperationInfo {
    private int oid;
    private String content;
    private int managerid;
    private String otime;

    @Override
    public String toString() {
        return "OperationInfo{" +
                "content='" + content + '\'' +
                ", oid=" + oid +
                ", managerid=" + managerid +
                ", otime='" + otime + '\'' +
                ", managerInfo=" + managerInfo +
                '}';
    }

    public ManagerInfo getManagerInfo() {
        return managerInfo;
    }

    public void setManagerInfo(ManagerInfo managerInfo) {
        this.managerInfo = managerInfo;
    }

    private ManagerInfo managerInfo;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getManagerid() {
        return managerid;
    }

    public void setManagerid(int managerid) {
        this.managerid = managerid;
    }

    public String getOtime() {
        return otime;
    }

    public void setOtime(String otime) {
        this.otime = otime;
    }

}
