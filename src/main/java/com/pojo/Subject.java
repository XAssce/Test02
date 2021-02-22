package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    private int subject_id;             //课程ID
    private String subject_name;        //课程名称
    private String subject_address;     //上课地址
    private int subject_grade;          //考试分数
}
