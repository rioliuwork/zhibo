package com.zhibo.org.zhibo.mapper;

import com.zhibo.org.zhibo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper  //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface UserMapper {
    User getUserById(Integer id);
}
