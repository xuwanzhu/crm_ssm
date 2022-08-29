package com.qidi.crm_ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qidi.crm_ssm.bean.SysUser;
import com.qidi.crm_ssm.dao.SysUserDao;
import com.qidi.crm_ssm.service.SysUserService;

@Service("sysUserService")
public class SysUserServiceImple implements SysUserService{

	@Resource(name = "sysUserDao")
	private SysUserDao sysUserDao;
	
	@Override
	public String login(String userCode, String password) {
		// TODO Auto-generated method stub
		SysUser user = sysUserDao.getByCode(userCode);
		//查询到用户 且用户密码正确
		if(user != null) {
			if(password.equals(user.getUser_password())) {
				return user.getUser_name();
			}
		}
		return null;
	}

	@Override
	public List<SysUser> getAll() {
		// TODO Auto-generated method stub
		return sysUserDao.getAll();
	}

	//单个用户
	@Override
	public SysUser getOne(int user_id) {
		// TODO Auto-generated method stub
		return sysUserDao.getOne(user_id);
	}

	//更新
	@Override
	public void updateUser(SysUser sysUser) {
		// TODO Auto-generated method stub
		sysUserDao.updateUser(sysUser);
	}

	//模糊查询
	@Override
	public List<SysUser> queryLike(String user_name) {
		// TODO Auto-generated method stub
		return sysUserDao.queryLike(user_name);
	}

	//删除用户
	@Override
	public void deleteUser(int user_id) {
		// TODO Auto-generated method stub
		sysUserDao.deleteUser(user_id);
	}

	//新增用户
	@Override
	public void addUser(SysUser sysUser) {
		// TODO Auto-generated method stub
		sysUserDao.addUser(sysUser);
	}

	//注册
	@Override
	public String register(String userCode, String password) {
		SysUser user = sysUserDao.getByCode(userCode); //判断用户是否已注册过
		String userName = userCode;
		if(user == null) { //没有人注册过
			
			//将用户添加到数据库
			sysUserDao.addSySUser(userCode,password,userName,"0");
			
			System.out.println("userCode:"+userCode+"password:"+password+"userName:"+userName);
			//添加成功
			return userName;
						
		}
		return null;
	}
	
}
