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
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/8/12.
 */
@WebServlet(name = "UpdateOwnUserServlet",value = "/toUpdateOwnUser")
public class UpdateOwnUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserInfoDao dao= SqlSessionHelper.getSqlSession().getMapper(UserInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        String nicheng=request.getParameter("nicheng");
        String email=request.getParameter("email");
        String phone=request.getParameter("phone");
        String sex=request.getParameter("sex");
        UserInfo userInfo1=new UserInfo();
        if(nicheng.equals("")==false) {
            userInfo.setNickname(nicheng);
        }
        if(email.equals("")==false) {
            userInfo.setEmail(email);
        }

        if(phone.equals("")==false) {
            userInfo.setTel(phone);
         }
        if(sex.equals("")==false) {
            userInfo.setSex(sex);
        }
        int num=dao.updateUser(userInfo);
        if(num==1){
            SqlSessionHelper.getSqlSession().commit();
            SqlSessionHelper.closeSession();
            out.print("<center><h1>个人资料修改成功！</h1><br>" +
                    "<a href='usercentral.jsp'>点此返回个人中心</a></center>");
        }else{
            out.print("<center><h1>Sorry,发生系统异常!</h1><br>" +
                    "<a href='usercentral.jsp'>点此返回个人中心</a></center>");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
