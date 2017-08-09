package dao;

import entity.CommentInfo;

import java.util.List;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月09日 - 10:00
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public interface CommentDao {
    public List<CommentInfo> findByLevel(String lname);
    public List<CommentInfo> findByCommodityname(String cname);
    public List<CommentInfo> findByCommodityid();
    public List<CommentInfo> findAll();
    public int delete(String id);
    public int insert(CommentInfo commentInfo);
    public List<CommentInfo> findByUid(int uid);
}