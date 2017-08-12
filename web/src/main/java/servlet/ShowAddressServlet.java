package servlet;

import dao.AddressInfoDao;
import dao.SqlSessionHelper;
import entity.AddressInfo;
import entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/8/11.
 */
@WebServlet(name = "ShowAddressServlet",value = "/toShowAddress")
public class ShowAddressServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AddressInfoDao dao= SqlSessionHelper.getSqlSession().getMapper(AddressInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        List<AddressInfo> address=dao.findAllByUid(userInfo.getUid());
        SqlSessionHelper.closeSession();
        request.setAttribute("addressList",address);
        request.getRequestDispatcher("showaddress.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
