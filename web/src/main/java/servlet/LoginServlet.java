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
 * Created by Administrator on 2017/8/9.
 */
@WebServlet(name = "LoginServlet",value="/toLogin")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserInfoDao dao= SqlSessionHelper.getSqlSession().getMapper(UserInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String account = request.getParameter("username");
        String pwd = request.getParameter("password");
        UserInfo userInfo1=new UserInfo();
        userInfo1.setUname(account);
        userInfo1.setPwd(pwd);
        UserInfo user=dao.findUserNameAndPwd(userInfo1);
        UserInfo userInfo2=new UserInfo();
        userInfo2.setTel(account);
        userInfo2.setPwd(pwd);
        UserInfo user1=dao.findUserTelAndPwd(userInfo2);
        if(user !=null || user1 !=null){
            out.print("<center><h1>登录成功！</h1>");
            if(user !=null){
                request.setAttribute("username", user);
                request.getSession().setAttribute("username", user);
            }else{
                request.setAttribute("username", user1);
                request.getSession().setAttribute("username", user1);
            }
        }else{
            out.print("<center><h1>登录失败！账户或密码错误！</h1><br>" +
                    "<a href='login.html'>点此返回</a></center>");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
