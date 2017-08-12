package dao;

import entity.CollocationInfo;

import java.util.List;


public interface CollocationInfoDao {
    public int add(CollocationInfo collocationInfo);
    public int delete(int id);
    public int update(CollocationInfo collocationInfo);
    public List<CollocationInfo> findAll();
    public CollocationInfo findById(int id);
}





