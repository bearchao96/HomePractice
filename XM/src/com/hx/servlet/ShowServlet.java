package com.hx.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hx.entity.Picture;
import com.hx.seriver.PictureService;
import com.hx.seriver.Impl.PictureServiceImpl;


@WebServlet("/ShowServlet")
public class ShowServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 //设置编码解码方式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //获取前端传递过来的数据
        String method = request.getParameter("method");
        if(method.equals("Show01")){
            //首页面图片回显的方法
            Show01(request,response);
        }else if(method.equals("Show02")){
            //index2.jsp 页面图片回显
            Show02(request,response);
        }


    }

    /**
     * index2.jsp 页面图片回显
     * @param request
     * @param response
     */
    private void Show02(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取id的信息
        int id = Integer.parseInt(request.getParameter("h_id"));
        int id1 = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        System.out.println(id1);
        //首先创建出我们需要读取的当前文件
        //通过房屋id 信息我们可以获取图片对应地址
        PictureService pictureService = new PictureServiceImpl();
        //调用方法查找图片
        Picture picture = pictureService.findPicture(id);
        //从本地文件中读取图片路径
        File file = new File("D:\\ZFpicture");
		
        //获取本地路径名
		//我来测试一下是否成功
        String path = file.getPath();
		
        //创键字节输入流

        FileInputStream fis = null;
        //判断
        if(id1 == 1){
            fis = new FileInputStream(path+"\\"+picture.getP_address1());

        }else if(id1 == 2){
            fis = new FileInputStream(path+"\\"+picture.getP_address2());

        }else if(id1 == 3){
            fis = new FileInputStream(path+"\\"+picture.getP_address3());

        }
        //创建出写出流
        ServletOutputStream os = response.getOutputStream();
        //创建出文件操作复制的两个数据
        byte[] buff = new byte[1024];
        int len = 0 ;
        //边读边写
        while((len = fis.read(buff)) != -1) {
            os.write(buff, 0, len);
        }
        fis.close();
    }

    /**
     *  首页面图片回显的方法
     */
    private void Show01(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //获取id的信息
        int id = Integer.parseInt(request.getParameter("h_id"));
        System.out.println(id);
        //首先创建出我们需要读取的当前文件
        //通过房屋id 信息我们可以获取图片对应地址
        PictureService pictureService = new PictureServiceImpl();
        //调用方法查找图片
        Picture picture = pictureService.findPicture(id);
        //从本地文件中读取图片路径
        File file = new File("D:\\ZFpicture");
        //获取本地路径名
        String path = file.getPath();
        //创键字节输入流
        FileInputStream fis = new FileInputStream(path+"\\"+picture.getP_address1());
        //创建出写出流
        ServletOutputStream os = response.getOutputStream();
        //创建出文件操作复制的两个数据
        byte[] buff = new byte[1024];
        int len = 0 ;
        //边读边写
        while((len = fis.read(buff)) != -1) {
            os.write(buff, 0, len);
        }
        fis.close();
	}

}
