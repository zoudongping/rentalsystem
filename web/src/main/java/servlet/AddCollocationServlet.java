package servlet;

import dao.CollocationInfoDao;
import dao.SqlSessionHelper;
import entity.CollocationInfo;
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
@WebServlet(name = "AddCollocationServlet",value = "/AddCollocationServlet")
public class AddCollocationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        SqlSession sqlSession= SqlSessionHelper.getSqlSession();
        CollocationInfoDao collocationInfoDao=sqlSession.getMapper(CollocationInfoDao.class);
        CollocationInfo collocationInfo=new CollocationInfo();
        collocationInfo.setCid(5);
        collocationInfo.setLevel("专业级");
        collocationInfo.setScreensize(1.0);
        collocationInfo.setColor("黑");
        collocationInfo.setPixel("");
        collocationInfo.setCondition("");
        collocationInfo.setSensor("");
        collocationInfo.setBattery("");
        collocationInfoDao.add(collocationInfo);
        sqlSession.commit();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
