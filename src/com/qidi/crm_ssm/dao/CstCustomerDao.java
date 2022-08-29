package com.qidi.crm_ssm.dao;

import java.util.List;

import com.qidi.crm_ssm.bean.CstCustomer;

public interface CstCustomerDao {
	public List<CstCustomer> getAll();
	
	public void addCust(CstCustomer cstCustomer);
	
	public void deleteCust(int cust_id);
	
	public List<CstCustomer> queryCust(String cust_name);
	
	public void updateCust(CstCustomer cstCustomer);
	
	public List<CstCustomer> queryAllCust();
	
	//综合查询-模糊查询
	public List<CstCustomer> queryCustomer(String cust_name);
	
	public CstCustomer getOne(int cust_id);
}
