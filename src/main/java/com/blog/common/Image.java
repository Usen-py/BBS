package com.blog.common;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Image {
    private String url;
    private String alt;
    private String href;

    public Image(){}

    public Image(String url,String alt,String href){
        this.url=url;
        this.alt = alt;
        this.href = href;
    }

    public Image(String url){
        this.url = url;
    }
}
