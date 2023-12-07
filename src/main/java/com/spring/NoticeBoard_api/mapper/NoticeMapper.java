package com.spring.NoticeBoard_api.mapper;

import com.spring.NoticeBoard_api.vo.NoticeVo;
import jakarta.annotation.Nullable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface NoticeMapper {
    List<NoticeVo> getAllNotice();

    List<NoticeVo> getAllNoticeById(int id);

    NoticeVo addNotice(@Param("userId") int userId, @Param("title") String title, @Param("subTitle") @Nullable String subTitle, @Param("createDate") LocalDateTime createDate);

    NoticeVo updateNoticeById(@Param("id") int id, @Param("title") @Nullable String title, @Param("subTitle") @Nullable String subTitle, @Param("updateDate") LocalDateTime updateDate);

    NoticeVo deleteNoticeById(@Param("id") int id);
}
