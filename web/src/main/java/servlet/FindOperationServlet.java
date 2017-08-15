package servlet;

import dao.OperationDao;
import dao.SqlSessionHelper;
import entity.OperationInfo;

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
@WebServlet(name = "FindOperationServlet",urlPatterns = "/findoperation")
public class FindOperationServlet extends HttpServlet {
    OperationDao operationDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        operationDao= SqlSessionHelper.getSqlSession().getMapper(OperationDao.class);
        request.setCharacterEncoding("UTF-8");
        List<OperationInfo> olist=operationDao.findAll();
        request.getSession().setAttribute("operation",olist);
        request.getRequestDispatcher("showoperation.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);   
    }
}
