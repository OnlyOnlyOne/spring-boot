package com.imooc.springbootlearn2;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 描述：     Mapper类
 */
@Mapper
@Repository
public interface StudentsMapper {

    @Select("SELECT * FROM student WHERE id = #{id}")
    Student findById(long id);
}
