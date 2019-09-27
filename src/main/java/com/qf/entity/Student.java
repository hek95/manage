package com.qf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true) //开启链式编程
public class Student implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer sex;
    private Integer garden;
    @TableField(exist = false)
    private String className;
}
