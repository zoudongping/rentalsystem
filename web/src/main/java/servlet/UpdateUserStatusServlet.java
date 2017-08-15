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

/**
 * Created by Administrator on 2017/8/15.
 */
@WebServlet(name = "UpdateUserStatusServlet",value = "/toUpdateUserStatus")
public class UpdateUserStatusServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=(String)request.getSession().getAttribute("id");
        String status=request.getParameter("status");
        UserInfoDao dao= SqlSessionHelper.getSqlSession().getMapper(UserInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        UserInfo userInfo=new UserInfo();
        userInfo.setUid(Integer.parseInt(id));
        userInfo.setCreditstatus(status);
        int num=dao.updateUserStatus(userInfo);

        if(num==1){
            response.sendRedirect("toShowUser");
            SqlSessionHelper.getSqlSession().commit();
            SqlSessionHelper.closeSession();
        }else{
            response.getWriter().append("Sorry!SYSTEM ERROR!/(ToT)/~~");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
