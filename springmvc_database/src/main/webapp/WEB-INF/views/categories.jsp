<%-- 
    Document   : categories
    Created on : Aug 4, 2026, 9:54:05 AM
    Author     : minhloan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Categories</title>
    </head>
    <body>
        <h1>Categories</h1>
        <h3>List</h3>
        <table border="1">
            <tr><th>ID</th><th>Name</th><th>Description</th><th>Actions</th></tr>
                    <c:forEach items="${list}" var="c">
                <tr>
                    <td>${c.categoryID}</td>
                    <td>${c.categoryName}</td>
                    <td>${c.description}</td>
                    <td>
                        <a href="categories/edit?id=${c.categoryID}">Edit</a> |
                        <a href="categories/delete?id=${c.categoryID}" onclick="return confirm('Delete?')">Delete</a>                       
                    </td>
                </tr>
            </c:forEach>
        </table>

    </body>
</html>
