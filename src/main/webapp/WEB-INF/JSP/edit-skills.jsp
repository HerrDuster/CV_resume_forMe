<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>edit-skills</title>
</head>
<body>
<select var="category" class="form-control">
    <c:forEach var="category" items="${skillCategory}">
        <option value="${category.id}">${category.category}</option>
    </c:forEach>
</select>
</body>
</html>
