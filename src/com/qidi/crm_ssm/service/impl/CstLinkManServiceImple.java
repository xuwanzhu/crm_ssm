package com.qidi.crm_ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qidi.crm_ssm.bean.CstLinkMan;
import com.qidi.crm_ssm.dao.CstLinkManDao;
import com.qidi.crm_ssm.service.CstLinkManService;

@Service("cstLinkManService")
public class CstLinkManServiceImple implements CstLinkManService {
	
	@Resource(name = "cstLinkManDao")
	private CstLinkManDao cstLinkManDao;
	
	//查询单个用户
	@Override
	public CstLinkMan getOne(int lkm_cust_id) {
		// TODO Auto-generated method stub
		return cstLinkManDao.getOne(lkm_cust_id);
	}

	//所有联系人
	@Override
	public List<CstLinkMan> getAll() {
		// TODO Auto-generated method stub
		List<CstLinkMan> list = cstLinkManDao.getAll();
		return list;
	}

	//模糊查询
	@Override
	public List<CstLinkMan> getByLike(String lkm_name) {
		// TODO Auto-generated method stub
		List<CstLinkMan> list = cstLinkManDao.getByLike(lkm_name);
		return list;
	}

	//更新联系人
	@Override
	public void updateLink(CstLinkMan cstLinkMan) {
		// TODO Auto-generated method stub
		cstLinkManDao.updateLink(cstLinkMan);
	}

	//新增联系人
	@Override
	public void addLink(CstLinkMan cstLinkMan) {
		// TODO Auto-generated method stub
		cstLinkManDao.addLink(cstLinkMan);
	}

	@Override
	public void deleteLink(int lkm_id) {
		// TODO Auto-generated method stub
		cstLinkManDao.deleteLink(lkm_id);
	}

	//综合查询
	@Override
	public List<CstLinkMan> queryLink() {
		// TODO Auto-generated method stub
		return cstLinkManDao.queryLink();
	}

	//综合查询-模糊查询
	@Override
	public List<CstLinkMan> queryByLike(String lkm_name) {
		// TODO Auto-generated method stub
		return cstLinkManDao.queryByLike(lkm_name);
	}
	
	
}
