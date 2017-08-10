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

    public List<ContractInfo> findByBeginRentDate(String beginrentdate);

    public List<ContractInfo> findByOverRentDate(String overrentdate);

    public List<ContractInfo> findBySecondParty(String secondparty);

    public ContractInfo findByCid(int cid);

    public int addContract(ContractInfo contractInfo);

    public int deleteContract(int cid);

    public int updateContract(ContractInfo contractinfo);

}
