package com.huike.clues.mapper;

import java.util.List;
import java.util.Map;

import com.huike.clues.domain.TbActivity;
import org.apache.ibatis.annotations.Param;

/**
 * 活动管理Mapper接口
 */
public interface TbActivityMapper {

    /**
     * 查询活动管理
     */
    public TbActivity selectTbActivityById(Long id);

    public TbActivity selectTbActivityByCode(@Param("code") String code);


    /**
     * 查询活动管理列表
     */
    public List<TbActivity> selectTbActivityList(TbActivity tbActivity);

    public List<String> selectAllCode();

    /**
     * 新增活动管理
     */
    public int insertTbActivity(TbActivity tbActivity);

    /**
     * 修改活动管理
     */
    public int updateTbActivity(TbActivity tbActivity);

    /**
     * 删除活动管理
     */
    public int deleteTbActivityById(Long id);

    /**
     * 批量删除活动管理
     */
    public int deleteTbActivityByIds(Long[] ids);

    public Map getCountByStatus();
}
