package com.blog;

import org.apache.tomcat.util.http.fileupload.FileUtils;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @program: MyBlog
 * @description:
 * @author: 作者
 * @create: 2022-05-02 19:00
 */
public class Test {
    public static void main(String[] args) throws URISyntaxException {
        Path path = FileSystems.getDefault().getPath("static","upload");
        System.out.println(path.toAbsolutePath());
        String workDir = System.getProperty("user.dir");
//        File file = new File(workDir);
        URL url = ClassLoader.getSystemResource("");
        System.out.println(url.getPath());


        File file = new File(url.getPath());
        String[] files=file.list();
        for (String f:files){
            System.out.println(f);
        }


    }
}
