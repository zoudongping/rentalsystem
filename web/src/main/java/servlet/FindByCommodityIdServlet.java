package servlet;

import dao.CommentDao;
import dao.CommodityInfoDao;
import dao.SqlSessionHelper;
import entity.CommentInfo;
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
    CommentDao commentDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        SqlSession sqlSession= SqlSessionHelper.getSqlSession();
        commentDao= SqlSessionHelper.getSqlSession().getMapper(CommentDao.class);
        CommodityInfoDao commodityInfoDao=sqlSession.getMapper(CommodityInfoDao.class);
        String cid=request.getParameter("cid");
        List<CommentInfo> clist=commentDao.findByCommodityid(Integer.valueOf(cid));
//        String classification=request.getParameter("classification");
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        List<CommodityInfo> list=new ArrayList<CommodityInfo>();
        if(cid!=null){
            CommodityInfo commodityInfo=commodityInfoDao.findById(Integer.valueOf(cid));
            request.getSession().setAttribute("c",commodityInfo);
            request.getSession().setAttribute("clist",clist);
            request.getRequestDispatcher("detailInfo.jsp").forward(request,response);

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
