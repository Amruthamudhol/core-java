<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="container mt-4">
<h2>Contact</h2>
<form action="contact" method="post">

<pre>
    Name : <input type="text" name="name"/></br>
    Email   : <input type="email" name="email"/></br>
    Phone  : <input type="text" name="phone"/></br>
    Message : <textarea name="message"></textarea>

<input type="submit" value="Send" class="btn btn-primary"/>

</pre>

</form>
<h3 style="color:green">
${message}
</h3>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>

</html>