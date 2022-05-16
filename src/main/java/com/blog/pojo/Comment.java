package com.blog.pojo;

import lombok.Data;

@Data
public class Comment {
    private Integer commentId;
    private Integer userId;
    private Integer articleId;
    private String content;
    private String postTime;
    private Integer parentId;
}
