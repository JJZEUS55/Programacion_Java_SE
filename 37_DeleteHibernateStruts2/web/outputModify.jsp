<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome Page</title>
</head>
<body>
    <s:iterator value="lista1">
        <s:url action="modify.action" var="url">
            <s:param name="id">
                <s:property value="idLogin" />
            </s:param>
        </s:url>
        <s:property value="username" /> <a href="<s:property value="#url" />">Modificar</a> <br />
    </s:iterator>
</body>
</html>