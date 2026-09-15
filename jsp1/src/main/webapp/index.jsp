<html>
<body>
<h1>index.jsp</h1>
<form action="req1" method="get">
value1:<input type="text" name="t1">
<br>
value2:<input type="text" name="t2">
<br>
<input type="submit" name="b1" value="Send">
</form>
ServletContext x=<%= application.getInitParameter("x") %>
<br>
ServletConfig a=<%= config.getInitParameter("a") %>
</body>
</html>