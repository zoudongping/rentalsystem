import dao.SqlSessionHelper;
import dao.TransInfoDao;
import dao.UserInfoDao;
import entity.TransInfo;
import entity.UserInfo;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 　　  　  　     \\\|///
 * 　　　 　  　 \\ .-.-　//
 * 　　　　　  　 (　.@.@　)
 * +-------oOOo----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月09日 - 11:24
 * |    @description   测试用户模块
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestUser {
    public static void main(String[] args) {

        TransInfoDao transInfoDao= SqlSessionHelper.getSqlSession().getMapper(TransInfoDao.class);
        List<TransInfo> list=transInfoDao.findAll();
        System.out.println(list);
    }
}