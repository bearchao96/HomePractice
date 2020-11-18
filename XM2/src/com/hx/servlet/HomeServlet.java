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
import com.hx.entity.Picture;
import com.hx.entity.User;
import com.hx.entity.YyHome;
import com.hx.service.HomeService;
import com.hx.service.HostService;
import com.hx.service.PictureService2;
import com.hx.service.UserService;
import com.hx.service.YyHomeService;
import com.hx.service.Impl.HomeServiceImpl;
import com.hx.service.Impl.HostServiceImpl;
import com.hx.service.Impl.PictureService2Impl;
import com.hx.service.Impl.UserServiceImpl;
import com.hx.service.Impl.YyHomeServiceImpl;

/**
 *  
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码解码方式
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		//获取前端发送的数据
		String method = request.getParameter("method");
		System.out.println(method);
		//判断
		if(method.equals("findAllPicture")) {
			//查找所有图片信息
			findAllPicture(request,response);
		}else if(method.equals("addAllHome")) {
			//添加房屋信息
			addAllHome(request,response);
		}else if(method.equals("findAllUser")) {
			//查找所有的用户信息
			findAllUser(request,response);
		}else if(method.equals("findAllyyHome")) {
			//查找所有的预约订单
			findAllyyHome(request,response);
		}else if(method.equals("findAllHost")) {
			//查询所有房东信息
			findAllHost(request,response);
		}else if(method.equals("saveHome_id")) {
			//储存房屋id到session 域中。方便上传图片的时候使用 房屋id
			saveHome_id(request,response);
		}else if(method.equals("save_id")) {
			//储存输入要修改的房屋id 数据
			save_id(request,response);
		}else if(method.equals("updateHome")) {
			//修改房屋信息
			updateHome(request,response);
		}else if(method.equals("findById")) {
			//根据房子id 查询房屋
			findById(request,response);
		}else if(method.equals("findHomeMsg2")) {
			//根据房东姓名查询其发布分租房信息
			findHomeMsg2(request,response);
		}else if(method.equals("deleteHome")) {
			//删除房屋信息
			deleteHome(request,response);
		}else if(method.equals("updateHost")) {
			//完善房屋信息
			updateHost(request,response);
		}else if(method.equals("save_Host_id")) {
			//存储房东用户的id
			save_Host_id(request,response);
		}
		
	}

	
	/**
	 * 储存房东用户的 id
	 * @param request
	 * @param response
	 */
	private void save_Host_id(HttpServletRequest request, HttpServletResponse response) {
		//拿到房东的编号
		int id = Integer.parseInt(request.getParameter("id"));
		//储存房东的id
		request.getSession().setAttribute("host_id", id);
		
	}

	/**
	 * 完善房屋信息
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void updateHost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//获取房东的编号
		int id = (int) request.getSession().getAttribute("host_id");
		
		//获取前端页面发送过来的数据
		String jyfs = request.getParameter("jyfs");
		String szgs = request.getParameter("szgs");
		long sjhm = Long.parseLong(request.getParameter("sjhm"));
		//创建房东对象
		Host host = new Host();
		host.setF_jiyi(jyfs);
		host.setF_company(szgs);
		host.setF_phone(sjhm);
		
		//创建房东业务层
		HostService hostService = new HostServiceImpl();
		hostService.updateHost(host,id);
		
		//完善成功 跳转
		response.sendRedirect("/XM2/html/Dome05.html");
	}

	/**
	 * 删除房屋信息
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void deleteHome(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//获取房屋 id
		int id = Integer.parseInt(request.getParameter("id"));
		//创建房子业务层对象
		HomeService homeService = new HomeServiceImpl();
		//根据id 删除房子
		homeService.deleteHome(id);
		//删除成功后 刷新页面
		//操作完成 关闭模态窗 并跳转
		response.setHeader("refresh", "0.1;url=/XM2/html/Dome01.html");
	}

	/**
	 * 根据房东姓名查询其发布分租房信息
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void findHomeMsg2(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//拿到输入的房东名
		String name = request.getParameter("name");
		
		//创建房子业务层对象
		HomeService homeService = new HomeServiceImpl();
		//调用方法
		List<Home> findHomeMsg2 = homeService.findHomeMsg2(name);
		
		//回显数据
		response.getWriter().write(JSONObject.toJSONString(findHomeMsg2));
	}

	/**
	 * 根据房子id 查询房屋
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void findById(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//获取id值
		int id = Integer.parseInt(request.getParameter("id"));
		//创建房子业务层对象
		HomeService homeService = new HomeServiceImpl();
		//调用方法
		Home home = homeService.findById(id);
		//判断
		if(home == null) {
			//要修改的房屋不存在
			response.getWriter().write("false");
		}else {
			//存在
			response.getWriter().write("ture");
		}
	}

	/**
	 * 修改房屋储存信息
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void updateHome(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//获取要修改信息的房屋id
		int id = (int) request.getSession().getAttribute("id");
		//获取用户修改的数据
		//获取前端表示提交的数据
		String fwms = request.getParameter("fwms");		
		String value = request.getParameter("cheak");
		String fwlx = request.getParameter("fwlx");
		String fwcx = request.getParameter("fwcx");
		double fwzj = Double.parseDouble(request.getParameter("fwzj"));
		String fkfs = request.getParameter("fkfs");
		String fwxx = request.getParameter("fwxx");		
						
						//创建房屋对象
						Home home = new Home();
						//进行储存
						home.setH_ms(fwms);
						home.setH_way(value);
						home.setH_type(fwlx);
						home.setH_direction(fwcx);
						home.setH_money(fwzj);
						home.setH_buyway(fkfs);
						home.setH_msg(fwxx);
						
						//创建房子业务层对象
						HomeService homeService = new HomeServiceImpl();
						//调用方法
						homeService.updateHome(home,id);
						//修改成功 跳转收页面
						response.sendRedirect("/XM2/html/Dome01.html");
	}

	/**
	 * 储存输入要修改的房屋id 数据
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void save_id(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//获取id值
		int id = Integer.parseInt(request.getParameter("id"));
		//储存在session 域中
		request.getSession().setAttribute("id", id);
		
	}

	/**
	 * 储存房屋id到session 域中。方便上传图片的时候使用 房屋id
	 * @param request
	 * @param response
	 */
	private void saveHome_id(HttpServletRequest request, HttpServletResponse response) {
		//获取前端发送过来的 房屋home_id 数据
		String home_id = request.getParameter("id");
		int id = Integer.parseInt(home_id);
		//将值进行储存
		request.getSession().setAttribute("Home_id", id);
		
	}

	/**
	 * 查询所有房东信息的方法
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void findAllHost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//创建房东的业务层对象
		HostService hostService = new HostServiceImpl();
		//调用方法查询
		List<Host> findAllHost = hostService.findAllHost();
		//回显数据
		response.getWriter().write(JSONObject.toJSONString(findAllHost));
		
	}

	/**
	 * 查找所有的预约订单
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void findAllyyHome(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//创建预约订单的业务层对象
		YyHomeService YyHomeService = new YyHomeServiceImpl();
		//调用方法查询
		List<YyHome> findAllyyhome = YyHomeService.findAllyyhome();
		//回显数据
		response.getWriter().write(JSONObject.toJSONString(findAllyyhome));
		
	}

	/**
	 * 查找所有用户的信息
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void findAllUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//创建用户业务层对象
		UserService userService = new UserServiceImpl();
		//调用方法
		List<User> findAllUser = userService.findAllUser();
		//回显数据
		response.getWriter().write(JSONObject.toJSONString(findAllUser));
		
	}

	/**
	 * 添加房屋信息
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void addAllHome(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//获取前端表示提交的数据
		String fwms = request.getParameter("fwms");
		String value = request.getParameter("cheak");
		String fwlx = request.getParameter("fwlx");
		String fwcx = request.getParameter("fwcx");
		String szxq = request.getParameter("szxq");
		String szqy = request.getParameter("szqy");
		String xxdz = request.getParameter("xxdz");
		
		double fwzj = Double.parseDouble(request.getParameter("fwzj"));
		String fkfs = request.getParameter("fkfs");
		String fwxx = request.getParameter("fwxx");
		String fdxx = request.getParameter("fdxx");
		
		//创建房屋对象
		Home home = new Home();
		//进行储存
		home.setH_ms(fwms);
		home.setH_way(value);
		home.setH_type(fwlx);
		home.setH_direction(fwcx);
		home.setH_address1(szxq);
		home.setH_address2(szqy);
		home.setH_address3(xxdz);
		home.setH_money(fwzj);
		home.setH_buyway(fkfs);
		home.setH_msg(fwxx);
		home.setH_hostmsg(fdxx);
		
		//创建房子业务层对象
		HomeService homeService = new HomeServiceImpl();
		//调用添加的方法
		homeService.addAllHome(home);
		//操作完成 关闭模态窗 并跳转
		response.setHeader("refresh", "0.1;url=/XM2/html/Dome01.html");
		
	}

	/**
	 * 查询所有图片的方法
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void findAllPicture(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//创建图片业务层对象
		PictureService2 pictureService = new PictureService2Impl();
		//调用方法回显
		List<Picture> findAllPicture = pictureService.findAllPicture();
		//回显数据
		response.getWriter().write(JSONObject.toJSONString(findAllPicture));
		
	}

}
