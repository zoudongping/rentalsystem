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
 * Created by THINK on 2017/8/12.
 */
@WebServlet(name = "FindByUserServlet" ,value = "/finbyuserservlet")
public class FindByUserServlet extends HttpServlet {
    ContractInfoDao contractInfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        contractInfoDao= SqlSessionHelper.getSqlSession().getMapper(ContractInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        String keyword=request.getParameter("keyword");
        ContractInfo contractInfo=new ContractInfo();
        contractInfo.setSecondparty(keyword);
        List<ContractInfo> list=contractInfoDao.findByCid(contractInfo);
        for(ContractInfo a:list) {
            System.out.println(a);
        }
        SqlSessionHelper.closeSession();
        request.setAttribute("all",list);
        request.getRequestDispatcher("contractinfo.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
