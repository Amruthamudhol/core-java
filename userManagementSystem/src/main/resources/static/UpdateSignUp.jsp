<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<body>

<h2>Update Signup</h2>

<h1>${message}</h1>

<a href="readAllSignup">Get All Signup</a>
<a href="home">Home</a>

<br><br>

<form action="updateSignup" method="post">

    <label for="userId">User ID:</label>
    <input type="text"
           id="userId"
           name="userId"
           value="${signupDto.userId}"
           readonly>
    <br><br>


    <label for="email">Email:</label>
    <input type="email"
           id="email"
           name="email"
           value="${signupDto.email}"
           required>
    <br><br>


    <label for="password">Password:</label>
    <input type="password"
           id="password"
           name="password"
           value="${signupDto.password}"
           required>
    <br><br>


    <label for="confirmPassword">Confirm Password:</label>
    <input type="password"
           id="confirmPassword"
           name="confirmPassword"
           value="${signupDto.confirmPassword}"
           required>
    <br><br>

    <input type="submit" value="Submit">

</form>

</body>

</html>