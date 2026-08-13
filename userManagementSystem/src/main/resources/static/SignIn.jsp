<!DOCTYPE html>
<html>
<head>
    <title>Sign In</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body>

<div class="container mt-5">

    <div class="col-md-5 mx-auto">

        <div class="card shadow">

            <div class="card-header bg-warning text-center">
                <h3>Sign In</h3>
            </div>

            <div class="card-body">

                <form action="signin" method="post">
                <h3>${message}</h3>

                    <label class="form-label">User ID</label>
                    <input type="text"
                           name="userId"
                           class="form-control mb-3"
                           placeholder="Enter User ID"
                           required>

                    <label class="form-label">Password</label>
                    <input type="password"
                           name="password"
                           class="form-control mb-3"
                           placeholder="Enter Password"
                           required>

                    <button type="submit" class="btn btn-warning w-100">
                        Sign In
                    </button>

                </form>

                <div class="text-center mt-3">
                    Don't have an account?
                    <a href="Signup.jsp">Sign Up</a>
                </div>

                <div class="text-center mt-2">
                    <a href="index.html">Back to Home</a>
                </div>

            </div>
        </div>

    </div>

</div>

</body>
</html>