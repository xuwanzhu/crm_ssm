package com.qidi.crm_ssm.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qidi.crm_ssm.bean.CstCustomer;
import com.qidi.crm_ssm.service.CstCustomerService;

@Controller
@RequestMapping("cust")
public class CstCustomerController {
	
	@Resource(name="cstCustomerService")
	private CstCustomerService cstCustomerService;
	
	//获取所有用户
	@RequestMapping("getAll.do")
	public String getAll(Model model) {
		List<CstCustomer> custs = cstCustomerService.getAll();
		model.addAttribute("list", custs);
		return "/jsp/customer/list.jsp";
	}
	
	//新增客户
	@RequestMapping("addCust.do")
	public String addCust(CstCustomer cstCustomer,Model model) {   //cstCustomer 为前台传来的，，model为springmvc用来向前台传值的
		cstCustomerService.addCust(cstCustomer);
		List<CstCustomer> custs = cstCustomerService.getAll();
		
		model.addAttribute("list", custs);
		return "/jsp/customer/list.jsp";
		
		/*   model.addattribute()的作用
			 往前台传数据，可以传对象，可以传List，通过el表达式 ${}可以获取到
			 
			 addAttribute() 函数给 SimpleXML 元素添加一个属性。

			语法
			
			addAttribute(name,value,ns);
			
			name:
			必需。
			规定要添加的属性的名称。
			
			value:
			可选。
			规定属性的值。
			
			ns:
			可选。
			规定属性的命名空间。
		 * */
	}
	
	//删除用户
	@RequestMapping("deleteCust.do")
	public String deleteCust(int cust_id,Model model) {
		cstCustomerService.deleteCust(cust_id);
		List<CstCustomer> custs = cstCustomerService.getAll();
		model.addAttribute("list", custs);
		return "/jsp/customer/list.jsp";
	}
	
	//模糊查询
	//根据用户名进行查询
	@RequestMapping("queryCust.do")
	public String queryCust(String cust_name,Model model) {
		List<CstCustomer> cc = cstCustomerService.queryCust("%"+cust_name+"%");
		model.addAttribute("list", cc);
		return "/jsp/customer/list.jsp";
	}
	
	//通过名字获取客户信息传递到更新页面中
	@RequestMapping("getCust.do")
	public String getCust(String cust_name,Model model) {
		List<CstCustomer> cc = cstCustomerService.queryCust("%"+cust_name+"%");
		model.addAttribute("list", cc);
		return "/jsp/customer/edit.jsp";
	}
	
	//更新用户
	@RequestMapping("updateCust.do")
	public String updateCust(CstCustomer cstCustomer,Model model) {
		cstCustomerService.updateCust(cstCustomer);
		List<CstCustomer> custs = cstCustomerService.getAll();
		model.addAttribute("list", custs);
		return "/jsp/customer/list.jsp";
	}
	
	//综合查询
	@RequestMapping("customer.do")
	public String queryAllCust(Model model) {
		List<CstCustomer> list = cstCustomerService.queryAllCust();
		model.addAttribute("list", list);
		return "/jsp/comprehensive/customer.jsp";
	}
	
	//综合查询-模糊查询
	@RequestMapping("queryCustomer.do")
	public String queryCustomer(String cust_name,Model model) {
		List<CstCustomer> cc = cstCustomerService.queryCustomer("%"+cust_name+"%");
		model.addAttribute("list", cc);
		return "/jsp/comprehensive/customer.jsp";
	}
}
