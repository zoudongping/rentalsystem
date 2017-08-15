package servlet;

import dao.ManagerInfoDao;
import dao.SqlSessionHelper;
import dao.UserInfoDao;
import entity.ManagerInfo;
import entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/8/10.
 */
@WebServlet(name = "updateManagerPwdServlet",value = "/toUpdateManagerPwd")
public class updateManagerPwdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ManagerInfoDao dao=SqlSessionHelper.getSqlSession().getMapper(ManagerInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        ManagerInfo managerInfo=(ManagerInfo)request.getSession().getAttribute("manager");
        String oldPwd= request.getParameter("oldPwd");
        String newPwd= request.getParameter("newPwd");
        String rePwd= request.getParameter("rePwd");
        ManagerInfo managerInfo1= new ManagerInfo();
        managerInfo1.setMname(managerInfo.getMname());
        managerInfo1.setPwd(oldPwd);
        ManagerInfo manager=dao.findManagerNameAndPwd(managerInfo1);


        if(manager!=null){
            if(newPwd.equals(rePwd)){
                manager.setPwd(newPwd);
                int num=dao.updatePassword()
                if(num==1){
                    SqlSessionHelper.getSqlSession().commit();
                    SqlSessionHelper.closeSession();
                    out.print("<center><h1>密码修改成功！</h1><br>" +
                            "<a href='managercentral.jsp'>点此返回个人中心</a></center>");
                }else{
                    out.print("<center><h1>Sorry,发生系统异常!</h1><br>" +
                            "<a href='managercentral.jsp'>点此返回个人中心</a></center>");
                }
            }else{
                out.print("<center><h1>抱歉，新密码与确认密码不一致！</h1><br>" +
                        "<a href='updateManagerPwd.html'>点此返回</a></center>");
            }
        }else{
            out.print("<center><h1>抱歉，原密码错误！</h1><br>" +
                    "<a href='updateManagerPwd.html'>点此返回</a></center>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}










//        UserInfo user=dao.findUserNameAndPwd(userInfo1);