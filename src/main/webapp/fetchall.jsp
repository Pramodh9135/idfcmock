<%@page import="com.idfc.dto.BankDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
 <tr>
         <th>id</th>
            <th>name</th>
               <th>phno</th>
                  <th>eamil</th>
                     <th>location</th>
     </tr>
<%
List<BankDto> dto=(List<BankDto>)request.getAttribute("fetchdata");
for(BankDto dto2: dto){
%>
<tr>
<td><%=dto2.getId() %></td>
<td><%=dto2.getName() %></td>
<td><%=dto2.getPhnno() %></td>
<td><%=dto2.getEmail() %></td>
<td><%=dto2.getLocation() %></td>
</tr>
<%} %>
</table>

</body>
</html>