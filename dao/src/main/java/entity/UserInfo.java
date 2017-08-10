package entity;

/**
 * 　　  　  　     \\\|///
 * 　　　 　  　 \\ .-.-　//
 * 　　　　　  　 (　.@.@　)
 * +-------oOOo----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月09日 - 11:22
 * |    @description   用户实体类
 * +---------------------------------Oooo---------------------------------------+
 */
public class UserInfo {
    private int uid;
    private String uname;
    private String pwd;
    private String nickname;
    private String account;
    private String email;
    private String tel;
    private double consumption;
    private String creditstatus;
    private String sex;

    @Override
    public String toString() {
        return "UserInfo{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", nickname='" + nickname + '\'' +
                ", account='" + account + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", consumption=" + consumption +
                ", creditstatus='" + creditstatus + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public String getCreditstatus() {
        return creditstatus;
    }

    public void setCreditstatus(String creditstatus) {
        this.creditstatus = creditstatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}