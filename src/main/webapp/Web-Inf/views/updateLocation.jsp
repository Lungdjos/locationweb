<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" charset="UTF-8">
    <title>Update Location</title>
</head>
<body>
    <form action="updateLocation" method="post">
       <pre>
        Id: <input type="text" name="id" value="${location.id}" readonly=true/>
        Code: <input type="text" name="code" value="${location.code}"/>
        Name: <input type="text" name="name" value="${location.name}"/>
        Type: Urban <input type="radio" name="type" value="Urban"${location.type == 'Urban'?'checked':''}/>
              Peri-Urban <input type="radio" name="type" value="Peri-Urban"${location.type == 'Peri-Urban'?'checked':''}/>
              Rural <input type="radio" name="type" value="Rural"${location.type == 'Rural'?'checked':''}/>
        <input type="submit" value="Update">
      </pre>
    </form>
    ${pop_up_msg}
    <br>
</body>
</html>