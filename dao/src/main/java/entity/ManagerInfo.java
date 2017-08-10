package entity;/**
 * Created by 响 on 2017/8/10.
 */

import javax.jws.soap.SOAPBinding;

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
    private String mname;
    private CommodityInfo commodityInfo;

    @Override
    public String toString() {
        return "ManagerInfo{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", commodityInfo=" + commodityInfo +
                ", contractInfo=" + contractInfo +
                ", operationinfo=" + operationinfo +
                ", generalledger=" + generalledger +
                ", commentInfo=" + commentInfo +
                ", userInfo=" + userInfo +
                ", orderinfo=" + orderinfo +
                ", transInfo=" + transInfo +
                ", pwd=" + pwd +
                '}';
    }

    public CommodityInfo getCommodityInfo() {
        return commodityInfo;
    }

    public void setCommodityInfo(CommodityInfo commodityInfo) {
        this.commodityInfo = commodityInfo;
    }

    public Orderinfo getOrderinfo() {
        return orderinfo;
    }

    public void setOrderinfo(Orderinfo orderinfo) {
        this.orderinfo = orderinfo;
    }

    public TransInfo getTransInfo() {
        return transInfo;
    }

    public void setTransInfo(TransInfo transInfo) {
        this.transInfo = transInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public CommentInfo getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(CommentInfo commentInfo) {
        this.commentInfo = commentInfo;
    }

    public Generalledger getGeneralledger() {
        return generalledger;
    }

    public void setGeneralledger(Generalledger generalledger) {
        this.generalledger = generalledger;
    }


    public ContractInfo getContractInfo() {
        return contractInfo;
    }

    public void setContractInfo(ContractInfo contractInfo) {
        this.contractInfo = contractInfo;
    }

    private ContractInfo contractInfo;
    private OperationInfo operationinfo;
    private Generalledger generalledger;
    private CommentInfo commentInfo;
    private UserInfo userInfo;
    private Orderinfo orderinfo;
    private TransInfo transInfo;

    public OperationInfo getOperationinfo() {
        return operationinfo;
    }

    public void setOperationinfo(OperationInfo operationinfo) {
        this.operationinfo = operationinfo;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    private int pwd;
}
