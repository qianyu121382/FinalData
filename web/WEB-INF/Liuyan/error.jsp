<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: HH
  Date: 2023-11-20
  Time: 8:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" href="style.css">
  <title>Title</title>
</head>
<body>
<jsp:useBean id="user" type="test.entity.Account" scope="request"/>
<form action="login.do?method=liuyan" method="post">
  <div align="center" class="center">
    <h2 style="color:red;">请将留言内容控制在5个字以上</h2>
    <p class="top_font">用户登录</p>
    <hr/>
    <div class="input_div">
      <p class="input_name_color"></p>
      <p class="input_name">用户名：</p>
      <input type="text" name="userName" size="20" class="input_style" value=<%=user.getUserName()%> readonly>
    </div>
    <div class="input_div">
      <p class="input_name_color"></p>
      <p class="input_name">留言主题：</p>
      <input type="text" name="topic" size="20" class="input_style" required>
    </div>
    <div class="input_div">
      <p class="input_name">留言内容：</p>
      <textarea name="txt"  rows="5" cols="20" style="margin-top: 10px">
            </textarea>
    </div>
    <p align="center">
      <input type="submit" value="提交" class="button_set" style="margin-top: 50px">
    </p>
  </div>
</form>
</body>
</html>
