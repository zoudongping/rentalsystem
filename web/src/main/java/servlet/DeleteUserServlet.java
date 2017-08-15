package servlet;

import dao.SqlSessionHelper;
import dao.UserInfoDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/15.
 */
@WebServlet(name = "DeleteUserServlet",value = "/toDeleteUser")
public class DeleteUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("id");
        UserInfoDao dao= SqlSessionHelper.getSqlSession().getMapper(UserInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        int num=dao.deleteUser(id);
        String oper= "删除用户";
        String operation= "删除了"+id+"用户";
        if(num==1){
            request.getSession().setAttribute("operation", operation);
            request.getSession().setAttribute("oper", oper);
            response.sendRedirect("operationinsert");
            SqlSessionHelper.getSqlSession().commit();
            SqlSessionHelper.closeSession();
//            response.sendRedirect("toShowUser");
        }else{
            response.getWriter().append("Sorry!SYSTEM ERROR!/(ToT)/~~");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
