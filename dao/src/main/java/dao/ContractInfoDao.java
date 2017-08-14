package dao;

import entity.ContractInfo;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Date;
import java.util.List;

/**
 * Created by THINK on 2017/8/8.
 */
public interface ContractInfoDao {

    public List<ContractInfo> findAll();

    public List<ContractInfo> findByCid(ContractInfo contractInfo);

    public int addContract(ContractInfo contractInfo);

    public int deleteContract(int cid);

    public int updateContract(ContractInfo contractinfo);

    public int insert(ContractInfo contractInfo);
    public ContractInfo findByName(String name);

    public List<ContractInfo> findByUser(String sname);

}
