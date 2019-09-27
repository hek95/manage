package com.qf.controller;

import com.qf.entity.StuClass;
import com.qf.service.IStuClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author liuq
 * @Date 2019/9/25
 */
@Controller
@RequestMapping("/stuClass")
public class StuClassController {
    @Autowired
    private IStuClassService stuClassService;

    /**
     * 得到全部班级信息
     * @param model
     * @return
     */
    @RequestMapping("getAllClass")
    public String getAllClass(Model model){
        List<StuClass> stuClassList = stuClassService.list(null);
        model.addAttribute("stuClassList",stuClassList);
        return "addStu";
    }


}
