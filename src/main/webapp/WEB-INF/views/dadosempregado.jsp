<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Data</title>
</head>
<body>
    <h1>Employee Data</h1>
    <table>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Username</th>
            <th>Contact</th>
            <th>Address</th>
        </tr>
        <tr>
            <td>${employee.firstName}</td>
            <td>${employee.lastName}</td>
            <td>${employee.username}</td>
            <td>${employee.contact}</td>
            <td>${employee.address}</td>
        </tr>
    </table>
</body>
</html>