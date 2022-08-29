package com.qidi.crm_ssm.bean;


public class CstLinkMan {
	//联系人表
	private int lkm_id;//联系人id
	private String lkm_name;//姓名
	
	private CstCustomer cstCustomer;//对应顾客
	
	
	private String lkm_gender;//性别
	private String lkm_phone;//办公电话
	private String lkm_mobile;//手机
	private String lkm_email;//邮箱
	private String lkm_qq;//qq
	private String lkm_position;//职位
	private String lkm_memo;//备注
	public int getLkm_id() {
		return lkm_id;
	}
	public void setLkm_id(int lkm_id) {
		this.lkm_id = lkm_id;
	}
	public String getLkm_name() {
		return lkm_name;
	}
	public void setLkm_name(String lkm_name) {
		this.lkm_name = lkm_name;
	}
	public CstCustomer getCstCustomer() {
		return cstCustomer;
	}
	public void setCstCustomer(CstCustomer cstCustomer) {
		this.cstCustomer = cstCustomer;
	}
	public String getLkm_gender() {
		return lkm_gender;
	}
	public void setLkm_gender(String lkm_gender) {
		this.lkm_gender = lkm_gender;
	}
	public String getLkm_phone() {
		return lkm_phone;
	}
	public void setLkm_phone(String lkm_phone) {
		this.lkm_phone = lkm_phone;
	}
	public String getLkm_mobile() {
		return lkm_mobile;
	}
	public void setLkm_mobile(String lkm_mobile) {
		this.lkm_mobile = lkm_mobile;
	}
	public String getLkm_email() {
		return lkm_email;
	}
	public void setLkm_email(String lkm_email) {
		this.lkm_email = lkm_email;
	}
	public String getLkm_qq() {
		return lkm_qq;
	}
	public void setLkm_qq(String lkm_qq) {
		this.lkm_qq = lkm_qq;
	}
	public String getLkm_position() {
		return lkm_position;
	}
	public void setLkm_position(String lkm_position) {
		this.lkm_position = lkm_position;
	}
	public String getLkm_memo() {
		return lkm_memo;
	}
	public void setLkm_memo(String lkm_memo) {
		this.lkm_memo = lkm_memo;
	}
	@Override
	public String toString() {
		return "CstLinkMan [lkm_id=" + lkm_id + ", lkm_name=" + lkm_name + ", cstCustomer=" + cstCustomer
				+ ", lkm_gender=" + lkm_gender + ", lkm_phone=" + lkm_phone + ", lkm_mobile=" + lkm_mobile
				+ ", lkm_email=" + lkm_email + ", lkm_qq=" + lkm_qq + ", lkm_position=" + lkm_position + ", lkm_memo="
				+ lkm_memo + "]";
	}
	public CstLinkMan(int lkm_id, String lkm_name, CstCustomer cstCustomer, String lkm_gender, String lkm_phone,
			String lkm_mobile, String lkm_email, String lkm_qq, String lkm_position, String lkm_memo) {
		super();
		this.lkm_id = lkm_id;
		this.lkm_name = lkm_name;
		this.cstCustomer = cstCustomer;
		this.lkm_gender = lkm_gender;
		this.lkm_phone = lkm_phone;
		this.lkm_mobile = lkm_mobile;
		this.lkm_email = lkm_email;
		this.lkm_qq = lkm_qq;
		this.lkm_position = lkm_position;
		this.lkm_memo = lkm_memo;
	}
	public CstLinkMan() {
		super();
	}
	
	
	
}
