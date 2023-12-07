package com.spring.NoticeBoard_api.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserVo {
    private int id;
    private String name;
}
