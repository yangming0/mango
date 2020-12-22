package com.yang.mango.admin.service;

import java.util.List;

import com.yang.mango.admin.model.SysDict;
import com.yang.mango.core.service.CurdService;

/**
 * 字典管理
 * @author yang
 * @date Jan 13, 2019
 */
public interface SysDictService extends CurdService<SysDict> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysDict> findByLabel(String label);
}
