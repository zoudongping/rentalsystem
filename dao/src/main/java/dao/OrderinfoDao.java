package dao;

import entity.Orderinfo;

import java.util.List;

/**
 * Created by 李晨曦 on 2017/8/9.
 */
public interface OrderinfoDao {
    public int insertOrderinfo(Orderinfo orderinfo);
    public int deleteOrderinfo(int oid);
    public int updateRoleInfo(Orderinfo orderinfo);
    public List<Orderinfo> findAll();
    public List<Orderinfo> findByOid(int oid);
    public Orderinfo findByUserId(int uid);
}
