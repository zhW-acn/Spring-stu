package com.acn.mapper;

import com.acn.bean.Student;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/17/20:26
 */
public class StudentMapperImpl2 extends SqlSessionDaoSupport implements StudentMapper {

    @Override
    public List<Student> selectAllStudents() {
        return getSqlSession().getMapper(StudentMapper.class).selectAllStudents();
    }
}
