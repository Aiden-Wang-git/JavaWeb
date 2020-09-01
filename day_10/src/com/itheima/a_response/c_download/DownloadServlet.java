package com.itheima.a_response.c_download;

import org.apache.commons.io.IOUtils;
import sun.nio.ch.IOUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@WebServlet(name = "DownloadServlet", urlPatterns = "/download")
public class DownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filename = request.getParameter("name");
        ServletContext context = this.getServletContext();
        String mimeType = context.getMimeType(filename);
        response.setContentType(mimeType);
        response.setHeader("content-disposition","attachment;filename="+filename);
        InputStream is = context.getResourceAsStream("/download/" + filename);
        ServletOutputStream os = response.getOutputStream();
//        byte[] arr = new byte[1024];
//        int len = -1;
//        while ((len = is.read(arr))!=-1){
//            os.write(arr,0,len);
//        }
        IOUtils.copy(is,os);
        os.close();
        is.close();
    }
}
