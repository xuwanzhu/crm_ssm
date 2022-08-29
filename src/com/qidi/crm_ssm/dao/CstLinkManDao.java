package com.qidi.crm_ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.qidi.crm_ssm.bean.CstLinkMan;

public interface CstLinkManDao {
	
	public List<CstLinkMan> getAll();
	
	public CstLinkMan getOne(int lkm_cust_id);
	
	public List<CstLinkMan> getByLike(String lkm_name);
	
	public void updateLink(CstLinkMan cstLinkMan);
	
	public void addLink(CstLinkMan cstLinkMan);
	
	public void deleteLink(int lkm_id);
	
	public List<CstLinkMan> queryLink();
	
	public List<CstLinkMan> queryByLike(String lkm_name);
}
