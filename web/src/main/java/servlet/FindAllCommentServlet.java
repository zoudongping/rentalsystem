package servlet;

import dao.CommentDao;
import dao.SqlSessionHelper;
import entity.CommentInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by THINK on 2017/8/15.
 */
@WebServlet(name = "FindAllCommentServlet",urlPatterns = "/findallcomment")
public class FindAllCommentServlet extends HttpServlet {
    CommentDao commentDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        commentDao= SqlSessionHelper.getSqlSession().getMapper(CommentDao.class);
        request.setCharacterEncoding("UTF-8");
        List<CommentInfo> clist=new ArrayList<CommentInfo>();
        clist=commentDao.findAll();
        request.getSession().setAttribute("clist",clist);
        request.getRequestDispatcher("showcomment.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
