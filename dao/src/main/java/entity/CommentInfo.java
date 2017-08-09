package entity;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月09日 - 9:26
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class CommentInfo {
    private int cid;
    private  CommodityInfo commodityinfo;
    private UserInfo userinfo;
    private String content;
    private LevelInfo levelinfo;

    @Override
    public String toString() {
        return "CommentInfo{" +
                "cid=" + cid +
                ", commodityinfo=" + commodityinfo +
                ", userinfo=" + userinfo +
                ", content='" + content + '\'' +
                ", levelinfo=" + levelinfo +
                '}';
    }
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public CommodityInfo getCommodityinfo() {
        return commodityinfo;
    }

    public void setCommodityinfo(CommodityInfo commodityinfo) {
        this.commodityinfo = commodityinfo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LevelInfo getLevelinfo() {
        return levelinfo;
    }

    public void setLevelinfo(LevelInfo levelinfo) {
        this.levelinfo = levelinfo;
    }

    public UserInfo getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(UserInfo userinfo) {
        this.userinfo = userinfo;
    }
}