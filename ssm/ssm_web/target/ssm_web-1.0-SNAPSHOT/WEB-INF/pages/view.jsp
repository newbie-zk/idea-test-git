<%--
  Created by IntelliJ IDEA.
  User: xiaox
  Date: 2020/6/21
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>显示</title>
</head>
<body>
    <c:forEach var="product" items="${product}">
        ${product.productNum}&nbsp;&nbsp;
        ${product.productName}<br>
    </c:forEach>
</body>
</html>
