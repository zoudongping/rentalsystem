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
import java.util.List;

/**
 * Created by THINK on 2017/8/9.
 */
@WebServlet(name = "GetContractInfoServlet",value="/getcontractinfo")
public class GetContractInfoServlet extends HttpServlet {
    ContractInfoDao contractInfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        contractInfoDao= SqlSessionHelper.getSqlSession().getMapper(ContractInfoDao.class);
        List<ContractInfo> all=contractInfoDao.findAll();
        SqlSessionHelper.closeSession();
        request.setAttribute("all",all);
        request.getRequestDispatcher("contractinfo.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
