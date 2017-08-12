package servlet;

import dao.OrderinfoDao;
import dao.SqlSessionHelper;
import entity.CommodityInfo;
import entity.Orderinfo;
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
@WebServlet(name = "AddOrderServlet",urlPatterns = "/addorderservlet")
public class AddOrderServlet extends HttpServlet {
    OrderinfoDao orderinfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        orderinfoDao= SqlSessionHelper.getSqlSession().getMapper(OrderinfoDao.class);
        request.setCharacterEncoding("UTF-8");
        String id=request.getParameter("id");
        String rentalamount=request.getParameter("rentalamount");
        String rentaltype=request.getParameter("rentaltype");
        String timeamount=request.getParameter("timeamount");
        String contractid=request.getParameter("contractid");
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        CommodityInfo commodityInfo=(CommodityInfo)request.getSession().getAttribute("commodity");
        Orderinfo o=new Orderinfo();
        o.setUid(userInfo.getUid());
        o.setRentalamount(Integer.valueOf(rentalamount));
        o.setContractid(Integer.valueOf(contractid));
        o.setCommodityid(commodityInfo.getCid());
        o.setDeposit(commodityInfo.getDeposit()*Double.valueOf(rentalamount));
        if(rentaltype.equals("日租")) {
            o.setRentaltype(1);
            o.setOrdertotal(Double.valueOf(rentalamount)*Double.valueOf(timeamount)*commodityInfo.getDayprice());
        }
        if(rentaltype.equals("月租")) {
            o.setRentaltype(2);
            o.setOrdertotal(Double.valueOf(rentalamount)*Double.valueOf(timeamount)*commodityInfo.getMonthprice());
        }
        if(rentaltype.equals("年租")) {
            o.setRentaltype(3);
            o.setOrdertotal(Double.valueOf(rentalamount)*Double.valueOf(timeamount)*commodityInfo.getYearprice());
        }

        orderinfoDao.insertOrderinfo(o);
        SqlSessionHelper.getSqlSession().commit();
        SqlSessionHelper.closeSession();
        request.getSession().setAttribute("user",userInfo);
        request.getRequestDispatcher("findcomment").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
