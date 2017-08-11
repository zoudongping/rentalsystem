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
 * Created by THINK on 2017/8/9.
 */
@WebServlet(name = "FindOrderServlet",value = "/findorder")
public class FindOrderServlet extends HttpServlet {
    OrderinfoDao orderinfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        orderinfoDao= SqlSessionHelper.getSqlSession().getMapper(OrderinfoDao.class);
        request.setCharacterEncoding("UTF-8");
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        List<Orderinfo> olist=new ArrayList<Orderinfo>();
        if(null!=userInfo){
            olist=orderinfoDao.findByUserId(userInfo.getUid());
            request.getSession().setAttribute("olist",olist);
            request.getSession().setAttribute("user",userInfo);
            request.getRequestDispatcher("userorder.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
