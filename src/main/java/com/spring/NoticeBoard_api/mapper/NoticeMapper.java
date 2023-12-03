package com.spring.NoticeBoard_api.mapper;

import com.spring.NoticeBoard_api.vo.NoticeVo;
import jakarta.annotation.Nullable;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface NoticeMapper {
    List<NoticeVo> getAllNotice();
    List<NoticeVo> getAllNoticeById();

    NoticeVo addNotice(int userId, String title, @Nullable String subTitle, LocalDateTime createDate);

    
}
