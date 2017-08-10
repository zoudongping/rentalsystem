package servlet;

import dao.OrderinfoDao;
import dao.SqlSessionHelper;
import entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Nehcey on 2017/8/10.
 */
@WebServlet(name = "UpdateOrderServlet",urlPatterns = "/updateorder")
public class UpdateOrderServlet extends HttpServlet {
    OrderinfoDao orderinfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        orderinfoDao= SqlSessionHelper.getSqlSession().getMapper(OrderinfoDao.class);
        request.setCharacterEncoding("UTF-8");
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        String id=request.getParameter("id");
        orderinfoDao.updateOrderinfo(id);
        SqlSessionHelper.getSqlSession().commit();
        SqlSessionHelper.closeSession();
        request.getSession().setAttribute("user",userInfo);
        request.getRequestDispatcher("findorder").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
