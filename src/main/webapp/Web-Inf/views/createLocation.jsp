<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" charset="UTF-8">
    <title>Create Location</title>
</head>
<body>
    <form action="saveLocation" method="post">
       <pre>
        Id: <input type="text" name="id" value=""/>
        <br>
        Code: <input type="text" name="code" value=""/>
        <br>
        Name: <input type="text" name="name" value=""/>
        <br>
        Type: Urban <input type="radio" name="type" value="Urban"/>
              Peri-Urban <input type="radio" name="type" value="Peri-Urban"/>
              Rural <input type="radio" name="type" value="Rural"/>
              <br>
        <input type="submit" value="Save">
      </pre>
    </form>
    ${pop_up_msg}
    <br>
    <a href="showLocations">View All</a>
</body>
</html>