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
 * Created by THINK on 2017/8/10.
 */
@WebServlet(name = "FindByStyServlet",value = "findbystyservlet")
public class FindByStyServlet extends HttpServlet {
    ContractInfoDao contractInfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       contractInfoDao= SqlSessionHelper.getSqlSession().getMapper(ContractInfoDao.class);
        String secondparty=request.getParameter("secondparty");
        ContractInfo contractInfo=new ContractInfo();
        List<ContractInfo> list=contractInfoDao.findBySecondParty(secondparty);
        request.setAttribute("findbysty",list);
        request.getRequestDispatcher("contractinfo.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
