package servlet;

import dao.ContractInfoDao;
import dao.SqlSessionHelper;
import entity.CommodityInfo;
import entity.ContractInfo;
import entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/12.
 */
@WebServlet(name = "AddContractServlet",urlPatterns = "/addcontract")
public class AddContractServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ContractInfoDao dao= SqlSessionHelper.getSqlSession().getMapper(ContractInfoDao.class);
        request.setCharacterEncoding("utf-8");
        String price=request.getParameter("price");
        String time=request.getParameter("time");
        String number=request.getParameter("number");
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        CommodityInfo commodityInfo=(CommodityInfo)request.getSession().getAttribute("c");
        ContractInfo r=new ContractInfo();
        r.setOverrentdate(time);
        r.setContent(userInfo.getUname() + "借深圳爱租网络平台" + number + "台" + commodityInfo.getCname());
        r.setSecondparty(userInfo.getUname());
        r.setPenalty(commodityInfo.getSinglecost());
        int num=dao.insert(r);
        SqlSessionHelper.getSqlSession().commit();
        ContractInfo r1=dao.findByName(userInfo.getUname());
        System.out.println("受影响行数" + num);
        SqlSessionHelper.closeSession();
        if(num==1){
            request.setAttribute("price",price);
            request.setAttribute("time",time);
            request.setAttribute("number",number);
            request.setAttribute("user",userInfo);
            request.getSession().setAttribute("r1", r1);
            request.getSession().setAttribute("commodity",commodityInfo);
            request.getRequestDispatcher("addorderservlet").forward(request,response);
        }else{
            response.getWriter().append("Sorry!").close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
