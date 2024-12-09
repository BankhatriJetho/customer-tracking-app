<%@ page language="java" contentType="text/html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Transactions</title></head>
<body>
<h2>Transactions</h2>
<table border="1">
<tr>
    <th>ID</th><th>Date</th><th>Amount</th><th>Type</th><th>Description</th>
</tr>
<c:forEach var="tran" items="${transactions}">
<tr>
    <td>${tran.transactionId}</td>
    <td>${tran.transactionDate}</td>
    <td>${tran.amount}</td>
    <td>${tran.type}</td>
    <td>${tran.description}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
