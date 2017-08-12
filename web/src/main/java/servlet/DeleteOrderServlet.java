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
 * Created by 李晨曦 on 2017/8/10.
 */
@WebServlet(name = "DeleteOrderServlet",urlPatterns = "/deleteOrder")
public class DeleteOrderServlet extends HttpServlet {
    OrderinfoDao orderinfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        orderinfoDao= SqlSessionHelper.getSqlSession().getMapper(OrderinfoDao.class);
        request.setCharacterEncoding("UTF-8");
        String id=request.getParameter("id");
        orderinfoDao.deleteOrderinfo(id);
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        SqlSessionHelper.getSqlSession().commit();
        SqlSessionHelper.closeSession();
        request.getSession().setAttribute("user",userInfo);
        response.sendRedirect("findcomment");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
