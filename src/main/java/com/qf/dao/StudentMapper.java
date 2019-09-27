package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.entity.Student;

import java.util.List;

/**
 * @author liuq
 * @Date 2019/9/25
 */
public interface StudentMapper extends BaseMapper<Student> {
    List<Student> selectAllStudent();
}
