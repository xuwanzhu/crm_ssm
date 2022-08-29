<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>修改客户</TITLE> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
	rel=stylesheet>


<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
	<FORM id=form1 name=form1 action="${pageContext.request.contextPath }/cust/updateCust.do" method=post>
		

		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></TD>
					<TD width="100%" background="${pageContext.request.contextPath }/images/new_020.jpg"
						height=20></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_022.jpg"><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#ffffff>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>当前位置：客户管理 &gt; 修改客户</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						
						<!-- <TABLE id=grid style="BORDER-TOP-WIDTH: 0px; FONT-WEIGHT: normal; BORDER-LEFT-WIDTH: 0px; BORDER-LEFT-COLOR: #cccccc; 
							BORDER-BOTTOM-WIDTH: 0px; BORDER-BOTTOM-COLOR: #cccccc; WIDTH: 100%; BORDER-TOP-COLOR: #cccccc; FONT-STYLE: normal;
							BACKGROUND-COLOR: #cccccc; BORDER-RIGHT-WIDTH: 0px; TEXT-DECORATION: none; BORDER-RIGHT-COLOR: #cccccc"
							cellSpacing=1 cellPadding=2 rules=all border=0>
							<TBODY>
								
							</TBODY>
							
						</TABLE> -->
						<TABLE cellSpacing=0 cellPadding=5  border=0>
							<TR>
								<TD style="font-size: 18px;">客户原数据：</TD>
							</TR>
							<TR style="FONT-WEIGHT: bold; FONT-STYLE: normal; BACKGROUND-COLOR: #eeeeee; TEXT-DECORATION: none">
								<TD>客户名称</TD>
								<TD>客户级别</TD>
								<TD>客户来源</TD>
								<TD>电话</TD>
								<TD>手机</TD>
							</TR>
							<c:choose>
								<c:when test="${list !=null}">
									<c:forEach items="${list }" var="customer">
									<input type="hidden" name="cust_id" value="${customer.cust_id }"/>
										<TR style="FONT-WEIGHT: normal; FONT-STYLE: normal; BACKGROUND-COLOR: white; TEXT-DECORATION: none">
											<TD>${customer.cust_name }</TD>
											<TD>${customer.cust_level.dict_item_name }</TD>
											<TD>${customer.cust_source.dict_item_name }</TD>
											<TD>${customer.cust_phone }</TD>
											<TD>${customer.cust_mobile }</TD>
										</TR>
										<TR><TD style="font-size: 18px; color: red;">修改为：</TD></TR>
							<TR>
								<td>客户名称：</td>
								<td>
								<INPUT class=textbox id=sChannel2 style="WIDTH: 180px" maxLength=50 name="cust_name" value="${customer.cust_name }">
								</td>
								<td>客户级别 ：</td>
										<td>
											<select name="cust_level.dict_id">
												<option value="22">普通客户</option>
												<option value="23">VIP客户</option>
											</select>
										</td>									
								
							</TR>
							
							<TR>
								
								<td>固定电话 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2 style="WIDTH: 180px" maxLength=50 name="cust_phone" value="${customer.cust_phone }">
								</td>
								
								<td>信息来源 ：</td>
								<%-- <c:if test="${customer.cust_industry.dict_id eq '6' }"> --%>
								<td>
									<select name="cust_source.dict_id">
										<option value="6">电话营销</option>
										<option value="7">网络营销</option>
									</select>
								</td>
								<%-- </c:if> --%>
								
							</TR>
							
							<TR>
								<td>移动电话 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2 style="WIDTH: 180px" maxLength=50 name="cust_mobile" value="${customer.cust_mobile }">
								</td>
								<td>所属行业 ：</td>
								<%-- <c:if test="${customer.cust_industry.dict_id eq '1' }"> --%>
									<td>
									<select name="cust_industry.dict_id">
										<option value="1">教育培训</option>
										<option value="2">电子商务</option>
										<option value="3">对外贸易</option>
										<option value="4">酒店旅游</option>
										<option value="5">房地产</option>
									</select>
									</td>
								<%-- </c:if> --%>
							</TR>
							
							<tr>
								<td rowspan=2>
								<INPUT class=button id=sButton2 type=submit value=" 保存 " name=sButton2>
								</td>
							</tr>
									</c:forEach>
								</c:when>
								<c:otherwise>
									<TR style="FONT-WEIGHT: normal; FONT-STYLE: normal; BACKGROUND-COLOR: white; TEXT-DECORATION: none">
										<TD>无客户数据</TD>
											</TR>
								</c:otherwise>
							</c:choose>
							
							
							<%-- <TR>
								<td>客户名称：</td>
								<td>
								<INPUT class=textbox id=sChannel2
											style="WIDTH: 180px" maxLength=50 name="custName" value="${customer.custName }">
								</td>
								<td>客户级别 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="custLevel" value="${customer.custLevel }">
								</td>
							</TR>
							
							<TR>
								<td>信息来源：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="custSource" value="${customer.custSource }">
								</td>
								<td>联系人：</td>
								<td>
								<INPUT class=textbox id=sChannel2 style="WIDTH: 180px" maxLength=50 name="custLinkman" value="${customer.custLinkman }">
								</td>
							</TR>
							<TR>
								
								
								<td>固定电话 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="custPhone" value="${customer.custPhone }">
								</td>
								<td>移动电话 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="custMobile" value="${customer.custMobile }">
								</td>
							</TR>
							
							<TR>
								<td>联系地址 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="custAddress" value="${customerDetail.custAddress }">
								</td>
								<td>邮政编码 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="custZip" value="${customerDetail.custZip }">
								</td>
							</TR>
							<TR>
								<td>客户传真 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="custFax" value="${customerDetail.custFax }">
								</td>
								<td>客户网址 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="custWebsite" value="${customerDetail.custWebsite }">
								</td>
							</TR>
							<tr>
								<td rowspan=2>
								<INPUT class=button id=sButton2 type=submit
														value=" 保存 " name=sButton2>
								</td>
							</tr> --%>
						</TABLE>
						
						
					</TD>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
					<IMG src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg"
						border=0></TD>
					<TD align=middle width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
	</FORM>
</BODY>
</HTML>
