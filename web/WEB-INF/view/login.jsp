<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>学生信息管理系统</title>
<script type="text/javascript" src="jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<link type="text/css" rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<link type="text/css" rel="stylesheet" href="bootstrap/css/bootstrap-theme.min.css">
<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/signin.css">
<style type="text/css">
h2{
	text-align: center;
}
form{
	z-index: 5;
}
</style>
</head>
<body>
	<div id="background" class="wall" ></div>
	<div id="midground" class="wall"></div>
	<div id="foreground" class="wall"></div>
	<div id="top" class="wall"></div>
	<audio controls autoplay>
		<source src="mp3/yinyue.mp3">
	</audio>
	<div class="container">
		<form class="form-signin" action="" method="post">
			<h2 class="form-signin-heading">Please sign in</h2>
			<div class="form-group">
				<label for="inputEmail" class="control-label">Email:</label>
		        <input type="email" name="email" id="inputEmail" class="col-md-10 form-control" placeholder="Email address" required autofocus>
			</div>
			<div class="form-group">
		        <label for="inputPassword" class="control-label">Password:</label>
		        <input type="password" name="password" id="inputPassword" class="form-control" placeholder="Password" required>
			</div>
	        <div class="checkbox">
	          <label>
	            <input type="checkbox" name="rememberMe" value="remember-me"> Remember me
	          </label>
	        </div>
	        <button class="btn btn-lg btn-info btn-block" type="submit">Sign in</button>
		</form>
		
		
		
		
		
		
		<!-- <div id="" class="panel panel-default">
			<div id="title" class="panel-heading">
				<h3 class="panel-title">学生信息管理系统</h3>
			</div>
			<div class="panel-body">
				<form role="form-horizontal" method="post">
					<div class="form-group">
						<label for="account" class="col-md-2 control-label">账户：</label>
						<div class="col-md-10">
							 <input type="text" id="account" name="account" class="form-control" placeholder="请输入账户">
						</div>
					</div>
					<div class="form-group">
						<label for="pass" class="col-md-2 control-label">密码：</label>
						<div class="col-md-10">
							 <input type="password" id="pass" name="pass" class="form-control" placeholder="请输入密码">
						</div>
					</div>
					<div class="form-group">
						<button type="submit" class="btn btn-block btn-info" value="提交"> 提交</button>
					</div>
				</form>
			</div>
		</div> -->
	</div>
</body>
</html>