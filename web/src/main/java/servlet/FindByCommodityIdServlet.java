package servlet;

import dao.CommodityInfoDao;
import dao.SqlSessionHelper;
import entity.CommodityInfo;
import entity.UserInfo;
import org.apache.ibatis.jdbc.Null;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dave on 2017/8/9.
 */
@WebServlet(name = "FindByCommodityIdServlet",value = "/FindByCommodityIdServlet")
public class FindByCommodityIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        SqlSession sqlSession= SqlSessionHelper.getSqlSession();
        CommodityInfoDao commodityInfoDao=sqlSession.getMapper(CommodityInfoDao.class);
        int cid=Integer.valueOf(request.getParameter("searchId"));
        List<CommodityInfo> list = commodityInfoDao.searchById(cid);
        if(list!=null){
            request.getSession().setAttribute("list",list);
            request.getRequestDispatcher("commodityList.jsp").forward(request,response);
        }else {
            request.getRequestDispatcher("Error.jsp").forward(request,response);
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
