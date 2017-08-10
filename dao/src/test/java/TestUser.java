import dao.SqlSessionHelper;
import dao.UserInfoDao;
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
        SqlSession session= SqlSessionHelper.getSqlSession();
        UserInfoDao dao=session.getMapper(UserInfoDao.class);


        //查询所有用户
        List<UserInfo> list=dao.findAllUser();
        for(UserInfo obj:list){
            System.out.println(obj);
        }
        UserInfo userInfo=new UserInfo();

        userInfo=dao.findUserByUserId(1);
        System.out.println(userInfo);
        userInfo.setUname("张三");
        userInfo.setPwd("123");
        userInfo=dao.findUserNameAndPwd(userInfo);
        System.out.println(userInfo);
        userInfo.setUname("8888888");
        userInfo.setPwd("123");
        userInfo=dao.findUserTelAndPwd(userInfo);
        System.out.println(userInfo);
    }
}