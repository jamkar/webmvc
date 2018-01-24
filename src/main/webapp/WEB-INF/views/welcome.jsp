<%--
  Created by IntelliJ IDEA.
  User: karen
  Date: 9/21/17
  Time: 6:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

    <p>Hello, </p>
    <%--<%= request.getAttribute("name").toString() + " " + request.getAttribute("email").toString() %>--%>

    <c:out value="${name}"/><br>
    <c:out value="${email}"/>

</body>
</html>
