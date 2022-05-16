package com.blog.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Article {
    private Integer articleId;
    private Integer userId;
    private String title;
    private List<String> tags;
    private Integer pv;
    private Integer likes;
    private Integer unlikes;
    private String postTime;
    private String state;
    private String type;
}
