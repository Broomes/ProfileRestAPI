<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Profile Admin Dashboard</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>

<h2>Admin Dashboard</h2>

<form:form action="processForm" modelAttribute="profile">
    <div class="form-group">
        <label>First Name</label>
        <form:input  path="firstName" type="text" class="form-control" placeholder="First Name" />
        <small id="emailHelp" class="form-text text-muted">Required</small>
    </div>
    <div class="form-group">
        <label>Last Name</label>
        <form:input path="lastName" type="text" class="form-control" placeholder="Last Name" />
    </div>
    <div class="form-group">
        <label>Email</label>
        <form:input path="email" type="text" class="form-control" placeholder="Email" />
    </div>
    <div class="form-group">
        <label>Title</label>
        <form:input path="title" type="text" class="form-control" placeholder="Current Title" />
    </div>
    <div class="form-group">
        <label>Description</label>
        <form:input path="description" type="text" class="form-control" placeholder="Title Description" />
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form:form>

</body>
</html>
