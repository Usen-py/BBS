package com.blog.controller;

import com.blog.common.Image;
import com.blog.common.ImageJsonModel;

import com.blog.common.JsonModel;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;


@RequestMapping("/upload")
@RestController
public class UploadController {


    @RequestMapping(value = "/image",method = RequestMethod.POST)
    public ImageJsonModel uploadImage(@RequestParam("imageFile") MultipartFile multipartFile,HttpServletRequest request){

        ImageJsonModel jm = new ImageJsonModel();



        //文件保存目录
        String storeDir = "static/upload/image/";

        //生成文件名
        String fileName = Calendar.getInstance().getTimeInMillis()+"";

        //创建文件获取文件保存到本地的名字  fileName.xxx
        String file = saveFile(multipartFile,storeDir,fileName);


        if(file != null){
            //成功返回文件地址
            jm.setErrno(0);
            Image image = new Image(storeDir.replace("static","")+file);
            jm.setData(image);
            return jm;
        }


        jm.setErrno(1);
        jm.setMessage("图片上传失败！");
        return jm;

    }




    /**
     * 自动解析表单文件保存到本地
     * @param multipartFile  表单文件
     * @param base      服务器目标地址
     * @param fileName   文件名   fileName
     * @return  操作成功返回完整文件名   fileName.xxx
     */
    private String saveFile(MultipartFile multipartFile,String base,String fileName){

        try {
            String classPath = ClassLoader.getSystemResource("").getPath();
            base = base.charAt(base.length()-1)=='/' ? base : base+'/';

            //获取文件后缀
            String contentType=multipartFile.getContentType();
            String sufix = "."+contentType.substring(contentType.indexOf("/")+1);

            fileName = fileName+sufix;

            String fullPath = classPath + base + fileName;
//            String fullPath = base+fileName;
            File file = new File(fullPath);
            if(!file.getParentFile().exists()){
                FileUtils.forceMkdirParent(file);
            }
            multipartFile.transferTo(file);
            return fileName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }



    @RequestMapping("/article")
    public JsonModel uploadArticle(JsonModel jm){

        return jm;
    }


}
