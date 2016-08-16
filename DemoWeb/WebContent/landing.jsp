<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.sapient.User,java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel=stylesheet href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.2.3/foundation.css"/>
</head>
<body>
<%
/* String username = request.getParameter("username");
String password = request.getParameter("pwd");
String confirmPassword = request.getParameter("cpwd");

User user = new User(username, password, confirmPassword); */

User user1 = new User("ravi", "test", "test");
User user2 = new User("priya", "sets", "sets");

ArrayList<User> users = new ArrayList<>();
users.add(user1);
users.add(user2);
%>

<table>
<%
 for(User user: users){
%>
<tr>
	<td><%= user.getUsername() %></td>
	<td><%= user.getPassword() %></td>
	<td><%= user.getConfirmPassword() %></td>
</tr>
<%
}
%>
</table>

</body>
</html>