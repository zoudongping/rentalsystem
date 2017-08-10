package entity;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月09日 - 9:25
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LevelInfo {
    private int lid;
    private String lname;

    @Override
    public String toString() {
        return "LevelInfo{" +
                "lid=" + lid +
                ", lname='" + lname + '\'' +
                '}';
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}