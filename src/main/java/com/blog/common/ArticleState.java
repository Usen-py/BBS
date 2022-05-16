package com.blog.common;


public enum  ArticleState {
    PRIVATE("仅我可见",1),PUBLIC("全部可见",2),
    UNCHECKED("待审核",3),DRAFT("草稿",4),RECYCLE("回收",5);
    private int value;
    private String name;

    private ArticleState(String name,int value){
        this.name=name;
        this.value=value;
    }

    public int getValue(){
        return this.value;
    }

    public String getName(){
        return this.name;
    }

}
