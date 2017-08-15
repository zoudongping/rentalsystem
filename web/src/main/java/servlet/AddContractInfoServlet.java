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
        ContractInfoDao dao= SqlSessionHelper.getSqlSession().getMapper(ContractInfoDao.class);
        request.setCharacterEncoding("utf-8");
        String beginrentdate=request.getParameter("beginrentdate");
        String overrentdate =request.getParameter("overrentdate");
        String secondparty=request.getParameter("secondparty");
        String cstatusid=request.getParameter("cstatusid");
        ContractInfo r=new ContractInfo();
        r.setBeginrentdate(beginrentdate);
        r.setOverrentdate(overrentdate);
        r.setSecondparty(secondparty);
        r.setCstatusid(Integer.valueOf(cstatusid));
        int num=dao.addContract(r);
        String oper= "添加合同";
        String operation= "添加了合同";
        SqlSessionHelper.getSqlSession().commit();
        System.out.println("受影响行数"+num);
        SqlSessionHelper.closeSession();
        if(num==1){
            request.getSession().setAttribute("operation", operation);
            request.getSession().setAttribute("oper", oper);
            response.sendRedirect("operationinsert");
//           response.sendRedirect("getcontractinfo");
        }else{
            response.getWriter().append("Sorry!").close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
