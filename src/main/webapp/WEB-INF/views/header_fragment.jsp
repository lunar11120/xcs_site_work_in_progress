<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<nav class="n1">

	<table cellpadding = "15">
		<tr>
			<td>
				<!-- Logo XCS Site header -->
				<spring:url value="/applicationResources/logoxcs1.jpg"  var="logo1" />
				<img src="${logo1}" />	
			</td>
			<td>
			
			<div class="am_container">	
				<!-- XCS Main menu -->	
				<table>
				
				<tr>
					<td colspan="16"><h2>ระบบบันทึกใบแจ้งความนำจับ : กรมสรรพสามิต</h2></td>
				</tr>
				
				<tr>
					<td>
					<spring:url value="/"  var="home" />				
	      			<a class="navbar-brand" href="${home}"> หน้าแรก </a> 
	    			</td>
	    			
	    			<td>  </td><td> | </td><td>  </td>
	    			
	    			<td>
	    			<spring:url value="/detail"  var="detail" />
	      			<a class="navbar-brand" href="${detail}"> รายละเอียดใบแจ้งความนำจับ </a>
	    			</td>
	    			
	    			<td>  </td><td> | </td><td>  </td>
	    			
	    			<td>
	    			<spring:url value="/add_data"  var="add_data" />
	      			<a class="navbar-brand" href="${add_data}"> เพิ่มข้อมูล </a>
	    			</td>
	    			
	    			<td>  </td><td> | </td><td>  </td>
	    			
	    			<td>
	    			<spring:url value="/edit_page"  var="edit_page" />
	      			<a class="navbar-brand" href="${edit_page}"> จัดการเนื้อหาข้อมูล </a>
	    			</td>
				</tr>			
				</table>  		
			</div>
			
			</td>
		</tr>
	</table>

</nav>