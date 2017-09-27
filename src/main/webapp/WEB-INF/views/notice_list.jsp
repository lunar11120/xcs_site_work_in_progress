<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="header_fragment.jsp"></jsp:include>

	<!-- Header Notice List -->
	<table width="1000" border="0">
		<tr>
		  <td width="550"><h4>SC0101 ใบแจ้งความนำจับ : ระบบงานผู้กระทำผิดกฏหมายกรมสรรพสามิต</h4></td>
		  <td width="450">Model : From goNoticeList Method  / Model name : notice_list</td></tr>
	</table>
	<br>

	<table width="1600" border="1" cellspacing="0" cellpadding="0">
	  <tr>
	    <td><table width="1590" border="0" cellspacing="4" cellpadding="4">
	      <tr>
	        <td>ใบแจ้งความนำจับ</td>
	      </tr>
	      <tr>
	        <td><table width="1570" border="1" cellspacing="0" cellpadding="0">
	          <tr>
	            <td><table width="1230" border="0" cellspacing="2" cellpadding="2">
	              <tr>
	                <td width="7">&nbsp;</td>
	                <td width="135">วันที่รับแจ้งความ :</td>
	                <td width="105">09/05/2560</td>
	                <td width="35">ถึง :</td>
	                <td width="92">09/05/2560</td>
	                <td width="138">&nbsp;</td>
	                <td colspan="2" align="right"><table width="595" border="0" align="right" cellpadding="3" cellspacing="3">
	                  <tr>
	                    <td width="84" align="right">ค้นหา :</td>
	                    <td width="400" align="right"><form name="form1" method="post" action="">
	                      <label for="textfield"></label>
	                      <input name="textfield" type="text" id="textfield" size="80" maxlength="80">
	                    </form></td>
	                  </tr>
	                </table></td>
	                <td width="45">&nbsp;</td>
	              </tr>
	              <tr>
	                <td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
	                <td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
	                <td width="37">&nbsp;</td>
	                <td width="612" align="right"><table width="130" border="0" cellspacing="3" cellpadding="3">
	                  <tr>
	                    <td width="54"><form name="form2" method="post" action="">
	                      <input type="submit" name="button" id="button" value="ค้นหา">
	                    </form></td>
	                    <td width="142"><input type="reset" name="button2" id="button2" value="เคลียร์"></td>
	                  </tr>
	                </table></td>
	                <td>&nbsp;</td>
	              </tr>
	              <tr>
	                <td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
	                <td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
	                <td>&nbsp;</td>
	              </tr>
	            </table></td>
	          </tr>
	        </table></td>
	      </tr>
	      <tr>
	        <td><form name="form3" method="post" action="">
	          <input type="submit" name="button3" id="button3" value="เพิ่มใบแจ้งความนำจับ">
	        </form></td>
	      </tr>
	      <tr>
	        <td><table width="1600" border="1" cellspacing="0" cellpadding="0">
	        
	          <tr>
	            <td width="60" align="center" bgcolor="#CCCCCC">del</td>
	            <td width="60" align="center" bgcolor="#CCCCCC">edit</td>
	            <td width="60" align="center" bgcolor="#CCCCCC">print</td>
	            <td width="50" align="center" bgcolor="#CCCCCC">ลำดับ</td>
	            <td width="90" align="center" bgcolor="#CCCCCC">เลขที่</td>
	            <td width="100" bgcolor="#CCCCCC">หน่วยงาน</td>
	            <td width="120" bgcolor="#CCCCCC">วันที่รับแจ้งความ</td>
	            <td width="350" bgcolor="#CCCCCC">ความผิดฐาน</td>
	            <td width="130" bgcolor="#CCCCCC">สินค้า</td>
	            <td width="150" bgcolor="#CCCCCC">ชื่อผู้แจ้ง</td>
	            <td width="150" bgcolor="#CCCCCC">ชื่อผู้กระทำความผิด</td>
	          </tr>
	
	          <!-- Receive Data From Model -->
	          <c:forEach items="${noticelist_model}" var="notice" varStatus="loop">  
	          <tr>
	            <td valign="top" align="center">[Delete]</td>
	            <td valign="top" align="center">[editIcon]</td>
	            <td valign="top" align="center">[Print]</td>
	            <td valign="top" align="center">${loop.index+1}</td>
	            
	            <spring:url value="/noticelist/${notice.nid}" var="noticeId" />
	            <td valign="top" align="center"><a href="${noticeId}">${notice.noticeNumber}</a></td>
	            <td valign="top">${notice.department}</td>
	            <td valign="top">${notice.noticedate}</td>
	            <td valign="top">${notice.indictment.guildBase}</td>          	
	            	
	            	<td valign="top">
	            	<c:forEach items="${notice.line}" var="line" varStatus="loop_c">            		
	            		<!-- show list of Products -->
	            		<c:choose>
						  	 <c:when test="${loop_c.index == 0}"> 
						  		 <span>${line.productName.pname}</span>
						 	 </c:when>
						 	 <c:when test="${loop_c.index > 0}">
							 	   <span>  , ${line.productName.pname}</span>
							  </c:when>
					    </c:choose>		 
	            	</c:forEach>	
	            	</td>
	            		       
	            <td valign="top">${notice.inform.informName} ${notice.inform.informSurname}</td>
	            	
	            	<!-- show list LawBreaker Person -->
	            	<td valign="top">	            	
	            	<c:forEach items="${notice.lawBreakers}" var="lawbreaker" varStatus="loopLB">	            		
	            		<table  border="0">	            		
						  		 <tr><td valign="top">${lawbreaker.firstName} ${lawbreaker.lastName}</td></tr>						 	
						</table>						 
	            	</c:forEach>	
	            	</td>
	            		                                
	          </tr>
	          </c:forEach>
	          
	        </table></td>
	        </tr><tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
	        </table></td>
	  </tr>
	</table>

	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<p>&nbsp;</p>
	
</body>
</html>