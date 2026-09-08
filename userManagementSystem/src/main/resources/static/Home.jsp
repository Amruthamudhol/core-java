
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            width: 500px;
            background-color: white;
            padding: 40px;
            text-align: center;
            border-radius: 10px;
            box-shadow: 0 0 10px gray;
        }

        h1 {
            color: #1677ff;
        }

        .user {
            font-size: 22px;
            margin: 25px;
        }

        .message {
            color: green;
            font-size: 18px;
        }

        a {
            display: inline-block;
            margin-top: 25px;
            padding: 10px 25px;
            background-color: #1677ff;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }
    </style>
</head>

<body>

<div class="container">

    <h1>Welcome</h1>

    <div class="user">
        Session User ID:
     <strong>${sessionScope.userId}</strong>
    </div>

    <div class="message">
        ${sessionScope.message}
    </div>

    <a href="index.html">Back to Home</a>

</div>

</body>
</html>