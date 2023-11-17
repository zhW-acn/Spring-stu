package com.acn.mapper;

import com.acn.bean.Student;
import lombok.Data;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/17/18:36
 */
@Data
public class StudentMapperImpl implements StudentMapper{

    // 所有操作都使用SqlSessionTemplate类来执行
    SqlSessionTemplate sqlSession;

    @Override
    public List<Student> selectAllStudents() {
        return sqlSession.getMapper(StudentMapper.class).selectAllStudents();
    }
}
