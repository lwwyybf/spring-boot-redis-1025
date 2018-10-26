package com.lww.springbootredis1025.mapper;

import com.lww.springbootredis1025.model.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    String queryPassword(String name);

    List<Emp> queryEmp();

}
