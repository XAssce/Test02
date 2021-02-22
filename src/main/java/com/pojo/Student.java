package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int student_id;             //学生ID
    private String student_name;        //学生姓名
    private String student_number;      //学生学号
    private int student_age;            //学生年龄
    private String student_sex;         //学生性别
    private String student_address;     //学生住址
}
