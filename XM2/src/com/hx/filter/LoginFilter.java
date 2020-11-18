package com.hx.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hx.entity.Admin;

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

        if (uri.indexOf("/login.jsp")>-1 && uri.substring(uri.indexOf("/login.jsp")).equals("/login.jsp")) {

            chain.doFilter(request,response);

        }else{
            //继续判断
            Admin admin = (Admin) request.getSession().getAttribute("Admin");
            if(admin!=null){
                chain.doFilter(request,response);
            }else{
                request.getSession().setAttribute("LoginMSG02","您当前没有权限，请先登录");
                
                response.sendRedirect("http://localhost:8080/XM2/html/login.jsp");
            }
        }


    }

    public void init(FilterConfig config) throws ServletException {

    }

}
