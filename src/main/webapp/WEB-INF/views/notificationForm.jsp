<%@ page language="java" contentType="text/html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Send Notification</title></head>
<body>
<h2>Send Notification</h2>
<c:if test="${not empty infoMessage}">
    <div style="color:green">${infoMessage}</div>
</c:if>
<form action="${pageContext.request.contextPath}/notification/send" method="post">
    <label>Email:</label><input type="email" name="email" required><br>
    <label>Message:</label><textarea name="message" required></textarea><br>
    <input type="submit" value="Send">
</form>
</body>
</html>
