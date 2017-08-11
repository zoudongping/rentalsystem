package servlet;

import dao.OrderinfoDao;
import dao.SqlSessionHelper;
import entity.Orderinfo;
import entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nehcey on 2017/8/11.
 */
@WebServlet(name = "FindAllOrderServlet",urlPatterns = "/findallorder")
public class FindAllOrderServlet extends HttpServlet {
    OrderinfoDao orderinfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        orderinfoDao= SqlSessionHelper.getSqlSession().getMapper(OrderinfoDao.class);
        request.setCharacterEncoding("UTF-8");
        List<Orderinfo> olist=new ArrayList<Orderinfo>();
        String oid=request.getParameter("oid");
        if(oid==null){
            olist=orderinfoDao.findAll();
            request.getSession().setAttribute("olist",olist);
            request.getRequestDispatcher("managerorder.jsp").forward(request,response);
        }
        else {
            Orderinfo o=orderinfoDao.findByOid(oid);
            request.getSession().setAttribute("oid",oid);
            request.getRequestDispatcher("managerorder.jsp").forward(request,response);

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
