<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
	
	<p> เลขที่ใบแจ้งความนำจับ : ${noticeId.noticeNumber}</p>
	
	<table width="1200" border="0" cellspacing="3" cellpadding="3">
	  <tr>
	    <td><table width="1200" border="1" cellspacing="0" cellpadding="0">
	      <tr>
	        <td><table width="1197" border="0" cellspacing="2" cellpadding="2">
	          <tr>
	            <td colspan="6">ผู้รับแจ้งความ</td>
              </tr>
	          <tr>
	            <td width="149"></td>
	            <td width="176" align="right">เขียนที่หน่วยงาน :</td>
	            <td width="122"><input type="text" value="00500" size="15" readonly></td>
	            <td width="209">${noticeId.department}</td>
	            <td width="258" align="right">ผู้รับแจ้งความนำจับ :</td>
	            <td width="245">${noticeId.inform.informName} ${noticeId.inform.informSurname}</td>
              </tr>
	          <tr>
	            <td></td>
	            <td align="right">วันที่ :</td>
	            <td>${noticeId.noticedate}</td>
	            <td>&nbsp;</td>
	            <td align="right">ตำแหน่ง :</td>
	            <td><input type="text" value="เจ้าหน้าที่สรรพสามิต" size="35" readonly></td>
              </tr>
	          <tr>
	            <td></td>
	            <td align="right">เวลา :</td>
	            <td>${noticeId.noticetime}</td>
	            <td>&nbsp;</td>
	            <td align="right">สังกัด :</td>
	            <td><input type="text" value="ศูนย์เทคโนโลยีสารสนเทศ" size="35" readonly></td>
              </tr>
	          <tr>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
              </tr>
            </table></td>
          </tr>
        </table></td>
      </tr>
	  <tr>
	    <td><table width="1200" border="1" cellspacing="0" cellpadding="0">
	      <tr>
	        <td><table width="1197" border="0" cellspacing="2" cellpadding="2">
	          <tr>
	            <td colspan="6">รายละเอียดผู้แจ้งความ</td>
              </tr>
	          <tr>
	            <td width="100"></td>
	            <td width="183" align="right">ผู้แจ้งความ :</td>
	            <td width="190"><form name="form1" method="post" action="">
	              <input type="radio" name="radio" id="radio" value="radio">
	              <label for="radio"></label>  สายลับ(ขอปิดนาม)
	            </form></td>
	            <td width="171"><form name="form2" method="post" action="">
	              <input type="radio" name="radio2" id="radio2" value="radio2">
	              <label for="radio2"></label>  ระบุชื่อ
	            </form></td>
	            <td width="237" align="right">ที่อยู่ :</td>
	            <td width="278"><input type="text" value="32/2 อำเภอ บางคูวัด" size="35" readonly></td>
              </tr>
	          <tr>
	            <td></td>
	            <td align="right">ชื่อ (นามแฝง) ผู้แจ้ง :</td>
	            <td><input type="text" value="ชาญชัย ใจกล้า" size="30" readonly></td>
	            <td>&nbsp;</td>
	            <td align="right">จังหวัด/อำเภอ/ตำบลที่เกิดเหตุ</td>
	            <td><input type="text" value="นครสวรรค์/ท่าอดิศร/บางคูวัด" size="35" readonly></td>
              </tr>
	          <tr>
	            <td></td>
	            <td align="right">อายุผู้แจ้ง :</td>
	            <td><input type="text" value="38" size="15" readonly></td>
	            <td>&nbsp;</td>
	            <td align="right"></td>
	            <td></td>
              </tr>
	          <tr>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
              </tr>
            </table></td>
          </tr>
        </table></td>
      </tr>
	  <tr>
	    <td><table width="1200" border="1" cellspacing="0" cellpadding="0">
	      <tr>
	        <td><table width="1197" border="0" cellspacing="2" cellpadding="2">
	          <tr>
	            <td colspan="6">รายละเอียดผู้กระทำผิด</td>
              </tr>
	          <tr>
	            <td width="100"></td>
	            <td colspan="5" align="left"><table width="745" border="0" cellspacing="2" cellpadding="2">
	              <tr>
	                <td width="217">จำนวนผู้กระทำความผิด :</td>
	                <td width="165"><input type="text" value="2" size="8" readonly>
	                  คน</td>
	                <td width="309"><form name="form3" method="post" action="">
	                  <input name="checkbox" type="checkbox" id="checkbox" checked>
	                  <label for="checkbox"></label>
	                  ข้อกล่าวหาร่วมกัน
	                </form></td>
	                <td width="28">&nbsp;</td>
	                </tr>
                </table></td>
              </tr>
	          <tr>
	            <td></td>
	            <td width="183" align="right">ชื่อ (นามแฝง) ผู้แจ้ง :</td>
	            <td width="190"><input type="text" value="ชาญชัย ใจกล้า" size="30" readonly></td>
	            <td width="171">&nbsp;</td>
	            <td width="237" align="right">จังหวัด/อำเภอ/ตำบลที่เกิดเหตุ</td>
	            <td width="278"><input type="text" value="นครสวรรค์/ท่าอดิศร/บางคูวัด" size="35" readonly></td>
              </tr>
	          <tr>
	            <td></td>
	            <td align="right">อายุผู้แจ้ง :</td>
	            <td><input type="text" value="38" size="15" readonly></td>
	            <td>&nbsp;</td>
	            <td align="right"></td>
	            <td></td>
              </tr>
	          <tr>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
              </tr>
	          <tr>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
              </tr>
	          <tr>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
              </tr>
	          <tr>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
              </tr>
	          <tr>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
              </tr>
	          <tr>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
              </tr>
	          <tr>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
	            <td>&nbsp;</td>
              </tr>
            </table></td>
          </tr>
        </table></td>
      </tr>
	  <tr>
	    <td><table width="1200" border="1" cellspacing="0" cellpadding="0">
	      <tr>
	        <td>&nbsp;</td>
          </tr>
        </table></td>
      </tr>
	  <tr>
	    <td>&nbsp;</td>
      </tr>
	  <tr>
	    <td>&nbsp;</td>
      </tr>
	  <tr>
	    <td>&nbsp;</td>
      </tr>
	  <tr>
	    <td>&nbsp;</td>
      </tr>
	  <tr>
	    <td>&nbsp;</td>
      </tr>
	  <tr>
	    <td>&nbsp;</td>
      </tr>
	  <tr>
	    <td>&nbsp;</td>
      </tr>
	  <tr>
	    <td>&nbsp;</td>
      </tr>
</table>
	<p>&nbsp;</p>
	<table>
		<tr> 
			<td> xxx1 </td><td>${noticeId.noticeNumber}</td>
			<td> xxx2 </td><td>${noticeId.department}</td>
		</tr>
	</table>

</body>
</html>