package servlet;

import dao.OperationDao;
import dao.SqlSessionHelper;
import entity.ManagerInfo;
import entity.OperationInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by THINK on 2017/8/15.
 */
@WebServlet(name = "OperationInsertServlet",urlPatterns = "/operationinsert")
public class OperationInsertServlet extends HttpServlet {
    OperationDao operationDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        operationDao= SqlSessionHelper.getSqlSession().getMapper(OperationDao.class);
        request.setCharacterEncoding("UTF-8");
        String oper=(String)request.getSession().getAttribute("oper");
        String operation=(String)request.getSession().getAttribute("operation");
        OperationInfo operationInfo=new OperationInfo();
        ManagerInfo m=(ManagerInfo)request.getSession().getAttribute("manager");
        if(oper.equals("删除订单")){
            operationInfo.setContent(operation);
            operationInfo.setManagerid(m.getMid());
            operationDao.insert(operationInfo);
            SqlSessionHelper.getSqlSession().commit();
            SqlSessionHelper.closeSession();
            request.setAttribute("manager",m);
            request.getRequestDispatcher("findallorder").forward(request,response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
