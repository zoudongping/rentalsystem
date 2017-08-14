package servlet;

import dao.ContractInfoDao;
import dao.OrderinfoDao;
import dao.SqlSessionHelper;
import dao.TransInfoDao;
import entity.ContractInfo;
import entity.Orderinfo;
import entity.TransInfo;
import entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by THINK on 2017/8/14.
 */
@WebServlet(name = "AfterPayServlet",urlPatterns = "/afterpay")
public class AfterPayServlet extends HttpServlet {
    OrderinfoDao orderinfoDao;
    ContractInfoDao contractInfoDao;
    TransInfoDao transInfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        orderinfoDao= SqlSessionHelper.getSqlSession().getMapper(OrderinfoDao.class);
        contractInfoDao=SqlSessionHelper.getSqlSession().getMapper(ContractInfoDao.class);
        transInfoDao=SqlSessionHelper.getSqlSession().getMapper(TransInfoDao.class);
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");
        ContractInfo c=(ContractInfo)request.getSession().getAttribute("c");
        Orderinfo o=(Orderinfo)request.getSession().getAttribute("o");
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        String payment=request.getParameter("payment");
        c.setCstatusid(1);
        int n1=contractInfoDao.updateContract(c);
        if(payment.equals("2")) {
            o.setPayment(2);
        }
        if(payment.equals("3")) {
            o.setPayment(3);
        }
        if(payment.equals("1")) {
            o.setPayment(1);
        }
        o.setContractid(c.getCid());
        int n2=orderinfoDao.updatepayment(o);
        TransInfo t1=new TransInfo();
        TransInfo t2=new TransInfo();
        t1.setTranstype(1);
        t1.setTransmoney(o.getDeposit());
        t1.setRemark("收取"+userInfo.getUname()+"押金");
        t1.setUid(userInfo.getUid());
        t2.setTranstype(4);
        t2.setTransmoney(o.getOrdertotal()-o.getDeposit());
        t2.setRemark("收取"+userInfo.getUname()+"租金");
        t2.setUid(userInfo.getUid());
        int n3=transInfoDao.insert(t1);
        int n4=transInfoDao.insert(t2);
        SqlSessionHelper.getSqlSession().commit();
        SqlSessionHelper.closeSession();
        if(n1==1&&n2==1&&n3==1&&n4==1){
            out.println("<center><h1>租赁成功！请等待收货！</h1><br>"+ "<a href='home.jsp'>返回首页</a></center>");
        }
        else {
            out.println("<center><h1>租赁失败！系统错误！</h1><br>"+"<a href='home.jsp'>返回首页</a></center>");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
