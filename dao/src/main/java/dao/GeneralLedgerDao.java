package dao;

import entity.Generalledger;

import java.util.List;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月11日 - 9:15
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public interface GeneralLedgerDao {
    public List<Generalledger> findAll();
    public int insert(Generalledger generalledger);
    public Generalledger findByGid();
}