package com.qidi.crm_ssm.service;

import java.util.List;

import com.qidi.crm_ssm.bean.CstLinkMan;

public interface CstLinkManService {
	//客户对应的联系人
	public CstLinkMan getOne(int lkm_cust_id);
	//所有联系人
	public List<CstLinkMan> getAll();
	//模糊查询
	public List<CstLinkMan> getByLike(String lkm_name);
	//更新联系人
	public void updateLink(CstLinkMan cstLinkMan);
	//新增联系人
	public void addLink(CstLinkMan cstLinkMan);
	//删除联系人
	public void deleteLink(int lkm_id);
	//综合查询
	public List<CstLinkMan> queryLink();
	//综合查询-模糊查询
	public List<CstLinkMan> queryByLike(String lkm_name);
}
