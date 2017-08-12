package servlet;

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

/**
 * Created by Dave on 2017/8/11.
 */
@WebServlet(name = "FindCommodityBeforeUpdate",value = "/FindCommodityBeforeUpdate")
public class FindCommodityBeforeUpdate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        SqlSession sqlSession= SqlSessionHelper.getSqlSession();
        CommodityInfoDao commodityInfoDao=sqlSession.getMapper(CommodityInfoDao.class);
        CommodityInfo commodityInfo=new CommodityInfo();
        String cid=request.getParameter("cid");
        if(cid!=null){
            commodityInfo=commodityInfoDao.findById(Integer.valueOf(cid));
            request.setAttribute("c",commodityInfo);
            request.getRequestDispatcher("updatecommodity.jsp").forward(request,response);
        }else {
            request.getRequestDispatcher("Error.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
