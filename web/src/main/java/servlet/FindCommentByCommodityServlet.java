package servlet;

import dao.CommentDao;
import dao.SqlSessionHelper;
import entity.CommentInfo;
import entity.CommodityInfo;

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
@WebServlet(name = "FindCommentByCommodityServlet",urlPatterns = "/findcommentbycommodity")
public class FindCommentByCommodityServlet extends HttpServlet {
    CommentDao commentDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        commentDao= SqlSessionHelper.getSqlSession().getMapper(CommentDao.class);
        request.setCharacterEncoding("UTF-8");
        String cid=request.getParameter("cid");
        List<CommentInfo> clist=commentDao.findByCommodityid(Integer.valueOf(cid));
        request.getSession().setAttribute("clist",clist);
        request.setAttribute("cid",cid);
        request.getRequestDispatcher("FindByCommodityId").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
