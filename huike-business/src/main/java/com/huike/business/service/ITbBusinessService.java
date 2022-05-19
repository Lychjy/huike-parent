package com.huike.business.service;

import java.util.List;
import java.util.Map;

import com.huike.business.domain.TbBusiness;

/**
 * 商机Service接口
 */
public interface ITbBusinessService {
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
     * 批量删除商机
     */
    public int deleteTbBusinessByIds(Long[] ids);

    /**
     * 删除商机信息
     */
    public int deleteTbBusinessById(Long id);

    public String assign(Long[] clueIds, Long userId);

    public String gain(Long[] clueIds, Long userId);

    public int changeBusiness(Long clueId);

    public int updateStatus(Long id, String status);
}
