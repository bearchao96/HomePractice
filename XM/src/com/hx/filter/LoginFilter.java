package com.hx.filter;

import com.hx.entity.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //首先将request 和 responst 进行强制
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        //获取地址栏的地址信息
        String uri = request.getRequestURI();
        //判断

        if (uri.indexOf("/index.jsp")>-1 && uri.substring(uri.indexOf("/index.jsp")).equals("/index.jsp")) {

            chain.doFilter(request,response);

        }else if(uri.indexOf("/login.jsp")>-1 && uri.substring(uri.indexOf("/login.jsp")).equals("/login.jsp")){
            chain.doFilter(request,response);

        }else if(uri.indexOf("/regist.jsp")>-1 && uri.substring(uri.indexOf("/regist.jsp")).equals("/regist.jsp")){
            chain.doFilter(request,response);
        }else if(uri.indexOf("/index2.jsp")>-1 && uri.substring(uri.indexOf("/index2.jsp")).equals("/index2.jsp")) {
        	 chain.doFilter(request,response);
        }else{
            //继续判断
            User user = (User) request.getSession().getAttribute("User");
            if(user!=null){
                chain.doFilter(request,response);
            }else{
                request.getSession().setAttribute("LoginMSG02","您当前没有权限，请先登录");
                response.sendRedirect("http://localhost:8080/XM/view/login.jsp");
            }
        }


    }

    public void init(FilterConfig config) throws ServletException {

    }

}
