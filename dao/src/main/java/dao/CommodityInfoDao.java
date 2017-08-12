package dao;

import entity.CommodityInfo;

import java.util.List;

/**
 * Created by Dave on 2017/8/9.
 */
public interface CommodityInfoDao {
    public int add(CommodityInfo commodityInfo);
    public int delete(int id);
    public int update(CommodityInfo commodityInfo);
    public List<CommodityInfo> findAll();
    public CommodityInfo findById(int id);
    public List<CommodityInfo> findByBrand(String brand);
    public List<CommodityInfo> findByLevel(String level);
    public List<CommodityInfo> findByCondition(String condition);
}
