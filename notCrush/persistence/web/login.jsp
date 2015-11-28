<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>login screen</title>
</head>

<body>
<h1>Please log in</h1>
<form action = "servlet-parameters" method = "GET">
    <table border = "0">

        <tr>
            <td><b>email</b></td>
            <td><input type = "text" name = "email"
                       value = "login" size = "30"/></td>
        </tr>

        <tr>
            <td><b>password</b></td>
            <td><input type = "text" name = "password"
                       value = "pswd" size = "30"/></td>
        </tr>

        <%--<tr>--%>
            <%--<td>Parameter choice</td>--%>
            <%--<td>--%>
                <%--<select name = "possible-result">--%>
                    <%--<option value = "SUCCESS">Success</option>--%>
                    <%--<option value = "ERR-500">ERR-500 Technical error</option>--%>
                    <%--<option value = "ERR-1003">ERR-1003 Requested information is not available</option>--%>
                    <%--<option value = "ERR-1005">ERR-1005 Some other Error</option>--%>
                <%--</select>--%>
            <%--</td>--%>
        <%--</tr>--%>

        <tr>
            <td colspan = "2"><input type = "submit" value = "sign in"/></td>
        </tr>
    </table>
</form>
</body>
