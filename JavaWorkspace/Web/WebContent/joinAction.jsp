<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="user.UserDAO"%>
<%@ page import="java.io.PrintWriter"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="user" class="user.User" scope="page" />
<jsp:setProperty name="user" property="userID" />
<jsp:setProperty name="user" property="userPassword" />
<jsp:setProperty name="user" property="userName" />
<jsp:setProperty name="user" property="userGender" />
<jsp:setProperty name="user" property="userEmail" />


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 게시판 웹 사이트</title>
</head>
<body>
	<%
	String userID = null;
	if (session.getAttribute("userID") != null) {
		userID = (String) session.getAttribute("userID");
	}
	if (userID != null) {
		PrintWriter outter = response.getWriter();
		outter.println("<script>");
		outter.println("alert('이미 로그인이 되어 있습니다.')");
		outter.println("location.href = 'main.jsp'");
		outter.println("</script>");
	}

	if (user.getUserID() == null || user.getUserPassword() == null || user.getUserName() == null
			|| user.getUserGender() == null || user.getUserEmail() == null) {
		PrintWriter outter = response.getWriter();
		outter.println("<script>");
		outter.println("alert('입력이 안 된 사항이 있습니다.')");
		outter.println("history.back()");
		outter.println("</script>");
	} else {
		UserDAO userDAO = new UserDAO();
		int result = userDAO.join(user);
		if (result == -1) {
			PrintWriter outter = response.getWriter();
			outter.println("<script>");
			outter.println("alert('이미 존재하는 아이디입니다.')");
			outter.println("history.back()");
			outter.println("</script>");

		} else {
			session.setAttribute("userID", user.getUserID());
			PrintWriter outter = response.getWriter();
			outter.println("<script>");
			outter.println("location.href = 'main.jsp'");
			outter.println("</script>");
		}

	}
	%>

</body>
</html>

