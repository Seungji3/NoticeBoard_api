package com.spring.NoticeBoard_api.api;

import com.spring.NoticeBoard_api.service.UserService;
import com.spring.NoticeBoard_api.vo.UserVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "User API")
@RestController
@RequestMapping(UserController.MAPPING_PREFIX)
@RequiredArgsConstructor
@Slf4j
public class UserController {
    public static final String MAPPING_PREFIX ="/User";

    private final UserService userService;

    @Operation(summary = "모든 사용자 추출")
    @GetMapping()
    public ResponseEntity<List<UserVo>> getAllUser(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUser());
    }
    
    @Operation(summary = "사용자 추가")
    @PostMapping()
    public ResponseEntity<UserVo> addUser(String name){
        //todo 값은 넘어가긴 하지만 유형에 맞게 나오지 않아서 오류
        UserVo user = userService.addUser(name);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
