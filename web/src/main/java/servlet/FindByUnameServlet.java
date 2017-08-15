package servlet;

import dao.ContractInfoDao;
import dao.SqlSessionHelper;
import entity.ContractInfo;
import entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by THINK on 2017/8/14.
 */
@WebServlet(name = "FindByUnameServlet",value = "/findbyunameservlet")
public class FindByUnameServlet extends HttpServlet {

    ContractInfoDao contractInfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         contractInfoDao= SqlSessionHelper.getSqlSession().getMapper(ContractInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        UserInfo userInfo=(UserInfo) request.getSession().getAttribute("user");
        List<ContractInfo>  clist=contractInfoDao.findByUser(userInfo.getUname());
        request.getSession().setAttribute("clist",clist);
        request.getRequestDispatcher("findcontractinfo.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
