package servlet;

import dao.SqlSessionHelper;
import dao.TransInfoDao;
import entity.TransInfo;

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
@WebServlet(name = "FindAllTransInfoServlet",urlPatterns = "/findalltransinfo")
public class FindAllTransInfoServlet extends HttpServlet {
    TransInfoDao transInfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        transInfoDao= SqlSessionHelper.getSqlSession().getMapper(TransInfoDao.class);
        List<TransInfo> tlist=new ArrayList<TransInfo>();
        tlist=transInfoDao.findAll();
        request.getSession().setAttribute("tlist",tlist);
        request.getRequestDispatcher("showtransinfo.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
