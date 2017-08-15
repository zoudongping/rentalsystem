package servlet;

import dao.SqlSessionHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/15.
 */
@WebServlet(name = "FindUserStatusServlet",value = "/toFindUserStatus")
public class FindUserStatusServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("id");
        request.getSession().setAttribute("id",id);
        request.getRequestDispatcher("updateuserstatus.jsp").forward(request,response);
        SqlSessionHelper.closeSession();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
