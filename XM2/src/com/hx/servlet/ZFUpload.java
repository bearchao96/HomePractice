package com.hx.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;

import com.hx.dao.PictureDao2;
import com.hx.dao.Impl.PictureDao2Impl;
import com.hx.entity.Picture;

/**
 * 租房系统文件上传系统
 */
@WebServlet("/ZFUpload")
public class ZFUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// 创建出文件上传的帮助工具
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);

			// 通过上传对象拿到上传表单提交过来的所有数据
			// 进提交请求的数据 储存在对象中 放回所有提交的数据集合
			List<FileItem> list = upload.parseRequest(new ServletRequestContext(request));

			for (FileItem fileItem : list) {
				if (fileItem.isFormField()) {
					// 是表单的字段数据，不是文件数据

				}
				
				String name = null ;
				if (!fileItem.isFormField()) {
					// 取反代表是文件数据
					// 拿到文件名
					name = fileItem.getName();
					System.out.println(name);

					// 定义当前文件储存的路径
					String path = request.getServletContext().getRealPath("/ZFupload");
					System.out.println(path);

					// 将文件夹的路径和文件路径进行拼接
					String filePath = String.format("%s/%s", path, name);
					System.out.println(filePath);

					// 将文件创建出来
					File file = new File(filePath);
					// 将图片写入到文件中
					fileItem.write(file);

				}
				
				
				//写入文件后 将图片地址进行数据库的储存
				//拿到用户在session 中储存的房屋id值
				int id = (int) request.getSession().getAttribute("Home_id");
				//通过id去图片库拿对应的图片信息
				PictureDao2 pictureDao = new PictureDao2Impl();
				Picture picture2 = pictureDao.findByID(id);
				
				//将图片地址存储在数据库中
				Picture picture = new Picture();
				
				//对图片库中的路劲进行判断 是空就添加修改
				if(picture2.getP_address1() == null) {
					
					picture.setP_address1(name);
					
				}else if(picture2.getP_address2() == null) {
					
					picture.setP_address2(name);
					
				}else if(picture2.getP_address3() == null) {
					
					picture.setP_address3(name);
				}
				
				//去数据据库中添加图片地址
				pictureDao.updata(picture,id);
				
				
			}

			// 上传成功能后将 服务器的文件保存到本地文件夹中
			// 拿到服务器文件夹  同时创建本地文件夹
			File oldFile = new File("D:\\Tomcat\\apache-tomcat-8.5.50\\webapps\\XM2\\ZFupload");
			File newFile = new File("D:\\ZFpicture");
			
			// 调用复制方法 存入本地文件夹中
			copy(oldFile, newFile.getPath());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//添加完成后 跳转到Doem02.html及图片管理 页面 
		response.sendRedirect("/XM2/html/Dome02.html");
	}

	
	/**
	 * 文件与文件夹复制
	 * 
	 * @throws IOException
	 */
	public static void copy(File oldFile, String newPath) throws IOException {
		// 创建出当前的新目录文件夹，查看是否需要创建
		File newFile = new File(newPath);
		// 判断
		if (!newFile.exists()) {
			// 创建
			newFile.mkdir();
		}
		// 将目标文件夹里面的文件都拿出来进行遍历
		File[] files = oldFile.listFiles();
		for (File file : files) {
			// 如果是一个文件夹，继续调用自己，入口
			if (file.isDirectory()) {
				// 调用自己，修改路径
				copy(file, newPath + "\\" + file.getName());
			}
			// 如果是文件
			if (file.isFile()) {
				// 直接复制不需要再调用了，出口
				// 创建两个对象
				FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream(newFile + "\\" + file.getName());
				// 创建出两个容器
				byte[] buff = new byte[1024];
				int len = 0;
				// 边读边写
				while ((len = fis.read(buff)) != -1) {
					// 写入
					fos.write(buff, 0, len);
				}
				// 写完，关流
				fis.close();
				fos.close();
			}
		}
	}
}
