package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private int teacher_id;             //教师ID
    private String teacher_name;        //教师姓名
    private String teacher_number;      //教师编号
    private int teacher_age;            //教师年龄
    private String teacher_sex;         //教师性别
}
