<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/6/26
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>系统登陆</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/my.css">
    <!-- Bootstrap -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="js/jquery-3.2.1.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="js/bootstrap.min.js"></script>



    <script type="text/javascript">

    </script>
</head>
<body class="login_bg">
<section class="loginBox" class="up">

    <!--表单 登录页面-->
    <div class="container " style="margin-top: 100px" >
        <form class="form-horizontal boarder left" name="form1"
              action="${pageContext.request.contextPath}/login"  method="get">
            <div class="info">${error}</div><%--显示错误信息--%>
            <div class="form-group "style="padding-left: 50px">
                <label for="username" class="col-md-3 control-label">账号:</label>
                <div class="col-md-4">
                    <input type="text" class="form-control" id="username" name="username"  placeholder="请输入您的账号" autofocus required>
                </div>
            </div>
            <div class="form-group" style="padding-left: 50px">
                <label for="password" class="col-md-3 control-label">密码:</label>
                <div class="col-md-4">
                    <input type="password" class="form-control" id="password" name="password" placeholder="请输入您的密码" required>
                </div>
            </div>
            <div class="form-group">
                <div class="col-lg-offset-3 col-sm-12">
                    <label><input type="checkbox">记住密码</label>
                </div>
            </div>
            <div class="form-group">
                <div class="col-lg-offset-4 col-sm-9" style="padding-left: 50px">
                    <button class="btn btn-primary "  style="width: 100px;color: #4cae4c" id="btn" onclick="check()">登录</button>
                </div>
            </div>
        </form>
    </div>

</section>

<script>

    function check() {
        var user=document.getElementById("username");
        var psw=document.getElementById("password");
        console.log("调用check方法");
        if (user==null||psw==null) alert("用户和密码不能为空！")
    }

</script>
</body>
</html>
