package com.blog.common;

import lombok.Data;

@Data
public class JsonModel {
    private Integer code;
    private Object data;
    private String message;
}
