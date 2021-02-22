
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>这是学生信息主界面</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.js"></script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-12-column">
            <div class="page-header">
                <h1>
                    <small>学生信息系统</small>
                </h1>
            </div>
        </div>

        <div class="row">
            <div class="col-4-column" column>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/toAddStudentPage">新增学生信息</a>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/Student">显示所有学生信息</a>
            </div>

            <div class="col-8-column" column>
                <form class="form-inline" action="${pageContext.request.contextPath}/selectStudentInChoose" method="post" style="float:right">
                    <span style="color: red;font-weight: bold">${error}</span>
                    <input type="text" name="" class="form-control" placeholder="请输入学生学号" style="width: 200px;">
                    <input type="text" name="queryName" class="form-control" placeholder="请输入学生姓名" style="width: 200px;">
                   <%-- <input type="text" name="querySex" class="form-control" placeholder="请输入学生性别" style="width: 200px;">
                    <input type="text" name="queryAge" class="form-control" placeholder="请输入学生年龄" style="width: 200px;">
                    <input type="text" name="queryAddress" class="form-control" placeholder="请输入学生住址" style="width: 200px;">
--%>                    <input type="submit" value="查询" class="btn btn-primary">
                </form>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-12-column">
            <table class="table table-hover table-striped">
                <thead>
                    <tr align="center" style="text-align: center">
                        <th style="text-align: center">学生学号</th>
                        <th style="text-align: center">学生姓名</th>
                        <th style="text-align: center">学生性别</th>
                        <th style="text-align: center">学生年龄</th>
                        <th style="text-align: center">学生住址</th>
                        <th style="text-align: center">操作</th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach var="student" items="${list}">
                        <tr align="center" style="text-align: center">
                            <td>${student.student_number}</td>
                            <td>${student.student_name}</td>
                            <td>${student.student_sex}</td>
                            <td>${student.student_age}</td>
                            <td>${student.student_address}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/deleteStudent/${student.student_id}">删除</a>
                                &nbsp;|&nbsp;
                                <a href="${pageContext.request.contextPath}/toUpStudentPage/${student.student_id}">修改</a>
                            </td>
                        </tr>
                    </c:forEach>

                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
