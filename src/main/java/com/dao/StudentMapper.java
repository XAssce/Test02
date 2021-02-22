package com.dao;

import com.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    int addStudent(Student student);
    int deleteStudentById(@Param("ID") int id);
    int updateStudent(Student student);
    Student selectStudentById(@Param("ID") int id);
    List<Student> selectAllStudent();
    //List<Student> selectStudentInChoose(String queryNumber,String queryName,int querySex,String queryAge,String queryAddress);
    List<Student> selectStudentInChoose(@Param("student_number")String queryNumber,@Param("student_name")String queryName);
}
