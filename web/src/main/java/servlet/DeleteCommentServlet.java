package servlet;

import dao.CommentDao;
import dao.SqlSessionHelper;
import entity.CommentInfo;
import entity.ManagerInfo;
import entity.UserInfo;

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
@WebServlet(name = "DeleteCommentServlet",urlPatterns = "/deleteComment")
public class DeleteCommentServlet extends HttpServlet {
    CommentDao commentDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        commentDao= SqlSessionHelper.getSqlSession().getMapper(CommentDao.class);
        request.setCharacterEncoding("UTF-8");
        String id=request.getParameter("id");
        commentDao.delete(id);
        String oper= "删除评论";
        String operation= "删除了"+id+"评论";
        ManagerInfo managerInfo=(ManagerInfo)request.getSession().getAttribute("manager");
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        SqlSessionHelper.getSqlSession().commit();
        SqlSessionHelper.closeSession();
        if(managerInfo!=null) {
            request.getSession().setAttribute("operation", operation);
            request.getSession().setAttribute("oper", oper);
            request.getRequestDispatcher("operationinsert").forward(request, response);
        }
        if(userInfo!=null) {
            request.getSession().setAttribute("user", userInfo);
            response.sendRedirect("findusercomment");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
