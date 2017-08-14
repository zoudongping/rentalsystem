package servlet;

import dao.ManagerInfoDao;
import dao.SqlSessionHelper;
import dao.UserInfoDao;
import entity.ManagerInfo;
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
@WebServlet(name = "ManagerLoginServlet", value = "/managerLogin")
public class ManagerLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ManagerInfoDao dao = SqlSessionHelper.getSqlSession().getMapper(ManagerInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String mname = request.getParameter("mname");
        String pwd = request.getParameter("pwd");
        ManagerInfo managerInfo1 = new ManagerInfo();
        managerInfo1.setMname(mname);
        managerInfo1.setPwd(pwd);
        ManagerInfo manager = dao.findManagerNameAndPwd(managerInfo1);

        if (manager != null) {
            out.print("<center><h1>登录成功！</h1>");
            request.getSession().setAttribute("manager", manager);
            response.sendRedirect("index.jsp");
        } else {
            out.print("<center><h1>登录失败！账户或密码错误！</h1><br>" +
                    "<a href='managerlogin.html'>点此返回</a></center>");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
