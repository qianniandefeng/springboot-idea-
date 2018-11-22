package com.demo.Mapper;

import com.demo.model.Person;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Repository
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM PERSON WHERE Id_P = #{id}")
    Person selectUser(int id);

    @Select("SELECT * FROM PERSON WHERE name = #{name}")
    Person selectName(String name);
}