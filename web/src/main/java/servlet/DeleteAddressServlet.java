package servlet;

import dao.AddressInfoDao;
import dao.SqlSessionHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/11.
 */
@WebServlet(name = "DeleteAddressServlet",value = "/toDeleteAddress")
public class DeleteAddressServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("id");
        AddressInfoDao dao= SqlSessionHelper.getSqlSession().getMapper(AddressInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        int num=dao.deleteAddress(id);
        if(num==1){
            SqlSessionHelper.getSqlSession().commit();
            SqlSessionHelper.closeSession();
            response.sendRedirect("toShowAddress");
            SqlSessionHelper.getSqlSession().commit();
            SqlSessionHelper.closeSession();
        }else{
            response.getWriter().append("Sorry!SYSTEM ERROR!/(ToT)/~~");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
