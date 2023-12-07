package com.spring.NoticeBoard_api.vo;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class NoticeVo {
    private int id;
    private int userId;
    private String title;
    private String subTitle;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
