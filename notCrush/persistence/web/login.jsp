<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>login screen</title>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>

<body>
<h1>${message}</h1>
<form class="form-horizontal" method="post" action="login">
    <div class="form-group">
        <label for="mail" class="col-sm-2 control-label">Email</label>
        <div class="col-sm-4">
            <input type="email" class="form-control" name="email" id="mail" placeholder="Email">
        </div>
    </div>
    <div class="form-group">
        <label for="pass" class="col-sm-2 control-label">Password</label>
        <div class="col-sm-4">
            <input type="password" class="form-control" name="pass" id="pass" placeholder="Password">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-6">
            <div class="checkbox">
                <label>
                    <input type="checkbox"> Remember me
                </label>
            </div>
        </div>
    </div>
    <div class="form-group" action="login.do" method="post" name="login" id="login-form">>
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" value="login" class="btn btn-success">Submit</button>
        </div>
    </div>
</form>
    </table>
</form>
</body>
