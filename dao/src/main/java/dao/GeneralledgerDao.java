package dao;

import entity.Generalledger;

import java.util.List;

/**
 * Created by 响 on 2017/8/10.
 */
public interface GeneralledgerDao {
    public List<Generalledger> findAllGeneralledger();
    public int insertGeneralledger(Generalledger generalledger);
    public int deleteGeneralledger(String gid);
}
