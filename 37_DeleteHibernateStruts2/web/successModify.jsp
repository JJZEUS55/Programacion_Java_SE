<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>

        <s:form>
            <s:textfield name="id" key="ID" value="url"/>
            <s:textfield name="usuario" key="Usuario" value="username"/>
            <s:textfield name="password" key="Contraseña" value="password"/>
            <s:submit value="Modificar"/>
            <s:actionmessage/>
        </s:form>
    </body>
</html>