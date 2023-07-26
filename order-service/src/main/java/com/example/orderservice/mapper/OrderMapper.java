package com.example.orderservice.mapper;

import com.example.orderservice.domain.Order;
import org.apache.ibatis.annotations.Select;

public interface OrderMapper {

    @Select("select id, user_id userId, name, price, num from tb_order where id = #{id}")
    Order selectById(Long id);
}
