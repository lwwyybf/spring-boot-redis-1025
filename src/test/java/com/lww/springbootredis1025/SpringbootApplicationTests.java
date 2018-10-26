package com.lww.springbootredis1025;

import com.lww.springbootredis1025.model.Emp;
import com.lww.springbootredis1025.model.Person;
import com.lww.springbootredis1025.service.EmpService;
import com.lww.springbootredis1025.service.RedisService;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: lww
 * @create: 2018-10-25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {



    @Autowired
    private RedisService redisService;

    @Autowired
    private EmpService empService;

    private JSONObject json = new JSONObject();

    @Test
    public void contextLoads() throws Exception{

    }

    @Test
    public void setString(){
        redisService.set("lww","sss");
    }

    @Test
    public void getString(){
        String result = redisService.get("lww");
        System.out.println(result);
    }

    @Test
    public void setObject(){
        Person person = new Person("nihao","xxx");
        String result = person.toString();
        redisService.set("xinxi",result);
    }

    @Test
    public void getObject(){
        String result = redisService.get("redis_obj_test");
        System.out.println(result);
    }

    @Test
    public void setList(){
        Person person1 = new Person("qwe","ewq");
        Person person2 = new Person("asd","dsa");
        Person person3 = new Person("zxc","cxz");
        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        redisService.set("redis_list_test",list.toString());
        System.out.println("插入成功");///
    }

    @Test
    public void getList(){
        String result = redisService.get("redis_list_test");
        System.out.println(result);
    }

    @Test
    public void remove(){
        redisService.remove("empTest");
        System.out.println("删除成功");
    }

    @Test
    public  void  getEmp(){
        String emp = redisService.get("emp");
        System.out.println(emp);

    }

    @Test
    public void SetEmp(){
        System.out.println("-------------------------------");
        List<Emp> list = empService.queryEmp();
        System.out.println("===============================");
        redisService.set("empTest",list.toString());
        System.out.println("添加成功");
        String result = redisService.get("empTest");
        System.out.println(result);
    }

    @Test
    public void TimeOut(){
        redisService.expire("empTest",5);
    }

    @Test
    public void Test(){
        String result = redisService.get("empTest");
        System.out.println(result);
    }

}
