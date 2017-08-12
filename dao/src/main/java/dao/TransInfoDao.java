package dao;

import entity.TransInfo;

import java.util.List;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月10日 - 10:43
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public interface TransInfoDao {
    public int delete(String id);
    public int insert(TransInfo transInfo);
    public List<TransInfo> findByDate(String date);
    public List<TransInfo> findAll();
    public List<TransInfo> findByUname(String uname);
    public List findRemark(String date);
    public List findTransMoney(String date);
}