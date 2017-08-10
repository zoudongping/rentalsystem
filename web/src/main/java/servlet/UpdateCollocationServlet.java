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
@WebServlet(name = "UpdateCollocationServlet",value = "/UpdateCollocationServlet")
public class UpdateCollocationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        SqlSession sqlSession= SqlSessionHelper.getSqlSession();
        CollocationInfoDao collocationInfoDao=sqlSession.getMapper(CollocationInfoDao.class);
        CollocationInfo collocationInfo=new CollocationInfo();
        collocationInfo.setCid(3);
        collocationInfo.setLevel("专家级");
        collocationInfoDao.update(collocationInfo);
        sqlSession.commit();
        System.out.println(collocationInfo);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
