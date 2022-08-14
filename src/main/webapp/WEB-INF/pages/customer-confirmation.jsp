<jsp:useBean id="customer" scope="request" type="com.spring.demo.springmvcjspdemo.model.Customer"/>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta CHARSET="UTF-8">
    <title>Customer confirmation</title>
</head>

<body>
The customer is confirmed: ${customer.firstName} ${customer.lastName}

<br><br>

Free passes: ${customer.freePasses}

<br><br>

Postal code: ${customer.postalCode}

<br><br>

Course: ${customer.course}

</body>
</html>