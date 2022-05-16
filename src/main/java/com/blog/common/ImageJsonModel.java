package com.blog.common;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ImageJsonModel {
    private Integer errno;
    private Object data;
    private String message;
}
