<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/21
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改一条学生信息</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改学生信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/updateStudent" method="post">
        <input type="hidden" name="student_id" value="${newStudent.student_id}">
        <div class="form-group">
            <label>学生姓名：</label>
            <input type="text" name="student_name" class="form-control" value="${newStudent.student_name}" required>
        </div>
        <div class="form-group">
            <label>学生学号：</label>
            <input type="text" name="student_number" class="form-control" value="${newStudent.student_number}" required>
        </div>
        <div class="form-group">
            <label>学生年龄：</label>
            <input type="text" name="student_age" class="form-control" value="${newStudent.student_age}" required>
        </div>
        <div class="form-group">
            <label>学生性别：</label>
            <input type="text" name="student_sex" class="form-control" value="${newStudent.student_sex}" required>
        </div>
        <div class="form-group">
            <label>学生住址：</label>
            <input type="text" name="student_address" class="form-control" value="${newStudent.student_address}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>
</div>
</head>
</body>
</html>
