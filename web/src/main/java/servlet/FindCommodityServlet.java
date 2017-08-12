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
@WebServlet(name = "FindCommodityServlet",value = "/FindCommodityServlet")
public class FindCommodityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        SqlSession sqlSession= SqlSessionHelper.getSqlSession();
        CommodityInfoDao commodityInfoDao=sqlSession.getMapper(CommodityInfoDao.class);
        String cid=request.getParameter("cid");
        String classification=request.getParameter("classification");
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        List<CommodityInfo> list=new ArrayList<CommodityInfo>();

        if(cid!=null){
            CommodityInfo commodityInfo=commodityInfoDao.findById(Integer.valueOf(cid));
            request.getSession().setAttribute("c",commodityInfo);
            request.getRequestDispatcher("detailInfo.jsp").forward(request,response);
        }

//        if(classification.equals("all")){
            list=commodityInfoDao.findAll();
            request.getSession().setAttribute("list",list);
            request.getRequestDispatcher("home.jsp").forward(request,response);
//        } else if(classification.equals("brand")){
//            list=commodityInfoDao.findByBrand("brand");
//            request.getSession().setAttribute("list",list);
//            request.getRequestDispatcher("commodityInfo.jsp").forward(request,response);
//        }else if(classification.equals("level")){
//            list=commodityInfoDao.findByLevel("level");
//            request.getSession().setAttribute("list",list);
//            request.getRequestDispatcher("commodityInfo.jsp").forward(request,response);
//        }else if(classification.equals("condition")){
//            list=commodityInfoDao.findByBrand("condition");
//            request.getSession().setAttribute("list",list);
//            request.getRequestDispatcher("commodityInfo.jsp").forward(request,response);
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
