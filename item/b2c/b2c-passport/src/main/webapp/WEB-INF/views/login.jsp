<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
<base href="<%=request.getContextPath()%>/">
<title>用户登录</title>
<link rel="stylesheet" href="css/base.css" />
<link rel="stylesheet" href="css/global.css" />
<link rel="stylesheet" href="css/login-register.css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/login.js"></script>

</head>
<body>
	<div class="header wrap1000">
		<a href=""><img src="images/logo.png" alt="" /></a>
	</div>

	<div class="main">
		<div class="login-form fr">
			<div class="form-hd">
				<h3>用户登录</h3>
			</div>
			<div class="form-bd">
				<form action="login/login" method="POST">
					<dl>
						<dt>用户名</dt>
						<dd>
							<input type="text" name="username" class="text" />
						</dd>
					</dl>
					<dl>
						<dt>密&nbsp;&nbsp;&nbsp;&nbsp;码</dt>
						<dd>
							<input type="password" name="password" class="text" />
						</dd>
					</dl>
					<dl>
						<dt>验证码</dt>
						<dd>
							<input type="text" name="code" class="text" size="10"
								style="width: 58px;"> <img src="images/code.png" alt=""
								align="absmiddle" style="position: relative; top: -2px;" /> <a
								href="" style="color: #999;">看不清，换一张</a>
						</dd>
					</dl>
					<dl>
						<dt>&nbsp;</dt>
						<dd>
							<input type="button" value="登  录" class="submit" /> <a href=""
								class="forget">忘记密码?</a>
						</dd>
					</dl>
				</form>
				<dl>
					<dt>&nbsp;</dt>
					<dd>
						还不是本站会员？立即 <a href="" class="register">注册</a>
					</dd>
				</dl>
				<dl class="other">
					<dt>&nbsp;</dt>
					<dd>
						<p>您可以用合作伙伴账号登录：</p>
						<a href="" class="qq"></a> <a href="" class="sina"></a>
					</dd>
				</dl>
			</div>
			<div class="form-ft"></div>
		</div>

		<div class="login-form-left fl">
			<img src="images/left.jpg" alt="" />
		</div>
	</div>

	<div class="footer clear wrap1000">
		<p>
			<a href="">首页</a> | <a href="">招聘英才</a> | <a href="">广告合作</a> | <a
				href="">关于ShopCZ</a> | <a href="">联系我们</a>
		</p>
		<p>Copyright 2004-2013 itcast Inc.,All rights reserved.</p>
	</div>


</body>
</html>
