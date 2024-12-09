<%@ page language="java" contentType="text/html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Customers</title></head>
<body>
<h2>All Customers</h2>
<table border="1">
<tr>
    <th>ID</th><th>Name</th><th>Email</th><th>Phone</th><th>Address</th><th>Status</th><th>Actions</th>
</tr>
<c:forEach var="cust" items="${customers}">
<tr>
    <td>${cust.customerId}</td>
    <td>${cust.name}</td>
    <td>${cust.email}</td>
    <td>${cust.phone}</td>
    <td>${cust.address}</td>
    <td>${cust.status}</td>
    <td>
       <a href="${pageContext.request.contextPath}/customers/update?id=${cust.customerId}">Update</a> |
       <a href="${pageContext.request.contextPath}/transactions/list?customerId=${cust.customerId}">View Transactions</a>
    </td>
</tr>
</c:forEach>
</table>

<a href="${pageContext.request.contextPath}/notification/send">Send Notification</a>
</body>
</html>
