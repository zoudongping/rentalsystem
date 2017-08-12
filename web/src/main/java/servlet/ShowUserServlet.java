package servlet;

import dao.SqlSessionHelper;
import dao.UserInfoDao;
import entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/8/12.
 */
@WebServlet(name = "ShowUserServlet",value ="/toShowUser")
public class ShowUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserInfoDao dao=SqlSessionHelper.getSqlSession().getMapper(UserInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        List<UserInfo> userInfoList=dao.findAllUser();
        request.setAttribute("userInfoList",userInfoList);
        request.getRequestDispatcher("showuser.jsp").forward(request,response);
        SqlSessionHelper.closeSession();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
