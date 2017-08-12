package entity;

/**
 * 　　  　  　     \\\|///
 * 　　　 　  　 \\ .-.-　//
 * 　　　　　  　 (　.@.@　)
 * +-------oOOo----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月11日 - 10:05
 * |    @description   收货地址实体类
 * +---------------------------------Oooo---------------------------------------+
 */
public class AddressInfo {
    private String sid;
    private String name;
    private String address;
    private String tel;
    private String uid;

    @Override
    public String toString() {
        return "AddressInfo{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}