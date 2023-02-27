<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- <%@ page isELIgnored="false" %> -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" charset="UTF-8">
    <title>Display Locations</title>
</head>
<body>
    <h3>Locations: </h3>
    <table border="1">
        <caption align="Right">Locations</caption>
        <tr>
            <th>Id</th>
            <th>Code</th>
            <th>Name</th>
            <th>Type</th>
        </tr>
        <c:forEach items="${locations}" var="location">
            <tr>
                <td>${location.id}</td>
                <td>${location.code}</td>
                <td>${location.name}</td>
                <td>${location.type}</td>
                <td><a href="deleteLocation?id=${location.id}">Delete</a></td>
                <td><a href="editLocation?id=${location.id}">Edit</a></td>

            </tr>
        </c:forEach>
    </table>
        <a href="createLocation">Add Location</a>
        <br>
        <a href="locationReport">View Location Report</a>
</body>