package test;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {

    @Update({"INSERT INTO tb_user (id,name) VALUES (#{id},#{name}) " +
            "ON CONFLICT (id) DO UPDATE SET name=#{name}"})
    int merge(User user);
}
