<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/6/27
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <!-- Bootstrap -->
<%--
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
--%>
    <link rel="stylesheet" href="css/bootstrap.min.css"
          integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="js/jquery-3.2.1.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="js/bootstrap.min.js"></script>
</head>

<body>
<!-- 布局容器 -->
<div class="container">
    <!-- 行元素 -->
    <div class="row">
        <!-- 列元素 col-xs-数值 col-sm-数值 col-md-数值 col-lg-数值-->
        <div class="col-md-4" style="background-color: red;">4列</div>
        <div class="col-md-8" style="background-color: pink;">8列</div>
    </div>

</div>

<div class="container">
    <h3 style="text-align: center">显示所有联系人</h3>
    <table border="1" class="table table-bordered table-hover"><%--表格--%>
        <tr class="success">
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>籍贯</th>
            <th>QQ</th>
            <th>邮箱</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${list}" var="linkman">
            <tr>
                <td>${linkman.id}</td>
                <td>${linkman.name}</td>
                <td>${linkman.sex}</td>
                <td>${linkman.age}</td>
                <td>${linkman.address}</td>
                <td>${linkman.qq}</td>
                <td>${linkman.email}</td>
                <td><a class="btn btn-default btn-sm" href="修改联系人.html">修改</a>&nbsp;<a class="btn btn-default btn-sm" href="javascript:void(0)" onclick="deleteById(${linkman.id})">删除</a></td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="8" align="center"><a class="btn btn-primary" href="${pageContext.request.contextPath }/add.jsp">添加联系人</a></td>
        </tr>
    </table>
    <div class="container" ><%--表单--%>
        <form class="form-horizontal">
            <div class="form-group">
                <label for="account" class="col-md-3 control-label">账号:</label>
                <div class="col-md-6">
                    <input type="text" class="form-control" id="account" name="account" placeholder="请输入您的账号" autofocus required>
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="col-md-3 control-label">密码:</label>
                <div class="col-md-6">
                    <input type="password" class="form-control" id="password" name="password" placeholder="请输入您的密码" required>
                </div>
            </div>
            <div class="form-group">
                <div class="col-lg-offset-3 col-sm-9">
                    <label><input type="checkbox">记住密码</label>
                </div>
            </div>
            <div class="form-group">
                <div class="col-lg-offset-3 col-sm-9">
                    <button class="btn btn-primary">登录</button>
                </div>
            </div>
        </form>
    </div>
    <script>
        function deleteById(id) {
            var flag = confirm("您确定要删除吗？");
            console.log(flag);
            if (flag){
                location.href="linkManServlet?method=delete&id="+id;
            }
        }
    </script>
</div>
</body>

</html>

