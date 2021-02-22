package com.service;

import com.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    int deleteStudentById(int id);
    int updateStudent(Student student);
    Student selectStudentById(int id);
    List<Student> selectAllStudent();
    //List<Student> selectStudentInChoose(String queryNumber,String queryName,int querySex,String queryAge,String queryAddress);
    List<Student> selectStudentInChoose(String queryNumber,String queryName);
}
