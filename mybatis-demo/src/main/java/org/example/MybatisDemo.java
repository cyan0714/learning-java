package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisDemo {
    public static void main(String[] args) throws IOException {
//        1. 加载 mybatis 核心配置文件,获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        2. 获取 SqlSession 对象, 用它执行 sql
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        3. 执行 sql
        List<User> users = sqlSession.selectList("test.selectAll");
        System.out.println(users);

//        4. 释放资源
        sqlSession.close();
    }
}
