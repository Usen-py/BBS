package com.blog.controller;

import com.blog.common.JsonModel;
import com.blog.mapper.TagMapper;
import com.blog.pojo.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class CommonController {

    @Autowired
    private TagMapper tagMapper;

    @RequestMapping("/getTags")
    public JsonModel getTags(JsonModel jm){
        return jm;
    }

    @RequestMapping(value = "/getArticle",method = RequestMethod.POST)
    public JsonModel getArticle(@RequestParam("articleId") Integer articleId, JsonModel jm){
        return jm;
    }

    @RequestMapping("/listTag")
    public JsonModel listTag(JsonModel jm){
        System.out.println("listtag");
        jm.setCode(1);
        jm.setData(tagMapper.selectList(null));
        return jm;
    }
}
