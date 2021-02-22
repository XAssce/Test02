package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class {
    private int class_id;               //班级ID
    private String class_name;          //班级名称
    private String class_address;       //班级地址
    private int class_number;           //老师可以教的班级数量
}
