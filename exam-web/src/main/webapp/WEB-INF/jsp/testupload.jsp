<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2016/5/10
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="upload" method="post" enctype="multipart/form-data">
  <table>
    <tr>
      <td width="100" align="right">照片：</td>
      <img src="<%=request.getContextPath()%>/resources/image/weixin.png">
      <td><input type="file" name="studentPhoto"/>
        <input type="submit"></td>
    </tr>
  </table>
</form>
</body>
</html>
