<!DOCTYPE html>
<html>
<head>
    <title>Sign Up</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body>

<div class="container mt-5">

    <div class="col-md-6 mx-auto">

        <div class="card shadow">

            <div class="card-header bg-primary text-white text-center">
                <h3>Create Account</h3>
            </div>

            <div class="card-body">

                <form action="signup" method="post">
                <h3>${message}</h3>

                    <label class="form-label">userId</label>
                    <input type="text"
                           name="userId"
                           class="form-control mb-3"
                           placeholder="Enter User ID"
                           required>

                    <label class="form-label">email</label>
                    <input type="email"
                           name="email"
                           class="form-control mb-3"
                           placeholder="Enter Email"
                           required>

                    <label class="form-label">password</label>
                    <input type="password"
                    name="password"
                           class="form-control mb-3"
                           placeholder="Enter Password"
                           required>

                    <label class="form-label">confirmPassword</label>
                    <input type="password"
                           name="confirmPassword"
                           class="form-control mb-3"
                           placeholder="Confirm Password"
                           required>

                    <button type="submit" class="btn btn-primary w-100">
                        Signup
                    </button>

                </form>

                <div class="text-center mt-3">
                    Already have an account?
                    <a href="SignIn.jsp">Sign In</a>
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