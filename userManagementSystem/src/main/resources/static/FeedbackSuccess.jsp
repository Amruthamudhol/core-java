
<!DOCTYPE html>
<html>
<head>

    <title>Feedback Submitted</title>
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
            padding: 35px;
            border-radius: 10px;
            box-shadow: 0 0 10px gray;
        }

        h1 {
            text-align: center;
            color: green;
        }

        h2 {
            text-align: center;
            font-weight: normal;
        }

        .details {
            margin-top: 25px;
        }

        .details p {
            padding: 12px;
            background-color: #f1f1f1;
            border-radius: 5px;
            font-size: 17px;
        }

        a {
            display: block;
            width: 150px;
            margin: 25px auto 0;
            padding: 10px;
            text-align: center;
            background-color: #1677ff;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }

    </style>

</head>

<body>

<div class="container">
    <h1> Feedback Submitted</h1>
    <h2>${message}</h2>
    <div class="details">

        <p>
            <strong>Name:</strong>
            ${feedbackDTO.name}
        </p>

        <p>
            <strong>Email:</strong>
            ${feedbackDTO.email}
        </p>

        <p>
            <strong>Mobile:</strong>
            ${feedbackDTO.mobile}
        </p>

        <p>
            <strong>Comment:</strong>
            ${feedbackDTO.comment}
        </p>

    </div>
    <a href="index.html">Back to Home</a>
</div>

</body>
</html>