package servlet;

import dao.ContractInfoDao;
import dao.SqlSessionHelper;
import entity.ContractInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by THINK on 2017/8/9.
 */
@WebServlet(name = "AddContractInfoServlet",value = "/addcontractinfo")
public class AddContractInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String cid=request.getParameter("cid");
        String beginrentdate=request.getParameter("beginrentdate");
        String overrentdate =request.getParameter("overrentdate");
        String content=request.getParameter("content");
        String secondparty=request.getParameter("secondparty");
        String penalty=request.getParameter("penalty");
        String cstatusid=request.getParameter("cstatusid");
        ContractInfo r=new ContractInfo();
        r.setCid(Integer.getInteger(cid));
        r.setBeginrentdate(beginrentdate);
        r.setOverrentdate(overrentdate);
        r.setContent(content);
        r.setSecondparty(secondparty);
        r.setPenalty(Double.parseDouble(penalty));
        r.setCstatusid(Integer.parseInt(cstatusid));
        ContractInfoDao dao= SqlSessionHelper.getSqlSession().getMapper(ContractInfoDao.class);
        int num=dao.addContract(r);
        SqlSessionHelper.getSqlSession().commit();
        System.out.println("受影响行数"+num);
        SqlSessionHelper.closeSession();
        if(num==1){
           response.sendRedirect("getcontractinfo");
        }else{
            response.getWriter().append("Sorry!").close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
