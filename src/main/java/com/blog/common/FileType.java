package com.blog.common;


public enum FileType {
    JPG("jpg"),JSON("json"),PNG("png"),JPEG("jpeg"),TXT("txt"),GIF("gif");
    private String type;

    private FileType(String type){
        this.type=type;
    }

    public String getType(){
        return this.type;
    }

    public String getSufix(){
        return "."+this.type;
    }

}
