package com.hx.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.hx.entity.Home;
import com.hx.entity.Host;
import com.hx.entity.User;
import com.hx.seriver.HomeServive;
import com.hx.seriver.HostService;
import com.hx.seriver.UserService;
import com.hx.seriver.Impl.HomeServiceImpl;
import com.hx.seriver.Impl.HostServiceImpl;
import com.hx.seriver.Impl.UserServiceImpl;
import com.hx.utils.MD5Utils;

@WebServlet("/indexServlet")
public class indexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码解码方式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        //获取前端提交的数据
        String method = request.getParameter("method");
        System.out.println(method);
        //判断
        if(method.equals("Regist")){
            //注册
            UserRegist(request,response);
        }else if(method.equals("isLogin")){
            //查询用户是否存在
            isLogin(request,response);
        }else if(method.equals("Login")){
            //用户登录
            Login(request,response);
        }else if(method.equals("exit")){
            //用户退出
            Userexit(request,response);
        }else if(method.equals("findByNum")){
            //返回给用户他注册的账号
            findByNum(request,response);
        }else if(method.equals("findHomeMsg")){
            //放回房屋数据到前端界面
            findHomeMsg(request,response);
        }else if(method.equals("findIdMsg01")){
            //将 id 携带并跳转到 index2.jsp
            findIdMsg01(request,response);
        }else if(method.equals("findIdMsg02")){
            //回显信息到 index2.jsp页面
            findIdMsg02(request,response);
        }else if(method.equals("findHostMsg")){
            //查找房东信息
            findHostMsg(request,response);
        }else if(method.equals("addyyHome")){
            //添加预约房屋信息
            addyyHome(request,response);
        }
		
	}
	 /**
     * 添加用户房屋预约信息
     * @param request
     * @param response
     */
    private void addyyHome(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
        //拿到房屋id号码
        int id = (int) request.getSession().getAttribute("id");
        //拿到用户对象
        User user = (User) request.getSession().getAttribute("User");
		
        //去添加用户信息
        HomeServive homeServive = new HomeServiceImpl();
		
        //调用添加预约的方法
        boolean flag = homeServive.addyyHome(user, id);
        //判断回显
        if(flag == true){
			
            //预约成功
            response.getWriter().write("true");
        }else{
            //预约失败
            response.getWriter().write("false");
        }

    }

    /**
     * 查询房东信息
     * @param request
     * @param response
     */
    private void findHostMsg(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
        //拿到房子的id
        int id = (int) request.getSession().getAttribute("id");
		
        //创建出房东的业务层
        HostService hostService = new HostServiceImpl();
		
        //调用业务层的方法查询房东
        Host hostMsg = hostService.findHostMsg(id);
		
        //回显数据
        response.getWriter().write(JSONObject.toJSONString(hostMsg));
    }

    /**
     * 回显信息到 index2.jsp页面
     * @param request
     * @param response
     */
    private void findIdMsg02(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //获得id
        int id = (int) request.getSession().getAttribute("id");
        //创建房子业务层
        HomeServive homeServive = new HomeServiceImpl();
        //调用方法
        Home idMsg = homeServive.findIdMsg(id);
        //回显数据
        response.getWriter().write(JSONObject.toJSONString(idMsg));

    }

    /**
     * 将 房屋id 携带并跳转index2.jsp
     * @param request
     * @param response
     */
    private void findIdMsg01(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取用户要查看的房子信息id
        String id1 = request.getParameter("id");
        int id = Integer.parseInt(id1);

        //将id 存到session 域中
        request.getSession().setAttribute("id",id);

        //页面跳转  跳转到index2.jsp
       response.getWriter().write("true");

    }

    /**
     * 返回房屋数据到前端页面
     * @param request
     * @param response
     */
    private void findHomeMsg(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //创建房屋业务层
        HomeServive homeServive = new HomeServiceImpl();
        //调用方法
        List<Home> homeMsg = homeServive.findHomeMsg();
        //回显
        response.getWriter().write(JSONObject.toJSONString(homeMsg));
    }

    /**
     * 返回给用户他注册的账号的方法
     * @param request
     * @param response
     */
    private void findByNum(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //拿到用户注册的手机号
        long phone = (long) request.getSession().getAttribute("phone");
        //根据电话号码查找用户
        UserService userService = new UserServiceImpl();
        //调用方法
        User user = userService.findByNum(phone);

        String num = String.valueOf(user.getU_num());
        //回显
        response.getWriter().write(num);
        //移除手机号 便于下次注册的人使用
        request.getSession().removeAttribute("phone");
    }

    /**
     * 用户退出的方法
     * @param request
     * @param response
     */
    private void Userexit(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().removeAttribute("User");
        response.sendRedirect("http://localhost:8080/XM/view/index.jsp");

    }

    /**
     * 用户登录的方法
     * @param request
     * @param response
     */
    private void Login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //拿到用户输入的账号和密码
        long u_usernum = Long.parseLong(request.getParameter("u_usernum"));

        String u_password1 = request.getParameter("u_password");
        String u_password = MD5Utils.md5Code(u_password1);

        //创建业务层对象
        UserService userService = new UserServiceImpl();
        //调用登录的方法
        User user = userService.Login(u_usernum, u_password);
        //判断
        if(user != null){
            //登录成功
            //将用户保存到session 域中
            request.getSession().removeAttribute("LoginMSG01");
            request.getSession().removeAttribute("LoginMSG02");
            request.getSession().setAttribute("User",user);
            //跳转到主页面
            response.sendRedirect("http://localhost:8080/XM/view/index.jsp");
        }else{
            //登录失败显示 提示信息
            request.getSession().setAttribute("LoginMSG01","密码或者账号错误，请重新输入");
            //跳转到登录界面
            response.sendRedirect("http://localhost:8080/XM/view/login.jsp");
        }
    }

    /**
     * 根据用户账号查询用户是否存在
     * @param request
     * @param response
     */
    private void isLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取用户发送过来的数据

        long u_usernum = Long.parseLong(request.getParameter("name"));
        //去数据库进行查找
        UserService userService = new UserServiceImpl();
        //调用业务层的方法
        User user = userService.isLogin(u_usernum);
        //判断
        if(user == null){
            //用户不存在
            response.getWriter().write("false");
        }
    }

    /**
     *  用户注册
     */
    private void UserRegist(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //拿到前端表单提交的数据
        String u_username = request.getParameter("u_username");
        String u_password1 = request.getParameter("u_password");
        String u_password = MD5Utils.md5Code(u_password1);
        long u_phone = Long.parseLong(request.getParameter("u_phone"));

        //将手机号码处储存在session 域
        request.getSession().setAttribute("phone",u_phone);

        //创建出用户对象
        User user = new User();
        //储存对象
        user.setU_name(u_username);
        user.setU_password(u_password);
        user.setU_phone(u_phone);
        //创建业务层对象
        UserService userService = new UserServiceImpl();
        //调用注册的方法
        userService.UserRegist(user);
        //注册成功 跳转到登录界面
        response.sendRedirect("/XM/view/login.jsp");

    }

}
