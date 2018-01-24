<%--
  Created by IntelliJ IDEA.
  User: karen
  Date: 9/21/17
  Time: 1:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

    <h1>Welcome</h1>

    <form action="/welcome" method="post">
        <p>Name: <input type="text" name="name"></p>
        <p>Email: <input type="text" name="email"></p>
        <p><input type="submit" value="Submit"></p>
    </form>

</body>
</html>
