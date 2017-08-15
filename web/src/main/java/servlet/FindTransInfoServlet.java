package servlet;

import dao.SqlSessionHelper;
import dao.TransInfoDao;
import entity.TransInfo;
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
 * Created by THINK on 2017/8/10.
 */
@WebServlet(name = "FindTransInfoServlet",urlPatterns = "/findtransinfo")
public class FindTransInfoServlet extends HttpServlet {
    TransInfoDao transInfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        transInfoDao= SqlSessionHelper.getSqlSession().getMapper(TransInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        String by=request.getParameter("by");
        String keyword=request.getParameter("keyword");
        List<TransInfo> tlist=new ArrayList<TransInfo>();
        if(by.equals("uname")){
            tlist=transInfoDao.findByUname(keyword);
            request.getSession().setAttribute("tlist",tlist);
            request.getRequestDispatcher("showtransinfo.jsp").forward(request,response);
        }
        if(by.equals("date")){
            tlist=transInfoDao.findByDate(keyword);
            request.getSession().setAttribute("tlist",tlist);
            request.getRequestDispatcher("showtransinfo.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
