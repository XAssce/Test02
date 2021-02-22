<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/21
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增学生信息</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>新增学生信息</small>
                    </h1>
                </div>
            </div>
        </div>

        <form action="${pageContext.request.contextPath}/addStudent" method="post">
            <div class="form-group">
                <label>学生姓名：</label>
                <input type="text" name="student_name" class="form-control" required>
            </div>
            <div class="form-group">
                <label>学生学号：</label>
                <input type="text" name="student_number" class="form-control" required>
            </div>
            <div class="form-group">
                <label>学生年龄：</label>
                <input type="text" name="student_age" class="form-control" required>
            </div>
            <div class="form-group">
                <label>学生性别：</label>
                <input type="text" name="student_sex" class="form-control" required>
            </div>
            <div class="form-group">
                <label>学生住址：</label>
                <input type="text" name="student_address" class="form-control" required>
            </div>
            <div class="form-group">
                <input type="submit" class="form-control" value="添加">
            </div>
        </form>
    </div>
</body>
</html>
