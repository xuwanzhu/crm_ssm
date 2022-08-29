package com.qidi.crm_ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qidi.crm_ssm.bean.CstCustomer;
import com.qidi.crm_ssm.bean.CstLinkMan;
import com.qidi.crm_ssm.service.CstCustomerService;
import com.qidi.crm_ssm.service.CstLinkManService;

@Controller
@RequestMapping("link")
public class CstLinkManController {
	
	@Resource(name = "cstLinkManService")
	private CstLinkManService cstLinkManService;
	
	@Resource(name = "cstCustomerService")
	private CstCustomerService cstCustomerService;
	
	//获取所有联系人信息
	@RequestMapping("getAll.do")
	public String getAll(Model model){
		List<CstLinkMan> list = cstLinkManService.getAll();
		model.addAttribute("list", list);
		return "/jsp/linkman/list.jsp";
	}
	
	//模糊查询
	@RequestMapping("like.do")
	public String getByLike(String lkm_name,Model model) {
		List<CstLinkMan> list = cstLinkManService.getByLike("%"+lkm_name+"%");
		model.addAttribute("list", list);
		return "/jsp/linkman/list.jsp";
	}
	
//	//获取到联系人为空的客户
//	public List<CstCustomer> getSomeCust(){
//		List<CstCustomer> list1 = cstCustomerService.getAll();
//		List<CstCustomer> list2 = null;
//		List<CstLinkMan> linkman = cstLinkManService.getAll();
//		
//		for(CstCustomer c: list1) {
//			for(CstLinkMan cl: linkman) {
//				if(c.getCust_id()==cl.get)
//			}
//		}
//		
//		return null;
//	}
	
	//获取用户信息跳转到更新页面
	@RequestMapping("getLink.do")
	public String getLinke(int lkm_id,Model model) {
		List<CstCustomer> list = cstCustomerService.getAll();
		CstLinkMan linkman = cstLinkManService.getOne(lkm_id);
		model.addAttribute("linkman", linkman);
		model.addAttribute("customer", list);
		return "/jsp/linkman/edit.jsp";
	}
	//更新联系人信息
	@RequestMapping("updateLink.do")
	public String updateLink(CstLinkMan cstLinkMan,Model model) {
		cstLinkManService.updateLink(cstLinkMan);
		List<CstLinkMan> list = cstLinkManService.getAll();
		model.addAttribute("list", list);
		return "/jsp/linkman/list.jsp";
	}
	//去到新增用户页，显示出所有客户
	@RequestMapping("toAddLink.do")
	public String toAddLink(Model model) {
		List<CstCustomer> list = cstCustomerService.getAll();
		model.addAttribute("customer", list);
		return "/jsp/linkman/add.jsp";
	}
	
	//新增联系人
	@RequestMapping("addLink.do")
	public String addLink(CstLinkMan cstLinkMan,Model model) {
		cstLinkManService.addLink(cstLinkMan);
		List<CstLinkMan> list = cstLinkManService.getAll();
		model.addAttribute("list", list);
		return "/jsp/linkman/list.jsp";
	}
	
	//删除联系人
	@RequestMapping("deleteLink.do")
	public String deleteLink(int lkm_id,Model model) {
		cstLinkManService.deleteLink(lkm_id);
		List<CstLinkMan> list = cstLinkManService.getAll();
		model.addAttribute("list", list);
		return "/jsp/linkman/list.jsp";
	}
	
	//综合查询
	@RequestMapping("linkman.do")
	public String queryAllLink(Model model) {
		List<CstLinkMan> list = cstLinkManService.queryLink();
		model.addAttribute("list", list);
		return "/jsp/comprehensive/linkman.jsp";
	}
	//综合查询-模糊查询
	@RequestMapping("queryByLike.do")
	public String queryByLike(String lkm_name,Model model) {
		List<CstLinkMan> list = cstLinkManService.queryByLike("%"+lkm_name+"%");
		model.addAttribute("list", list);
		return "/jsp/comprehensive/linkman.jsp";
	}
}
