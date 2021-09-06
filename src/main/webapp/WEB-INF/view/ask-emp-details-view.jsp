<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Dear Employee, Please enter your details</h2>
<br>
<br>
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"></form:input>
    <br><br>
    Surname <form:input path="surname"></form:input>
    <br><br>
    Salary <form:input path="salary"></form:input>
    <br><br>
    Department <form:select path="department">
<%--        <form:option value="Information Technology" label="IT"></form:option>--%>
<%--        <form:option value="Human Resources" label="HR"></form:option>--%>
<%--        <form:option value="Sales" label="SALES"></form:option>--%>
        <form:options items="${employee.departments}"></form:options>
    </form:select>
    <br><br>
    Which car do you want?
<%--    BMW <form:radiobutton path="carBrand" value="BMW"></form:radiobutton>--%>
<%--    Opel <form:radiobutton path="carBrand" value="Opel"></form:radiobutton>--%>
<%--    Mazda <form:radiobutton path="carBrand" value="Mazda"></form:radiobutton>--%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"></form:radiobuttons>
    <br><br>
    Foreign Language(s)
<%--    EN <form:checkbox path="languages" value="English"></form:checkbox>--%>
<%--    DE <form:checkbox path="languages" value="Deutch"></form:checkbox>--%>
<%--    FR <form:checkbox path="languages" value="French"></form:checkbox>--%>
    <form:checkboxes path="languages" items="${employee.langMap}"></form:checkboxes>
    <br><br>
    <input type="submit" value="OK">
</form:form>
<%--<form action="showDetails" method="get">--%>
<%--    <input type="text" name="employeeName" placeholder="write your name here">--%>
<%--    <input type="submit">--%>
<%--</form>--%>
</body>
</html>
