<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2></h2>
<h2>Dear Employee, you are WELCOME!</h2>
<br>
<br>
<%--Your name: ${param.employeeName}--%>

<%--Your name: ${nameAttribute}--%>

Your name: ${employee.name}
<br><br>
Your surname: ${employee.surname}
<br><br>
Your salary: ${employee.salary}
<br><br>
Your department: ${employee.department}
<br><br>
Your car: ${employee.carBrand}
<br><br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>
<br><br>
Phone Number: ${employee.phoneNumber}
<br><br>
Email: ${employee.email}
</body>
</html>
