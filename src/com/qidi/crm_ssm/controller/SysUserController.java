package com.qidi.crm_ssm.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qidi.crm_ssm.bean.SysUser;
import com.qidi.crm_ssm.common.URLFunctions;
import com.qidi.crm_ssm.service.SysUserService;

@Controller
@RequestMapping("user")
public class SysUserController {
	
	@Resource(name = "sysUserService")
	private SysUserService sysUserService;
	
	@RequestMapping("login.do")
	public String login(String userCode,String password,HttpServletRequest request,HttpServletResponse response) throws IOException {
		String user_name= sysUserService.login(userCode, password);
		if(user_name != null) {
			//登录成功，把昵称存入到cookie中
			Cookie cookie = new Cookie("qidi_crm_user_name", URLFunctions.encode(user_name, "UTF-8"));
			cookie.setMaxAge(3600*24);
			cookie.setPath("/"); //设置cookie可以在哪里路径下访问
			response.addCookie(cookie);
			System.out.println("===========>>>>cookie:=>"+cookie);
			return "redirect:/jsp/index.jsp";
		}
		System.out.println("++++++++9999++++++==");
		return "redirect:/jsp/login.jsp";
	}
	
	
	@RequestMapping("register.do")
	public String register(String userCode,String password,HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("======userCode:"+userCode+"password:"+password);
		String user_name= sysUserService.register(userCode, password);
		if(user_name != null) {
			System.out.println("====注册成功====");
			return "redirect:/jsp/index.jsp";
		}
		System.out.println("====该账号已存在====");
		return "redirect:/jsp/register.jsp";
	}
	
	
	
	@RequestMapping("exit.do")
	public String exit(HttpServletResponse response) throws IOException {
		Cookie cookie = new Cookie("user_name", "");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		return "redirect:/jsp/login.jsp";
	}
	
	@RequestMapping("getAll.do")
	public String getAll(Model model) {
		List<SysUser> list = sysUserService.getAll();
		model.addAttribute("list", list);
		return "/jsp/system/sysuser.jsp";
	}
	//跳转更新页面，输出值
	@RequestMapping("toUpdate.do")
	public String toUpdate(String user_id,Model model) {
		SysUser sysUser = sysUserService.getOne(Integer.valueOf(user_id));
		model.addAttribute("list", sysUser);
		return "/jsp/system/userUpdate.jsp";
	}
	//更新用户
	@RequestMapping("updateUser.do")
	public String updateUser(SysUser sysUser,Model model) {
		sysUserService.updateUser(sysUser);
		List<SysUser> list = sysUserService.getAll();
		model.addAttribute("list", list);
		return "/jsp/system/sysuser.jsp";
	}
	//模糊查询
	@RequestMapping("queryLike.do")
	public String queryLike(String user_name,Model model) {
		List<SysUser> list = sysUserService.queryLike("%"+user_name+"%");
		model.addAttribute("list", list);
		return "/jsp/system/sysuser.jsp";
	}
	
	//删除用户
	@RequestMapping("deleteUser.do")
	public String deleteUser(int user_id,Model model) {
		sysUserService.deleteUser(user_id);
		List<SysUser> list = sysUserService.getAll();
		model.addAttribute("list", list);
		return "/jsp/system/sysuser.jsp";
	}
	
	@RequestMapping("addUser.do")
	public String addUser(String user_password2,SysUser sysUser,Model model) {
		if(sysUser.getUser_password().equals(user_password2)) {
			sysUserService.addUser(sysUser);
		}
		List<SysUser> list = sysUserService.getAll();
		model.addAttribute("list", list);
		return "/jsp/system/sysuser.jsp";
	}
}
