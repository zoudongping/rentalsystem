package servlet;

import dao.ContractInfoDao;
import dao.SqlSessionHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by THINK on 2017/8/10.
 */
@WebServlet(name = "DeleteContractInfoServlet",value = "/deletecontractinfo.action")
public class DeleteContractInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cid=request.getParameter("pid");
        ContractInfoDao d= SqlSessionHelper.getSqlSession().getMapper(ContractInfoDao.class);
        int bo=d.deleteContract(Integer.valueOf(cid));
        SqlSessionHelper.getSqlSession().commit();
        SqlSessionHelper.closeSession();
        if(bo==1){
            response.sendRedirect("getcontractinfo");
        }else {
            response.getWriter().append("sorry!System error!/(ToT)/~~");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
