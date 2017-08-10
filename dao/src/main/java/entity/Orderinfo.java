package entity;

/**
 * Created by 李晨曦 2017年08月09日
 */
public class Orderinfo {
    private int oid;
    private String otime;
    private String ostatus;
    private int uid;
    private int rentalamount;
    private String rentaltype;
    private double ordertotal;
    private double deposit;
    private String payment;
    private int contractid;
    private int commodityid;
    private CommodityInfo commodityinfo;
    private Orderstatusinfo orderstatusinfo;
    private Paymenttype paymenttype;
    private Rentaltypeinfo rentaltypeinfo;

    @Override
    public String toString() {
        return "Orderinfo{" +
                "oid=" + oid +
                ", otime='" + otime + '\'' +
                ", ostatus='" + ostatus + '\'' +
                ", uid=" + uid +
                ", rentalamount=" + rentalamount +
                ", rentaltype='" + rentaltype + '\'' +
                ", ordertotal=" + ordertotal +
                ", deposit=" + deposit +
                ", payment='" + payment + '\'' +
                ", contractid=" + contractid +
                ", commodityid=" + commodityid +
                ", commodityinfo=" + commodityinfo +
                ", orderstatusinfo=" + orderstatusinfo +
                ", paymenttype=" + paymenttype +
                ", rentaltypeinfo=" + rentaltypeinfo +
                '}';
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getOtime() {
        return otime;
    }

    public void setOtime(String otime) {
        this.otime = otime;
    }

    public String getOstatus() {
        return ostatus;
    }

    public void setOstatus(String ostatus) {
        this.ostatus = ostatus;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getRentalamount() {
        return rentalamount;
    }

    public void setRentalamount(int rentalamount) {
        this.rentalamount = rentalamount;
    }

    public String getRentaltype() {
        return rentaltype;
    }

    public void setRentaltype(String rentaltype) {
        this.rentaltype = rentaltype;
    }

    public double getOrdertotal() {
        return ordertotal;
    }

    public void setOrdertotal(double ordertotal) {
        this.ordertotal = ordertotal;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public int getContractid() {
        return contractid;
    }

    public void setContractid(int contractid) {
        this.contractid = contractid;
    }

    public int getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(int commodityid) {
        this.commodityid = commodityid;
    }

    public CommodityInfo getCommodityinfo() {
        return commodityinfo;
    }

    public void setCommodityinfo(CommodityInfo commodityinfo) {
        this.commodityinfo = commodityinfo;
    }

    public Orderstatusinfo getOrderstatusinfo() {
        return orderstatusinfo;
    }

    public void setOrderstatusinfo(Orderstatusinfo orderstatusinfo) {
        this.orderstatusinfo = orderstatusinfo;
    }

    public Paymenttype getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(Paymenttype paymenttype) {
        this.paymenttype = paymenttype;
    }

    public Rentaltypeinfo getRentaltypeinfo() {
        return rentaltypeinfo;
    }

    public void setRentaltypeinfo(Rentaltypeinfo rentaltypeinfo) {
        this.rentaltypeinfo = rentaltypeinfo;
    }
}
