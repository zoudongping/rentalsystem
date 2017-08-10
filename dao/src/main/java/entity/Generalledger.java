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
 * |　@create 2017/8/10 9:12
 * |  @总账实体类
 * +---------------------------------Oooo---------------------------------------+
 */
public class Generalledger {
    private int gid;
    private String type;
    private String content;
    private double currentamount;
    private double general;

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getCurrentamount() {
        return currentamount;
    }

    public void setCurrentamount(double currentamount) {
        this.currentamount = currentamount;
    }

    public double getGeneral() {
        return general;
    }

    public void setGeneral(double general) {
        this.general = general;
    }

    @Override
    public String toString() {
        return "Generalledger{" +
                "gid=" + gid +
                ", type='" + type + '\'' +
                ", content='" + content + '\'' +
                ", currentamount=" + currentamount +
                ", general=" + general +
                '}';
    }
}
