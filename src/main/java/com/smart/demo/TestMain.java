package com.smart.demo;

import com.smart.demo.entity.User;
import com.smart.demo.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMain {
    /**
     * mybatis
     * 1. 工厂模式
     * 2 . 构建者模式
     *
     * @param args
     */
    public static void main(String[] args) {
        //创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(
                TestMain.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );
        SqlSession sqlSession = factory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectByName("admin");
        System.out.println(user.toString());
    }
}
