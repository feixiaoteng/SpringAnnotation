package com.fei.mybatis;

import com.fei.mybatis.dao.UsersDao;
import com.fei.mybatis.entity.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * @author feixiaoteng
 * @create 2019-06-25 10:08
 */
public class Application {
    public static void main(String[] args) throws  Exception{
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml"));
        SqlSession session =  sqlSessionFactory.openSession(true);
        UsersDao usersDao = session.getMapper(UsersDao.class);
        //System.out.println(ud.findById(1l));
        /*Users users = new Users("15269178123","代腾飞","m15269178123@163.com","123456");
        System.out.println(ud.insert(users));
        System.out.println(users.getId());*/
        /*System.out.println(ud.findByMobileAndName("17693636789","代腾飞"));*/
      /*  Map<String,Object> params = new HashMap<>();
        params.put("name","代腾飞");
        params.put("mobile","17693636789");
        System.out.println(usersDao.findByMap(params));*/
        System.out.println(usersDao.findMapByName("代腾飞"));
    }
}
