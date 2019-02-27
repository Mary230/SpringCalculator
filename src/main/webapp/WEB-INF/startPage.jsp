<%--
  Created by IntelliJ IDEA.
  User: bmacha
  Date: 2019-02-26
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="calculate" method="get">
        <input type="number" name="first" value="0" autofocus>
        <select name="sign">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">÷</option>
        </select>
        <input type="number" name="second" value="0">

        <input type="submit" value="Посчитать">
    </form>
</body>
</html>
