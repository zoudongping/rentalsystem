package servlet;

import dao.CollocationInfoDao;
import dao.CommodityInfoDao;
import dao.SqlSessionHelper;
import entity.CommodityInfo;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Dave on 2017/8/15.
 */
@WebServlet(name = "SearchByKeywordServlet",value = "/SearchByKeywordServlet")
public class SearchByKeywordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        SqlSession sqlSession= SqlSessionHelper.getSqlSession();
        CommodityInfoDao commodityInfoDao=sqlSession.getMapper(CommodityInfoDao.class);
        String keyword=request.getParameter("keyword");
        List<CommodityInfo> list=commodityInfoDao.searchByKeyword("%"+keyword+"%");
        if(list!=null){
            request.getSession().setAttribute("list1",list);
            request.getRequestDispatcher("home.jsp").forward(request,response);
        }else {
            request.getRequestDispatcher("Error.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
