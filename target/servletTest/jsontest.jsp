<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/7/3
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsonAjax</title>
</head>
<body>
    <div id="container">
        <script>
            //1-创建对象
            var xmlhttp;
            if(window.XMLHttpRequest) {
                xmlhttp = new XMLHttpRequest();
            }else{
                xmlhttp = new ActiveXOBject("Microsoft.XMLHTTP");
            }
            //2-发送ajax请求
            xmlhttp.open("GET", "/userJson", true);
            xmlhttp.send();
            //3-处理响应
            xmlhttp.onreadystatechange = function(){
                if(xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                    var text = xmlhttp.responseText;
                    var json = JSON.parse(text);//把响应体的文本转换为JSON格式
                    var html="";
                    //动态处理每一条JSON
                    for(var i = 0; i < json.length; i ++) {
                        var user = json[i];
                        html = html + "<h1>" + user.username + "</h1>";
                        html = html + "<h2>" + user.id + "&nbsp" + usrer.number + "</h2>";
                        html = html + "<hr/>";
                    }
                    //为id为container的容器添加新创建的html页面
                    document.getElementById("container").innerHTML = html;
                }
            }


        </script>
    </div>

</body>
</html>
