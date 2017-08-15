package servlet;

import dao.GeneralLedgerDao;
import dao.SqlSessionHelper;
import dao.TransInfoDao;
import entity.Generalledger;
import entity.TransInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by THINK on 2017/8/11.
 */
@WebServlet(name = "BookkeepingServlet",urlPatterns = "/bookkeeping")
public class BookkeepingServlet extends HttpServlet {
    GeneralLedgerDao generalLedgerDao;
    TransInfoDao transInfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        generalLedgerDao= SqlSessionHelper.getSqlSession().getMapper(GeneralLedgerDao.class);
        transInfoDao= SqlSessionHelper.getSqlSession().getMapper(TransInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        Generalledger g1=generalLedgerDao.findByGid();
        Generalledger g2=new Generalledger();
        List remark=transInfoDao.findRemark(g1.getBookkeepingtime());
        List transmoney=transInfoDao.findTransMoney(g1.getBookkeepingtime());
        String content=new String();
        double b=0;
        for(int i=0;i<remark.size();i++){
            content=content+remark.get(i);
            b+=Double.parseDouble(transmoney.get(i).toString());
        }
        if(b>0){
            g2.setType("盈");
        }
        else g2.setType("亏");
        g2.setContent(content);
        g2.setCurrentamount(b);
        g2.setGeneral(b + g1.getGeneral());
        generalLedgerDao.insert(g2);
        String oper="添加总账";
        String operation="添加了"+g2+"账务";
        SqlSessionHelper.getSqlSession().commit();
        SqlSessionHelper.closeSession();
        request.getSession().setAttribute("operation", operation);
        request.getSession().setAttribute("oper", oper);
        response.sendRedirect("operationinsert");
//        SqlSessionHelper.getSqlSession().commit();
//        SqlSessionHelper.closeSession();
//        request.getRequestDispatcher("findallgeneral").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
