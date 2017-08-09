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
@WebServlet(name = "RegisterServlet",value ="/toRegister" )
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserInfoDao dao=SqlSessionHelper.getSqlSession().getMapper(UserInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String account = request.getParameter("uName");
        String nickName = request.getParameter("nickName");
        String sex= request.getParameter("sex");
        String uTel= request.getParameter("uTel");
        String uEmail= request.getParameter("uEmail");
        String pwd= request.getParameter("password");
        String rePwd= request.getParameter("rePassword");
        UserInfo userInfo=new UserInfo();
        userInfo.setUname(account);
        userInfo.setNickname(nickName);
        userInfo.setSex(sex);
        userInfo.setTel(uTel);
        userInfo.setEmail(uEmail);
        userInfo.setPwd(pwd);
        if(pwd.equals(rePwd)){
            int num=dao.addUser(userInfo);
            SqlSessionHelper.getSqlSession().commit();
            SqlSessionHelper.closeSession();
            if(num==1){
                out.print("<center><h1>注册成功！</h1><br>" +
                        "<a href='login.html'>点此登录</a></center>");
            }else{
                out.print("<center><h1>注册失败！</h1><br>" +
                        "<a href='register.html'>点此返回</a></center>");
            }
        }else{
            out.print("<center><h1>密码与重复密码不一致！</h1><br>" +
                    "<a href='register.html'>点此返回</a></center>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
