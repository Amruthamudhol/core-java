
<!DOCTYPE html>
<html>
<head>
    <title>Signup Successful</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            width: 450px;
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px gray;
            text-align: center;
        }

        h1 {
            color: green;
        }

        .details {
            text-align: left;
            margin-top: 25px;
            font-size: 18px;
        }

        .details p {
            padding: 10px;
            background-color: #f5f5f5;
            border-radius: 5px;
        }

        a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 25px;
            background-color: #1677ff;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }

        a:hover {
            background-color: #0056d6;
        }
    </style>
</head>

<body>

<div class="container">

    <h1> Signup Successful</h1>
    <h2>${message}</h2>
    <div class="details">

        <p>
            <strong>User ID:</strong>
            ${signupDTO.userId}
        </p>

        <p>
           <strong>Email:</strong>
            ${signupDTO.email}
        </p>

    </div>
    <a href="SignIn.jsp">Go to Sign In</a>

</div>

</body>
</html>