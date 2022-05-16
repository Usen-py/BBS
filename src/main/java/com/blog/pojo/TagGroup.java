package com.blog.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

@Data
public class TagGroup {
    @TableId(type = IdType.AUTO)
    private Integer gid;
    private String gname;
    @TableField(exist = false)
    private List<Tag> tags;
}
