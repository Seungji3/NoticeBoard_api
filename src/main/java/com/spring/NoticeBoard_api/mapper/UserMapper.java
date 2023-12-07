package com.spring.NoticeBoard_api.mapper;

import com.spring.NoticeBoard_api.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    List<UserVo> getAllUser();

    UserVo addUser(String name);

    UserVo updateUser(@Param("id") int id, @Param("name") String name);

    UserVo deleteUserById(int id);
}
