package com.spring.NoticeBoard_api.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NoticeVo {
    private int id;
    private int userId;
    private String title;
    private String subTitle;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
