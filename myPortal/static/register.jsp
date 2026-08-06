<html>

<head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body class="container mt-4">

<h2>Registration</h2>

<form action="registration" method="post">

<pre>
First Name : <input type="text" name="firstName"/></br>
Last Name  : <input type="text" name="lastName"/></br>
Email   : <input type="email" name="email"/></br>
Phone   : <input type="text" name="phone"/></br>
Age     : <input type="number" name="age"/></br>
City     : <input type="text" name="city"/></br>
State    : <input type="text" name="state"/></br>
Country : <input type="text" name="country"/></br>
Username : <input type="text" name="username"/></br>
Password : <input type="password" name="password"/></br>
<input type="submit" value="Register" class="btn btn-success"/>
</pre>

</form>
<h3 style="color:green">
${message}
</h3>

</body>

</html>