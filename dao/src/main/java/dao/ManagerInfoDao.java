package dao;

import entity.Generalledger;
import entity.ManagerInfo;
import entity.OperationInfo;

import java.util.List;

/**
 * Created by 响 on 2017/8/10.
 * 管理员接口
 */
public interface ManagerInfoDao {
    public ManagerInfo findByManagerId(int mid);

    public int updatePassword(ManagerInfo managerInfo);

    public ManagerInfo findManagerNameAndPwd(ManagerInfo managerInfo);
}
