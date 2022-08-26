package test;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMapper {

    @Update({"INSERT INTO tb_user (id,name) VALUES (#{id},#{name}) " +
            "ON CONFLICT (id) DO UPDATE SET name=#{name}"})
    int merge(User user);

    @Select("select * from tb_user")
    List<User> list();
}
