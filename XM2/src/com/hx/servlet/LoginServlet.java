package com.hx.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hx.entity.Admin;
import com.hx.service.LoginService;
import com.hx.service.Impl.LoginServiceImpl;

/**
 * 登录的servlet 接口
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    //设置编码解码方式
				request.setCharacterEncoding("UTF-8");
				response.setContentType("text/html;charset=UTF-8");
				//获取前端发送的数据
				String method = request.getParameter("method");
				System.out.println(method);
				//判断
				if(method.equals("Login")) {
					//登录的方法
					Login(request,response);
				}else if(method.equals("exit")) {
					//退出的方法
					exit(request,response);
				}
	}

	/**
	 * 管理员退出的方法
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void exit(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//删除管理对象
		request.getSession().removeAttribute("Admin");
		//页面跳转
		response.sendRedirect("/XM2/html/login.jsp");
	}

	/**
	 * 管理员登录的方法
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void Login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//获取用户从前端输入的密码和账户
		String name = request.getParameter("a_username");
		String password = request.getParameter("a_password");
		//创建登录的业务层进行验证
		LoginService loginService = new LoginServiceImpl();
		Admin admin = loginService.Login(name,password);
		//判断
		if(admin != null) {
			//登录成功
			request.getSession().setAttribute("Admin", admin);
			request.getSession().removeAttribute("LoginMSG01");
			request.getSession().removeAttribute("LoginMSG02");
			//跳转到管理主界面
			response.sendRedirect("/XM2/html/index.html");
		}else {
			//登录失败
			request.getSession().setAttribute("LoginMSG01", "账号或密码错误");
			request.getSession().removeAttribute("LoginMSG02");
			//跳转到管理主界面
			response.sendRedirect("/XM2/html/login.jsp");
		}
	}
	
	
   

}
