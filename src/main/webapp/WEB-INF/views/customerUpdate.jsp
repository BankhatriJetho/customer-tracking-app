<%@ page language="java" contentType="text/html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Update Customer</title></head>
<body>
<h2>Update Customer</h2>

<c:if test="${not empty errorMessage}">
    <div style="color:red">${errorMessage}</div>
</c:if>

<form action="${pageContext.request.contextPath}/customers/update" method="post">
    <input type="hidden" name="customerId" value="${customer.customerId}">
    <label>Name:</label><input type="text" name="name" value="${customer.name}" required><br>
    <label>Email:</label><input type="email" name="email" value="${customer.email}" required><br>
    <label>Phone:</label><input type="text" name="phone" value="${customer.phone}" required><br>
    <label>Address:</label><input type="text" name="address" value="${customer.address}" required><br>
    <label>Status:</label><input type="text" name="status" value="${customer.status}" required><br>
    <input type="submit" value="Update">
</form>
</body>
</html>
