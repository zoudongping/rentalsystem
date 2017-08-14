package servlet;

import dao.ContractInfoDao;
import dao.OrderinfoDao;
import dao.SqlSessionHelper;
import entity.ContractInfo;
import entity.Orderinfo;
import entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by THINK on 2017/8/14.
 */
@WebServlet(name = "CancelOrderServlet",urlPatterns = "/cancelorder")
public class CancelOrderServlet extends HttpServlet {
    OrderinfoDao orderinfoDao;
    ContractInfoDao contractInfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        orderinfoDao= SqlSessionHelper.getSqlSession().getMapper(OrderinfoDao.class);
        contractInfoDao=SqlSessionHelper.getSqlSession().getMapper(ContractInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        ContractInfo c=(ContractInfo)request.getSession().getAttribute("c");
        Orderinfo o=(Orderinfo)request.getSession().getAttribute("o");
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        orderinfoDao.deleteOrderinfo(String.valueOf(o.getOid()));
        contractInfoDao.deleteContract(c.getCid());
        SqlSessionHelper.getSqlSession().commit();
        SqlSessionHelper.closeSession();
        request.getSession().setAttribute("user",userInfo);
        response.sendRedirect("home.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
