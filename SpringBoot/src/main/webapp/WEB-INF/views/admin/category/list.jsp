<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html xmlns:th="https://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Category List</title>
</head>
<body>

<a th:href="@{/admin/category/add/{id}(id=${cate.id})}">Thêm</a>
<table border="1">
    <thead>
        <tr>
            <th>STT</th>
            <th>Name</th>
            <th>Image</th>
            <th>Status</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <tr th:each="cate, status : ${list}">
            <td th:text="${cate.id}"></td>
            <td th:text="${cate.name}"></td>
            <td th:text="${cate.image}"></td>
            <td th:text="${cate.status}"></td>
            <td>
                <a th:href="@{/admin/category/edit(id=${cate.id})}">Sửa</a>
                <a th:href="@{/admin/category/delete(id=${cate.id})}">Xóa</a>
            </td>
        </tr>
    </tbody>
</table>

</body>
</html>
