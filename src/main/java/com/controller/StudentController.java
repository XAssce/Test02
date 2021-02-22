package com.controller;

import com.pojo.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/Student")
    public String list(Model model){
        List<Student> list = studentService.selectAllStudent();
        model.addAttribute("list",list);
        return "Student";
    }


    //跳转到新增学生界面
    @RequestMapping("/toAddStudentPage")
    public String toAddStudentPage(){
        return "addStudent";
    }

    //新增一条学生信息
    @RequestMapping("/addStudent")
    public String addStudent(Model model,Student student){
        studentService.addStudent(student);
        return "redirect:/Student";
    }


    //删除一条学生信息
    @RequestMapping("/deleteStudent/{ID}")
    public String deleteStudent(@PathVariable("ID") int id){
        studentService.deleteStudentById(id);
        return "redirect:/Student";
    }

    //跳转到更新学生信息界面
    @RequestMapping("/toUpStudentPage/{ID}")
    public String toUpStudentPage(@PathVariable("ID") int id,Model model){
        Student student = studentService.selectStudentById(id);
        model.addAttribute("newStudent",student);
        return "updateStudent";
    }

    //修改一个学生信息
    @RequestMapping("/updateStudent")
    public String updateStudent(Student student){
        studentService.updateStudent(student);
        return "redirect:/Student";
    }


    //查询学生信息
    @RequestMapping("/selectStudentInChoose")
    public String selectStudentInChoose(Model model,String queryNumber,String queryName){
        List<Student> students = studentService.selectStudentInChoose(queryNumber, queryName);
        System.out.println(students);
        for (Student student : students) {
            System.out.println(student);
        }
        List<Student> list = new ArrayList<Student>();
        /*for (Student student : students) {
            System.out.println(student);
            list.add(student);
            System.out.println("添加一次");
        }*/
        System.out.println("list = " + list);
        if (students==null){
            list = studentService.selectAllStudent();
            model.addAttribute("error","未找到");
        }
        model.addAttribute("list",list);
        System.out.println(students);
        return "Student";

    }
}
