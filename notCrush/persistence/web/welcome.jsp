<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>login screen</title>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>

<body>
<h3></h3>
<ul class="nav nav-tabs" id="myTab">
    <li class="active"><a href="#home">???????</a></li>
    <li><a href="#profile">???????</a></li>
    <li><a href="#messages">?????????</a></li>
    <li><a href="#settings">?????????</a></li>
</ul>

<div class="tab-content">
    <div class="tab-pane active" id="home">...</div>
    <div class="tab-pane" id="profile">...</div>
    <div class="tab-pane" id="messages">...</div>
    <div class="tab-pane" id="settings">...</div>
</div>

<script>
    $(function () {
        $('#myTab a:last').tab('show');
    })
</script>
<%--<ul class="nav nav-pills">--%>
    <%--<li class="active"><a href="#">Link</a></li>--%>
    <%--<li class="dropdown">--%>
        <%--<a class="dropdown-toggle" data-toggle="dropdown" href="#">Menu <b class="caret"></b></a>--%>
        <%--<ul id="menu1" class="dropdown-menu">--%>
            <%--<li><a href="#">Action</a></li>--%>
            <%--<li><a href="#">Another action</a></li>--%>
            <%--<li><a href="#">Link</a></li>--%>
            <%--<li class="divider"></li>--%>
            <%--<li><a href="#">Separate link</a></li>--%>
        <%--</ul>--%>
    </li>
</ul>
</table>
</form>
</body>
