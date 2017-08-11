package dao;

import entity.Orderinfo;

import java.util.List;

/**
 * Created by 李晨曦 on 2017/8/9.
 */
public interface OrderinfoDao {
    public int insertOrderinfo(Orderinfo orderinfo);
    public int deleteOrderinfo(String oid);
    public int updateOrderinfo(Orderinfo orderinfo);
    public int updatepayment(Orderinfo orderinfo);
    public List<Orderinfo> findAll();
    public List<Orderinfo> findByOid(String oid);
    public List<Orderinfo> findByUserId(int uid);
}
