<%@ page import="test01.Test" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String test = new Test().execute();
    out.println(test);
%>

</body>
</html>