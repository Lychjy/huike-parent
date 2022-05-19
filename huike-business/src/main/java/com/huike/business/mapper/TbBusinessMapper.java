package com.huike.business.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.huike.business.domain.TbBusiness;
import com.huike.clues.domain.vo.IndexStatisticsVo;
import org.apache.ibatis.annotations.Param;

/**
 * 商机Mapper接口
 */
public interface TbBusinessMapper {

    /**
     * 查询商机
     */
    public TbBusiness selectTbBusinessById(Long id);

    /**
     * 查询商机列表
     */
    public List<TbBusiness> selectTbBusinessList(TbBusiness tbBusiness);

    public List<TbBusiness> selectTbBusinessPool(TbBusiness tbBusiness);

    /**
     * 新增商机
     */
    public int insertTbBusiness(TbBusiness tbBusiness);

    /**
     * 修改商机
     */
    public int updateTbBusiness(TbBusiness tbBusiness);

    /**
     * 删除商机
     */
    public int deleteTbBusinessById(Long id);

    /**
     * 批量删除商机
     */
    public int deleteTbBusinessByIds(Long[] ids);

    /**
     * 重新分配商机的状态
     */
    public int resetNextTimeAndStatus(@Param("id") Long id,
                                      @Param("status") String status);

    public int setTransfer(@Param("id") Long id,
                           @Param("status") String status);

    public void updateBusinessEndTimeById(@Param("id") Long id,
                                          @Param("endTime") Date endTime);

}
