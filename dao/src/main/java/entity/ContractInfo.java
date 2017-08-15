package entity;

import java.util.Date;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年08月08日 - 11:19
 * |    @description   合同表实体类
 * +---------------------------------Oooo---------------------------------------+
 */
public class ContractInfo {
    private int cid;

    public String getBeginrentdate() {
        return beginrentdate;
    }

    public void setBeginrentdate(String beginrentdate) {
        this.beginrentdate = beginrentdate;
    }

    public String getOverrentdate() {
        return overrentdate;
    }

    public void setOverrentdate(String overrentdate) {
        this.overrentdate = overrentdate;
    }

    private String beginrentdate;
    private String overrentdate;
    private String content;
    private String firstparty;
    private String secondparty;
    private double penalty;
    private int cstatusid;
    public ContractStatusInfo contractStatusInfo;

    @Override
    public String toString() {
        return "ContractInfo{" +
                "beginrentdate='" + beginrentdate + '\'' +
                ", cid=" + cid +
                ", overrentdate='" + overrentdate + '\'' +
                ", content='" + content + '\'' +
                ", firstparty='" + firstparty + '\'' +
                ", secondparty='" + secondparty + '\'' +
                ", penalty=" + penalty +
                ", cstatusid=" + cstatusid +
                ", contractStatusInfo=" + contractStatusInfo +
                '}';
    }

    public ContractStatusInfo getContractStatusInfo() {
        return contractStatusInfo;
    }

    public void setContractStatusInfo(ContractStatusInfo contractStatusInfo) {
        this.contractStatusInfo = contractStatusInfo;
    }

    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getCstatusid() {
        return cstatusid;
    }

    public void setCstatusid(int cstatusid) {
        this.cstatusid = cstatusid;
    }



    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public String getSecondparty() {
        return secondparty;
    }

    public void setSecondparty(String secondparty) {
        this.secondparty = secondparty;
    }

    public String getFirstparty() {
        return firstparty;
    }

    public void setFirstparty(String firstparty) {
        this.firstparty = firstparty;
    }
}
