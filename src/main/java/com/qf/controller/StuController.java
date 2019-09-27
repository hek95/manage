package com.qf.controller;

import com.qf.entity.StuClass;
import com.qf.entity.Student;
import com.qf.service.IStuClassService;
import com.qf.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author liuq
 * @Date 2019/9/25
 */
@Controller
@RequestMapping("/stu")
public class StuController {
    @Autowired
    private IStudentService studentService;
    @Autowired
    private IStuClassService stuClassService;
    //获得所有学生
    @RequestMapping("/getStuList")
    public String getStuList(Model model){
        List<Student> stuList= studentService.selectAllStudent();
        List<StuClass> stuClassList = stuClassService.list(null);
        model.addAttribute("stuList",stuList);
        model.addAttribute("stuClassList",stuClassList);
        return "stuList";
    }

    //删除学生信息
    @RequestMapping("/delStu/{id}")
    public String delStu(@PathVariable Integer id){
        studentService.removeById(id);
        return "redirect:/stu/getStuList";
    }
    //添加学生信息

    @RequestMapping("addStu")
    public String addstu(Student student){
        studentService.save(student);
        return "redirect:/stu/getStuList";
    }
    //修改学生信息
    @RequestMapping("/updateStu")
    public String updateStu(Student student){
            if (studentService.updateById(student)){
            System.out.println("修改成功");
        }
        return "redirect:/stu/getStuList";
    }
    //根据ID查询学生信息
    @RequestMapping("/toUpdate/{id}")
    public String getStuById(@PathVariable Integer id ,Model model){
        Student student = studentService.getById(id);
        List<StuClass> stuClassList = stuClassService.list(null);
        model.addAttribute("stuClassList",stuClassList);
        model.addAttribute("student" , student);
        return "updateStu";
    }
}
