<%@ page import="org.dal.demo.report.page.hello.Payload" %>
<%@ page import="org.dal.demo.report.page.hello.Model" %>
<%@ page import="com.google.gson.Gson" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello请求</title>
</head>
<body>
hello请求界面
<%
    Payload payload = (Payload)request.getAttribute("payload") ;
    Model model = (Model)request.getAttribute("model");

    out.println(payload.getPage().getPath());
    out.println("<br/>");
    out.println(model.getDomain());
    out.println("<br/>");
    out.println(model.getData());
%>
</body>
</html>
