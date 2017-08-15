package dao;

import entity.UserInfo;

import java.util.List;

/**
 * 　　  　  　     \\\|///
 * 　　　 　  　 \\ .-.-　//
 * 　　　　　  　 (　.@.@　)
 * +-------oOOo----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月09日 - 10:45
 * |    @description   用户接口
 * +---------------------------------Oooo---------------------------------------+
 */
public interface UserInfoDao {
    public UserInfo findUserByUserId(int userId);

    public List<UserInfo> findAllUser();

    public UserInfo findUserNameAndPwd(UserInfo userinfo);

    public UserInfo findUserTelAndPwd(UserInfo userinfo);

    public int addUser(UserInfo userinfo);

    public int updateUser(UserInfo userinfo);

    public int updatePwd(UserInfo userinfo);

    public int deleteUser(String uid);

    public int  updateUserStatus(UserInfo userinfo);
}