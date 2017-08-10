package servlet;

import dao.CommentDao;
import dao.SqlSessionHelper;
import entity.CommentInfo;
import entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by THINK on 2017/8/9.
 */
@WebServlet(name = "AddCommentServlet",urlPatterns = "/addcommentservlet")
public class AddCommentServlet extends HttpServlet {
    CommentDao commentDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        commentDao= SqlSessionHelper.getSqlSession().getMapper(CommentDao.class);
        request.setCharacterEncoding("UTF-8");
        String id=request.getParameter("id");
        String content=request.getParameter("content");
        String level=request.getParameter("level");
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        CommentInfo c=new CommentInfo();
        //c.setCommodityid(Integer.valueOf(id));
        c.setUid(userInfo.getUid());
        c.setContent(content);
        if(level.equals("优")) {
            c.setLevel(1);
        }
        if(level.equals("良")) {
            c.setLevel(2);
        }
        if(level.equals("差")) {
            c.setLevel(3);
        }
        commentDao.insert(c);
        SqlSessionHelper.getSqlSession().commit();
        SqlSessionHelper.closeSession();
        request.getSession().setAttribute("user",userInfo);
        response.sendRedirect("findorder");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
