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

/**
 * Created by THINK on 2017/8/12.
 */
@WebServlet(name = "UpdateAddressServlet",urlPatterns = "/updateaddress")
public class UpdateAddressServlet extends HttpServlet {
    AddressInfoDao addressInfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        addressInfoDao = SqlSessionHelper.getSqlSession().getMapper(AddressInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        AddressInfo addressInfo = (AddressInfo) request.getSession().getAttribute("address");
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("user");
        String name=request.getParameter("name");
        String address=request.getParameter("address");
        String tel=request.getParameter("tel");
        if(name.equals("")==false){
            addressInfo.setName(name);
        }
        if(address.equals("")==false){
            addressInfo.setAddress(address);
        }
        if(tel.equals("")==false){
            addressInfo.setTel(tel);
        }
        addressInfoDao.updateAddress(addressInfo);
        SqlSessionHelper.getSqlSession().commit();
        SqlSessionHelper.closeSession();
        request.setAttribute("user",userInfo);
        response.sendRedirect("toShowAddress");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
