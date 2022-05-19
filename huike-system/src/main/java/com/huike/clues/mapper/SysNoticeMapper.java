package com.huike.clues.mapper;

import java.util.List;

import com.huike.clues.domain.SysNotice;
import org.apache.ibatis.annotations.Param;

/**
 * 通知公告表 数据层
 */
public interface SysNoticeMapper {
    /**
     * 查询公告信息
     *
     * @param noticeId 公告ID
     * @return 公告信息
     */
    public SysNotice selectNoticeById(Long noticeId);

    /**
     * 查询公告列表
     */
    public List<SysNotice> selectNoticeList(@Param("noticeUserId") Long noticeUserId,
                                            @Param("status") String status);

    /**
     * 新增公告
     *
     * @param notice 公告信息
     * @return 结果
     */
    public int insertNotice(SysNotice notice);


    /**
     * 公告id
     */
    public int updateNoticeRead(@Param("noticeId") Long noticeId);

}
