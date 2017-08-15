package servlet;

import dao.SqlSessionHelper;
import dao.UserInfoDao;
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
@WebServlet(name = "UpdatePasswordServlet",value = "/toUpdatePwd")
public class UpdatePasswordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserInfoDao dao=SqlSessionHelper.getSqlSession().getMapper(UserInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        String oldPwd = request.getParameter("oldPwd");
        String newPwd = request.getParameter("newPwd");
        String rePwd = request.getParameter("rePwd");
        UserInfo userInfo1=new UserInfo();
        userInfo1.setUname(userInfo.getUname());
        userInfo1.setPwd(oldPwd);
        UserInfo user=dao.findUserNameAndPwd(userInfo1);
        if(user!=null){
            if(newPwd.equals(rePwd)){
                user.setPwd(newPwd);
                int num=dao.updatePwd(user);
                if(num==1){
                    SqlSessionHelper.getSqlSession().commit();
                    SqlSessionHelper.closeSession();
                    out.print("<center><h1>密码修改成功！</h1><br>" +
                            "<a href='usercentral.jsp'>点此返回个人中心</a></center>");
                }else{
                    out.print("<center><h1>Sorry,发生系统异常!</h1><br>" +
                            "<a href='usercentral.jsp'>点此返回个人中心</a></center>");
                }
            }else{
                out.print("<center><h1>抱歉，新密码与确认密码不一致！</h1><br>" +
                        "<a href='updatePwd.html'>点此返回</a></center>");
            }
        }else{
            out.print("<center><h1>抱歉，原密码错误！</h1><br>" +
                    "<a href='updatePwd.html'>点此返回</a></center>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
