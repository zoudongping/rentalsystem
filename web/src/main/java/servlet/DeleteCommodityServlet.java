package servlet;

import dao.CollocationInfoDao;
import dao.CommodityInfoDao;
import dao.ImageListDao;
import dao.SqlSessionHelper;
import entity.CommodityInfo;
import entity.ImageList;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Dave on 2017/8/9.
 */
@WebServlet(name = "DeleteCommodityServlet",value = "/DeleteCommodityServlet")
public class DeleteCommodityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        SqlSession sqlSession = SqlSessionHelper.getSqlSession();
        CommodityInfoDao commodityInfoDao = sqlSession.getMapper(CommodityInfoDao.class);
        int num = commodityInfoDao.delete(Integer.valueOf(request.getParameter("cid")));
        String oper = "删除商品";
        String operation = "删除了" + num + "商品";
        CollocationInfoDao collocationInfoDao = sqlSession.getMapper(CollocationInfoDao.class);
        ImageListDao imageListDao = sqlSession.getMapper(ImageListDao.class);
        int num1 = commodityInfoDao.delete(Integer.valueOf(request.getParameter("cid")));
        int num2 = collocationInfoDao.delete(Integer.valueOf(request.getParameter("collocationId")));
        int num3 = imageListDao.delete(Integer.valueOf(request.getParameter("imageId")));
        sqlSession.commit();
        if (num != 0 && num2 != 0 && num3 != 0) {
//            request.getRequestDispatcher("FindCommodityServlet").forward(request,response);
            request.getRequestDispatcher("operationinsert").forward(request, response);
        }else {
            request.getRequestDispatcher("Error.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
