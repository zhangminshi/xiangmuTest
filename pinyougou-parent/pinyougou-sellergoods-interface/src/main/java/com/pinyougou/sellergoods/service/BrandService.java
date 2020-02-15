package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.pojo.PageResult;
import com.pinyougou.pojo.TbBrand;

/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService {

	public List<TbBrand> findAll();

	public PageResult findPage(int pageNum, int pageSize);
	/**
	 * 增加
	 */
	public void add(TbBrand brand);
    /**
     * 修改
     */
    public void update(TbBrand brand);
    /**
     * 根据ID获取实体
     * @param id
     * @return
     */
    public TbBrand findOne(Long id);

    public void delete(Long [] ids);

    public PageResult findPage(TbBrand brand,int pageNum, int pageSize);
}
