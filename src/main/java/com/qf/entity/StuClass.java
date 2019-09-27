package com.qf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author liuq
 * @Date 2019/9/25
 */
@Data
@AllArgsConstructor //有参构造
@NoArgsConstructor //无参构造
@Accessors(chain = true)//开启链式编程
public class StuClass implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String className;

}
