package com.qidi.crm_ssm.bean;

public class CstCustomer {
	private int cust_id;//客户编号
	private String cust_name;//客户名称
	private String cust_phone;//固定电话
	private String cust_mobile;//移动电话
	private String cust_image;//
	
	private BaseDict cust_source;//客户信息来源
	private BaseDict cust_industry;//客户所属行业
	private BaseDict cust_level;//客户级别
	private BaseDict cust_company;//公司性质
	private BaseDict cust_money;//公司年营业额
	
	private CstLinkMan cstLinkMan;
	
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
	public String getCust_mobile() {
		return cust_mobile;
	}
	public void setCust_mobile(String cust_mobile) {
		this.cust_mobile = cust_mobile;
	}
	public String getCust_image() {
		return cust_image;
	}
	public void setCust_image(String cust_image) {
		this.cust_image = cust_image;
	}
	public BaseDict getCust_source() {
		return cust_source;
	}
	public void setCust_source(BaseDict cust_source) {
		this.cust_source = cust_source;
	}
	public BaseDict getCust_industry() {
		return cust_industry;
	}
	public void setCust_industry(BaseDict cust_industry) {
		this.cust_industry = cust_industry;
	}
	public BaseDict getCust_company() {
		return cust_company;
	}
	public void setCust_company(BaseDict cust_company) {
		this.cust_company = cust_company;
	}
	
	public BaseDict getCust_money() {
		return cust_money;
	}
	public void setCust_money(BaseDict cust_money) {
		this.cust_money = cust_money;
	}
	public BaseDict getCust_level() {
		return cust_level;
	}
	public void setCust_level(BaseDict cust_level) {
		this.cust_level = cust_level;
	}
	
	
	
	public CstLinkMan getCstLinkMan() {
		return cstLinkMan;
	}
	public void setCstLinkMan(CstLinkMan cstLinkMan) {
		this.cstLinkMan = cstLinkMan;
	}
	
	@Override
	public String toString() {
		return "CstCustomer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_phone=" + cust_phone
				+ ", cust_mobile=" + cust_mobile + ", cust_image=" + cust_image + ", cust_source=" + cust_source
				+ ", cust_industry=" + cust_industry + ", cust_level=" + cust_level + ", cust_company=" + cust_company
				+ ", cust_money=" + cust_money + ", cstLinkMan=" + cstLinkMan + "]";
	}
	public CstCustomer(int cust_id, String cust_name, String cust_phone, String cust_mobile, String cust_image,
			BaseDict cust_source, BaseDict cust_industry, BaseDict cust_level, CstLinkMan cstLinkMan) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_phone = cust_phone;
		this.cust_mobile = cust_mobile;
		this.cust_image = cust_image;
		this.cust_source = cust_source;
		this.cust_industry = cust_industry;
		this.cust_level = cust_level;
		this.cstLinkMan = cstLinkMan;
	}
	public CstCustomer() {
		super();
	}
	public CstCustomer(String cust_name, String cust_phone, String cust_mobile, BaseDict cust_source,
			BaseDict cust_industry, BaseDict cust_level) {
		super();
		this.cust_name = cust_name;
		this.cust_phone = cust_phone;
		this.cust_mobile = cust_mobile;
		this.cust_source = cust_source;
		this.cust_industry = cust_industry;
		this.cust_level = cust_level;
	}
	public CstCustomer(int cust_id) {
		super();
		this.cust_id = cust_id;
	}
	public CstCustomer(int cust_id, String cust_name, String cust_phone, String cust_mobile, String cust_image,
			BaseDict cust_source, BaseDict cust_industry, BaseDict cust_level, BaseDict cust_company,
			BaseDict cust_money, CstLinkMan cstLinkMan) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_phone = cust_phone;
		this.cust_mobile = cust_mobile;
		this.cust_image = cust_image;
		this.cust_source = cust_source;
		this.cust_industry = cust_industry;
		this.cust_level = cust_level;
		this.cust_company = cust_company;
		this.cust_money = cust_money;
		this.cstLinkMan = cstLinkMan;
	}
	public CstCustomer(int cust_id, String cust_name) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
	}
	
	
	
}
