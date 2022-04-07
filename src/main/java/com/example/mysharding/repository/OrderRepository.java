package com.example.mysharding.repository;

import com.example.mysharding.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author 罗集强
 * @Date 2022/4/6 16:07
 */
@Mapper
@Repository
public interface OrderRepository {
    @Insert("insert into t_order(price,user_id,status)values(#{price},#{userId},#{status})")
    int saveOrder(Order order);
}
