package com.lww.springbootredis1025.service.impl;

import com.lww.springbootredis1025.mapper.UserMapper;
import com.lww.springbootredis1025.model.Emp;
import com.lww.springbootredis1025.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: lww
 * @create: 2018-10-25
 */

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Emp> queryEmp() {
        return userMapper.queryEmp();
    }
}
