package com.qf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.dao.StuClassMapper;
import com.qf.entity.StuClass;
import com.qf.service.IStuClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuq
 * @Date 2019/9/25
 */
@Service
public class StuClassServiceImpl extends ServiceImpl<StuClassMapper, StuClass> implements IStuClassService {
    @Autowired
    private IStuClassService stuClassService;
}
