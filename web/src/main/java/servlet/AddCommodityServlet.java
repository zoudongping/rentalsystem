package servlet;

import dao.CollocationInfoDao;
import dao.CommodityInfoDao;
import dao.SqlSessionHelper;
import entity.CollocationInfo;
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
 * Created by Dave on 2017/8/9.
 */
@WebServlet(name = "AddCommodityServlet",value ="/AddCommodityServlet")
public class AddCommodityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        SqlSession sqlSession=SqlSessionHelper.getSqlSession();
        CommodityInfoDao commodityInfoDao=sqlSession.getMapper(CommodityInfoDao.class);
        CollocationInfoDao collocationInfoDao=sqlSession.getMapper(CollocationInfoDao.class);
        CommodityInfo commodityInfo=new CommodityInfo();
        CollocationInfo collocationInfo=new CollocationInfo();
        commodityInfo.setCname(request.getParameter("cname"));
        commodityInfo.setDayprice(Double.valueOf(request.getParameter("dayprice")));
        commodityInfo.setMonthprice(Double.valueOf(request.getParameter("monthprice")));
        commodityInfo.setYearprice(Double.valueOf(request.getParameter("yearprice")));
        commodityInfo.setDeposit(Double.valueOf(request.getParameter("deposit")));
        commodityInfo.setCollocation(Integer.valueOf(request.getParameter("collocation")));
        commodityInfo.setStock(Integer.valueOf(request.getParameter("stock")));
        commodityInfo.setBrand(request.getParameter("brand"));
        commodityInfo.setSinglecost(Double.valueOf(request.getParameter("singlecost")));
        commodityInfo.setImage(request.getParameter("image"));
        commodityInfoDao.add(commodityInfo);

        collocationInfo.setLevel(request.getParameter("level"));
        collocationInfo.setScreensize(Double.valueOf(request.getParameter("screensize")));
        collocationInfo.setColor(request.getParameter("color"));
        collocationInfo.setPixel(request.getParameter("pixel"));
        collocationInfo.setCondition(request.getParameter("condition"));
        collocationInfo.setSensor(request.getParameter("sensor"));
        collocationInfo.setBattery(request.getParameter("battery"));
        collocationInfoDao.add(collocationInfo);
        sqlSession.commit();
        if(commodityInfo!=null&&collocationInfo!=null){
            request.getRequestDispatcher("FindCommodityServlet").forward(request,response);
        }else{
            request.getRequestDispatcher("Error.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
