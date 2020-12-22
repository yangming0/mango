package com.yang.mango.admin.service;

import java.util.List;

import com.yang.mango.admin.model.SysConfig;
import com.yang.mango.core.service.CurdService;

/**
 * 系统配置管理
 * @author yang
 * @date Jan 13, 2019
 */
public interface SysConfigService extends CurdService<SysConfig> {

	/**
	 * 根据名称查询
	 * @param label
	 * @return
	 */
	List<SysConfig> findByLabel(String label);
}
