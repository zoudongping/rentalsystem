package servlet;

import dao.OrderinfoDao;
import dao.SqlSessionHelper;
import entity.CommodityInfo;
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
 * Created by 李晨曦 on 2017/8/10.
 */
@WebServlet(name = "AddOrderServlet",urlPatterns = "/addorderservlet")
public class AddOrderServlet extends HttpServlet {
    OrderinfoDao orderinfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        orderinfoDao= SqlSessionHelper.getSqlSession().getMapper(OrderinfoDao.class);
        request.setCharacterEncoding("UTF-8");
        String rentalamount=request.getParameter("number");
        String rentaltype=request.getParameter("price");
        String timeamount=request.getParameter("time");
        ContractInfo c=(ContractInfo)request.getSession().getAttribute("r1");
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        CommodityInfo commodityInfo=(CommodityInfo)request.getSession().getAttribute("commodity");
        Orderinfo o=new Orderinfo();
        o.setUid(userInfo.getUid());
        o.setRentalamount(Integer.valueOf(rentalamount));
        o.setContractid(Integer.valueOf(c.getCid()));
        o.setCommodityid(commodityInfo.getCid());
        o.setDeposit(commodityInfo.getDeposit()*Double.valueOf(rentalamount));
        if(rentaltype.equals("dayprice")) {
            o.setRentaltype(1);
            o.setOrdertotal(Double.valueOf(rentalamount)*Double.valueOf(timeamount)*commodityInfo.getDayprice()+o.getDeposit());
        }
        if(rentaltype.equals("monthprice")) {
            o.setRentaltype(2);
            o.setOrdertotal(Double.valueOf(rentalamount)*Double.valueOf(timeamount)*commodityInfo.getMonthprice()+o.getDeposit());
        }
        if(rentaltype.equals("yearprice")) {
            o.setRentaltype(3);
            o.setOrdertotal(Double.valueOf(rentalamount)*Double.valueOf(timeamount)*commodityInfo.getYearprice()+o.getDeposit());
        }

        orderinfoDao.insertOrderinfo(o);
        SqlSessionHelper.getSqlSession().commit();
        Orderinfo o1=orderinfoDao.findByPayment(userInfo.getUid());
        SqlSessionHelper.closeSession();
        request.getSession().setAttribute("user", userInfo);
        request.getSession().setAttribute("o",o1);
        request.getSession().setAttribute("c",c);
        request.getRequestDispatcher("payment.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
