package com.example.userservice.mapper;

import com.example.userservice.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {


    @Select("select * from tb_user where id = #{id}")
    User selectOne(Long id);


    @Insert("insert into tb_user (username, address) values(#{username}, #{address})")
    int insert(User user);
}
