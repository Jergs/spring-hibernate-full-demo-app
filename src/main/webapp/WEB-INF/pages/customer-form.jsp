<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta CHARSET="UTF-8">
    <title>Customer Form</title>
    <style>
        .error {color:red}
    </style>
</head>

<body>

<i>Fill out the form. Asterisk (*) means required</i>

    <br><br>

    <%--@elvariable id="customer" type="com.spring.demo.springmvcjspdemo.model.Customer"--%>
    <form:form action="processForm" modelAttribute="customer">
        First name: <form:input path="firstName"/>

        <br><br>

        Last Name(*): <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>

        <br><br>

        Free passes: <form:input path="freePasses"/>
        <form:errors path="freePasses" cssClass="error"/>

        <br><br>

        Postal code: <form:input path="postalCode"/>
        <form:errors path="postalCode" cssClass="error"/>

        <br><br>

        Course: <form:input path="course"/>
        <form:errors path="course" cssClass="error"/>

        <br><br>

        <input type="submit" value="Submit">
    </form:form>

</body>
</html>