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
 * Created by Administrator on 2017/8/14.
 */
@WebServlet(name = "ShowBillServlet",value = "/toShowBill")
public class ShowBillServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OrderinfoDao dao= SqlSessionHelper.getSqlSession().getMapper(OrderinfoDao.class);
        request.setCharacterEncoding("UTF-8");
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        List<Orderinfo> olist=new ArrayList<Orderinfo>();
        if(null!=userInfo){
            olist=dao.findByUserId(userInfo.getUid());
            double total=dao.findTotalBillByUid(userInfo.getUid());
            request.getSession().setAttribute("olist",olist);
            request.getSession().setAttribute("total",total);
            request.getSession().setAttribute("user",userInfo);
            SqlSessionHelper.closeSession();
            request.getRequestDispatcher("showbill.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
