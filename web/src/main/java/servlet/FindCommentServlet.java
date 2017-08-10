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
import java.util.ArrayList;
import java.util.List;

/**
 * Created by THINK on 2017/8/9.
 */
@WebServlet(name = "FindCommentServlet",urlPatterns = "/findcomment")
public class FindCommentServlet extends HttpServlet {
    CommentDao commentDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        commentDao= SqlSessionHelper.getSqlSession().getMapper(CommentDao.class);
        request.setCharacterEncoding("UTF-8");
        String by=request.getParameter("by");
        String keyword="%"+request.getParameter("keyword")+"%";

        List<CommentInfo> clist=new ArrayList<CommentInfo>();
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        if(null!=userInfo){
            clist=commentDao.findByUid(userInfo.getUid());
            request.getSession().setAttribute("clist",clist);
            request.getSession().setAttribute("user",userInfo);
            request.getRequestDispatcher("usercomment.jsp").forward(request,response);
        }
        if(by.equals("all")){
            clist=commentDao.findAll();
            request.getSession().setAttribute("clist",clist);
            request.getRequestDispatcher("showcomment.jsp").forward(request,response);
        }
        if(by.equals("commodity")){
            clist=commentDao.findByCommodityname(keyword);
            request.getSession().setAttribute("clist",clist);
            request.getRequestDispatcher("showcomment.jsp").forward(request,response);
        }
        if(by.equals("level")){
            clist=commentDao.findByLevel(keyword);
            request.getSession().setAttribute("clist",clist);
            request.getRequestDispatcher("showcomment.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
