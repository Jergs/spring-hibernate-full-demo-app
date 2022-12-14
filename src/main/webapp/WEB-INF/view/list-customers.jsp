<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta CHARSET="UTF-8">
    <title>List Customers</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>

<body>
<main>
    <div id="wrapper">
        <section id="header">
            <h2>CRM - Customer Relationship Manager</h2>
        </section>

        <section id="container">
            <div id="content">

                <input value="Add Customer" type="button"
                       onclick="window.location.href='showFormForAdd'; return false;" class="add-button"/>

                <table>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                        <th>Action</th>
                    </tr>
                    <c:forEach var="customer" items="${customers}">

                        <c:url var="updateLink" value="/customer/showFormForUpdate">
                            <c:param name="customerId" value="${customer.id}"/>
                        </c:url>

                        <c:url var="deleteLink" value="/customer/delete">
                            <c:param name="customerId" value="${customer.id}"/>
                        </c:url>

                        <tr>
                            <td>${customer.firstName}</td>
                            <td>${customer.lastName}</td>
                            <td>${customer.email}</td>
                            <td>
                                <a href="${updateLink}">Update</a>
                                |
                                <a href="${deleteLink}">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </section>
    </div>
</main>
</body>
</html>