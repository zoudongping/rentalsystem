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
@WebServlet(name = "FindByCidServlet" ,value = "/findbycidservlet")
public class FindByCidServlet extends HttpServlet {
    ContractInfoDao contractInfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        contractInfoDao= SqlSessionHelper.getSqlSession().getMapper(ContractInfoDao.class);
        String cid=request.getParameter("cid");
        ContractInfo contractInfo=contractInfoDao.findByCid(Integer.getInteger(cid));
        request.setAttribute("findbycid",contractInfo);
        request.getRequestDispatcher("contractinfo.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
