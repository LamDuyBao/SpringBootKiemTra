<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Edit Category</title>
</head>
<body>

<form th:action="@{/admin/category/save}" method="post">
    <input type="hidden" name="id" th:value="${category.id}" />
    
    <label>Category name</label>
    <input type="text" name="name" th:value="${category.name}" />
    <br />

    <label>Image</label>
    <input type="text" name="image" th:value="${category.image}" />
    <br />

    <label>Status</label>
    <input type="text" name="status" th:value="${category.status}" />
    <br />

    <input type="submit" value="Edit" />
</form>

</body>
</html>
