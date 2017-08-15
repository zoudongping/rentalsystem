package servlet;

import dao.CommodityInfoDao;
import dao.SqlSessionHelper;
import entity.CommodityInfo;
import entity.UserInfo;
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
 * Created by Dave on 2017/8/14.
 */
@WebServlet(name = "FindByCommodityId",value = "/FindByCommodityId")
public class FindByCommodityId extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        SqlSession sqlSession= SqlSessionHelper.getSqlSession();
        CommodityInfoDao commodityInfoDao=sqlSession.getMapper(CommodityInfoDao.class);
        String cid=request.getParameter("cid");
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        if(cid!=null){
            CommodityInfo commodityInfo=commodityInfoDao.findById(Integer.valueOf(cid));
            request.getSession().setAttribute("c",commodityInfo);
            request.getRequestDispatcher("detailInfo.jsp").forward(request,response);

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
