package entity;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年08月09日 - 9:25
 * |  @description   相机信息类
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class CommodityInfo {
    private int cid;
    private String cname;
    private double dayprice;
    private double monthprice;
    private double yearprice;
    private double deposit;
    private int collocation;
    private int stock;
    private String brand;
    private double singlecost;
    private String image;

    public CommodityInfo() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public double getDayprice() {
        return dayprice;
    }

    public void setDayprice(double dayprice) {
        this.dayprice = dayprice;
    }

    public double getMonthprice() {
        return monthprice;
    }

    public void setMonthprice(double monthprice) {
        this.monthprice = monthprice;
    }

    public double getYearprice() {
        return yearprice;
    }

    public void setYearprice(double yearprice) {
        this.yearprice = yearprice;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public int getCollocation() {
        return collocation;
    }

    public void setCollocation(int collocation) {
        this.collocation = collocation;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSinglecost() {
        return singlecost;
    }

    public void setSinglecost(double singlecost) {
        this.singlecost = singlecost;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "CommodityInfo{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", dayprice=" + dayprice +
                ", monthprice=" + monthprice +
                ", yearprice=" + yearprice +
                ", deposit=" + deposit +
                ", collocation=" + collocation +
                ", stock=" + stock +
                ", brand='" + brand + '\'' +
                ", singlecost=" + singlecost +
                ", image='" + image + '\'' +
                '}';
    }
}
