package com.acn.mapper;

import com.acn.bean.Student;

import java.util.List;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/17/17:26
 */
public interface StudentMapper {
    List<Student> selectAllStudents();
}
