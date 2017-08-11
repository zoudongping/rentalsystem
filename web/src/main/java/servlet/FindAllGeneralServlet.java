package servlet;

import dao.GeneralLedgerDao;
import dao.SqlSessionHelper;
import entity.Generalledger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by THINK on 2017/8/11.
 */
@WebServlet(name = "FindAllGeneralServlet",urlPatterns = "/findallgeneral")
public class FindAllGeneralServlet extends HttpServlet {
    GeneralLedgerDao generalLedgerDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        generalLedgerDao= SqlSessionHelper.getSqlSession().getMapper(GeneralLedgerDao.class);
        request.setCharacterEncoding("UTF-8");
        List<Generalledger> glist=generalLedgerDao.findAll();
        request.getSession().setAttribute("glist",glist);
        request.getRequestDispatcher("showgeneralledger.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
