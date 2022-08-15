<%--
  Created by IntelliJ IDEA.
  User: yehorhavryliuk
  Date: 15.08.22
  Time: 00:05
  To change this template use File | Settings | File Templates.
--%>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <meta CHARSET="UTF-8">
    <title>Save Customer</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/add-customer-style.css">

</head>
<body>
<main>
    <div id="wrapper">
        <section id="header">
            <h2>CRM - Customer Relationship Manager</h2>
        </section>
        <section id="container">
            <h3>Save Customer</h3>

            <form:form action="updateCustomer" modelAttribute="customer" method="post">

                <form:hidden path="id"/>

                <table>
                    <tr>
                        <td><label>First Name:</label></td>
                        <td><form:input path="firstName"/></td>
                    </tr>
                    <tr>
                        <td><label>Last Name:</label></td>
                        <td><form:input path="lastName"/></td>
                    </tr>
                    <tr>
                        <td><label>Email:</label></td>
                        <td><form:input path="email"/></td>
                    </tr>
                    <tr>
                        <td><label></label></td>
                        <td><input type="submit" value="Save" class="save"/></td>
                    </tr>
                </table>
            </form:form>

            <div>
                <a href="${pageContext.request.contextPath}/customer/list">Back to List </a>
            </div>
        </section>
    </div>
</main>
</body>
</html>
