package dao;

import entity.ImageList;

import java.util.List;

/**
 * Created by Dave on 2017/8/14.
 */
public interface ImageListDao {
    public int add(ImageList imageList);
    public int delete(int id);
    public int update(ImageList imageList);
    public List<ImageList> findAll();
    public ImageList findById(int id);
}
