package com.qf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qf.entity.Student;

import java.util.List;

/**
 * @author liuq
 * @Date 2019/9/25
 */
public interface IStudentService extends IService<Student> {
    List<Student> selectAllStudent();
}
