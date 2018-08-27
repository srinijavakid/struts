<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Details</title>
    </head>
    <body>
        <h2>User Details</h2>
        <hr>
        User Name :<s:property value="user.name" /><br>
        Age :<s:property value="user.age" /><br>
        Hobbies :<s:property value="user.hobby" /><br>
        Country :<s:property value="user.country" /><br>
    </body>
</html>
