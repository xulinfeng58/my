package MyServlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myservlet
 */
@WebServlet("/Myservlet")
public class Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //response.getWriter().append("Served at: ").append(request.getContextPath());
        doPost(request,response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html;charset=UTF-8");
        String name = this.getServletConfig().getInitParameter("name");
        String password = this.getServletConfig().getInitParameter("password");
        response.getWriter().print("username="+name +"password="+password);
        String namepost = request.getParameter("username");
        String passwordpost = request.getParameter("password");
        response.getWriter().print("<br>namepost="+namepost+"  passwordpost="+passwordpost);
        /*
         * if(namepost.equals(name)&&passwordpost.equals(password){
         * response.getWriter().print("用户登录：登录成功");}else{
         * response.getWriter().print("用户登录：登录失败");}
         */
        Date date = new Date();
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        response.getWriter().print("<br>"+sdFormat.format(date));
    }}
