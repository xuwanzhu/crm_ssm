package com.qidi.crm_ssm.dao;

import com.qidi.crm_ssm.bean.CstCustomer;

public interface BaseDictDao {
	//新增客户来源
	public void insertSource(CstCustomer cstCustomer);
	//新增客户行业
	public void insertIndustry(CstCustomer cstCustomer);
	//新增客户级别
	public void insertLevel(CstCustomer cstCustomer);
}
