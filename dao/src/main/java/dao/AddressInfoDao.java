package dao;

import entity.AddressInfo;

import java.util.List;

/**
 * 　　  　  　     \\\|///
 * 　　　 　  　 \\ .-.-　//
 * 　　　　　  　 (　.@.@　)
 * +-------oOOo----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月11日 - 10:09
 * |    @description   收货地址接口类
 * +---------------------------------Oooo---------------------------------------+
 */
public interface AddressInfoDao {
    public List<AddressInfo> findAllByUid(int uid);
    public AddressInfo findBySid(String sid);
    public int updateAddress(AddressInfo addressInfo);
    public int deleteAddress(String sid);
    public int insert(AddressInfo addressInfo);
}