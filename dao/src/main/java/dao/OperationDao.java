package dao;

import entity.OperationInfo;

import java.util.List;

/**
 * Created by THINK on 2017/8/14.
 */
public interface OperationDao {
    public List<OperationInfo> findAll();
    public int insert(OperationInfo operationInfo);
}
