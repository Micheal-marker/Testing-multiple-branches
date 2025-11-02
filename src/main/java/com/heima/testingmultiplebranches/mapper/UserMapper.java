package com.heima.testingmultiplebranches.mapper;

import com.heima.testingmultiplebranches.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User getById(Integer id);


    @Update("update name = '黄毛狮王' where id = #{id}")
    void updateName(Integer id);
}
