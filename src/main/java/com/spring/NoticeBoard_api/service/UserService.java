package com.spring.NoticeBoard_api.service;

import com.spring.NoticeBoard_api.mapper.UserMapper;
import com.spring.NoticeBoard_api.vo.UserVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<UserVo> getAllUser(){
        return userMapper.getAllUser();
    }

    public UserVo addUser(String name){

        UserVo user =  userMapper.addUser(name);
        return UserVo.builder()
                .id(user.getId())
                .name(user.getName())
                .build();
    }

    public UserVo updateUser(int id, String name){
        return userMapper.updateUser(id, name);
    }

    public UserVo deleteUserById(int id){
        return userMapper.deleteUserById(id);
    }
}
