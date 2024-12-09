<%@ page language="java" contentType="text/html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Admin Login</title></head>
<body>
<h2>Admin Login</h2>
<c:if test="${not empty errorMessage}">
    <div style="color:red">${errorMessage}</div>
</c:if>
<form action="${pageContext.request.contextPath}/login" method="post">
    <label>Username:</label><input type="text" name="username" required><br>
    <label>Password:</label><input type="password" name="password" required><br>
    <input type="submit" value="Login">
</form>
</body>
</html>
