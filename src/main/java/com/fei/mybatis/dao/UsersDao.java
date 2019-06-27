package com.fei.mybatis.dao;

import com.fei.mybatis.entity.Users;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author feixiaoteng
 * @create 2019-06-25 10:37
 */
public interface UsersDao {
    /**
     * 根据id查询对象
     * @param id
     * @return 用户对象
     */
    Users findById(Long id);
    Users findByMobileAndName(@Param("mobile") String mobile,@Param("name") String name);
    Users findByMap(Map<String,Object> maps);
    @MapKey("id")//使用对象的那个属性作为map的key
    Map<Long,Users> findMapByName(String name);
    Long insert(Users u);
}
