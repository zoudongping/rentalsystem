package servlet;

import dao.AddressInfoDao;
import dao.SqlSessionHelper;
import entity.AddressInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by THINK on 2017/8/12.
 */
@WebServlet(name = "FindAddressBySidServlet",urlPatterns = "/findbysid")
public class FindAddressBySidServlet extends HttpServlet {
    AddressInfoDao addressInfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        addressInfoDao= SqlSessionHelper.getSqlSession().getMapper(AddressInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        String sid=request.getParameter("id");
        AddressInfo addressInfo=addressInfoDao.findBySid(sid);
        request.getSession().setAttribute("address",addressInfo);
        request.getRequestDispatcher("updateaddress.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
