<html>
<head>
    <title>Proverb</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="container mt-5">

<h2>Proverb Form</h2>

<form action="proverb" method="post">
    <input type="text" name="author" class="form-control mb-3" placeholder="Author">
    <input type="text" name="category" class="form-control mb-3" placeholder="Category">
    <input type="text" name="language" class="form-control mb-3" placeholder="Language">
    <textarea name="proverb" class="form-control mb-3" placeholder="Enter Proverb"></textarea>
    <input type="submit" value="Save" class="btn btn-warning">
</form>

 <h4 class="text-success">${message}</h4>
 <h5 class="text-primary">${proverb}</h5>

</body>
</html>