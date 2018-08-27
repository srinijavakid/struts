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
        <s:form action="UserAction" >
            <s:textfield name="user.name" label="User Name" />
            <s:textfield name="user.age" label="Age" />
            <s:radio name="user.sex" label="Sex" list="{'M','F'}" />
            <s:checkboxlist name="user.hobby" label="Hobby" list="{'Music','Art','Dance'}" />
            <s:select name="user.country" label="Country" list="{'Select','India','USA','France','Spain'}"  />
            <s:submit />
        </s:form>
    </body>
</html>
