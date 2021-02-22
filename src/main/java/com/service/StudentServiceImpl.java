package com.service;

import com.dao.StudentMapper;
import com.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
   private StudentMapper studentMapper;

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int deleteStudentById(int id) {
        return studentMapper.deleteStudentById(id);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public Student selectStudentById(int id) {
        return studentMapper.selectStudentById(id);
    }

    @Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }

  /*  @Override
    public List<Student> selectStudentInChoose(String queryNumber,String queryName,int querySex,String queryAge,String queryAddress) {
        return studentMapper.selectStudentInChoose(queryNumber,queryName,querySex,queryAge,queryAddress);
    }
*/
    @Override
    public List<Student> selectStudentInChoose(String queryNumber, String queryName) {
        return studentMapper.selectStudentInChoose(queryNumber,queryName);
    }

}
