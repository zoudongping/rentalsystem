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
 * Created by THINK on 2017/8/10.
 */
@WebServlet(name = "UpdateContractInfoServlet",value = "/updatecontractinfo")
public class UpdateContractInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ContractInfoDao dao = SqlSessionHelper.getSqlSession().getMapper(ContractInfoDao.class);
        request.setCharacterEncoding("utf-8");
        String cid = request.getParameter("cid");
        String cstatusid=request.getParameter("cstatusid");
        ContractInfo r = new ContractInfo();
        r.setCid(Integer.valueOf(cid));
       r.setCstatusid(Integer.valueOf(cstatusid));
        int num = dao.updateContract(r);
        SqlSessionHelper.getSqlSession().commit();
       // SqlSessionHelper.getSqlSession().commit();
        System.out.println("受影响行数" + num);
        SqlSessionHelper.closeSession();
        if (num == 1) {
            response.sendRedirect("getcontractinfo");
        } else {
            response.getWriter().append("Sorry !0.0!").close();
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
